package com.assign.service;

/**
 * Created by thilanka on 11/30/15.
 */

import com.assign.DAO.StudentDao;
import com.assign.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import java.util.List;

@Service("studentService")
public class StudentService implements StudentServiceInt {

    @Autowired
    @Qualifier("studentDao")
    private StudentDao studentDao;

    public StudentDao getStudentDao() {
        return studentDao;
    }

    //    @Autowired
    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public void addStudent(Student student) {

        getStudentDao().insert(student);
    }

    public void removeStudent(Student student) {
        getStudentDao().removeStudent(student);
    }

    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public List<Student> fetchAllStudents() {
        StudentDao studentDao = getStudentDao();
        return studentDao.selectAll();

    }
//    public void fetchAllStudents() {
//        System.out.println("All students fetched");
//
//    }
}