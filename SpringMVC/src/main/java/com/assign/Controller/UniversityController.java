package com.assign.Controller;

import com.assign.DTO.StudentDTO;
import com.assign.commons.Response;
import com.assign.model.Student;
import com.assign.service.StudentServiceInt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by thilanka on 12/3/15.
 */

@Controller
@RequestMapping("/universitySMS")
public class UniversityController {

    @Autowired
    @Qualifier("studentService")
    private StudentServiceInt studentService;

    @RequestMapping(value="/viewAllStudents",method = RequestMethod.POST)
    @ResponseBody
    public Response<List<Student>> getStudents(HttpServletRequest request){

        Response<List<Student>> response = new Response<List<Student>>();
        try{
            List<Student> students=studentService.fetchAllStudents();
            response.setSuccess(true);
            response.setResult(students);
        }catch(Exception e){
            response.setSuccess(false);
            System.out.println("Error occured in Controller while fetching data");
        }
        return response;
    }

    @RequestMapping(value="/addStudents",method = RequestMethod.POST)
    @ResponseBody
    public Response<Student> addStudents(HttpServletRequest request,@RequestBody(
            required = false) StudentDTO studentDTO){

        Student newStudent=new Student();

        newStudent.setStudentId(studentDTO.getStudentId());
        newStudent.setStudentName(studentDTO.getStudentName());
        newStudent.setDepartmentId(studentDTO.getDepartmentId());
        newStudent.setAdvisorID(studentDTO.getAdvisorId());

        Response<Student> response = new Response<Student>();
        try{
            studentService.addStudent(newStudent);
            response.setSuccess(true);
            response.setResult(newStudent);
        }catch(Exception e){
            response.setSuccess(false);
            System.out.println("Error occured in Controller while fetching data");
        }
        return response;
    }





}
