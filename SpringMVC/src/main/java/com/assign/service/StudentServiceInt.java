package com.assign.service;

import com.assign.DAO.StudentDao;
import com.assign.model.Student;

import java.util.List;

/**
 * Created by thilanka on 12/4/15.
 */
public interface StudentServiceInt
{
    public StudentDao getStudentDao() ;
    public void setStudentDao(StudentDao studentDao);

    public void addStudent(Student student) ;
    public void removeStudent(Student student);
    public List<Student> fetchAllStudents() ;
}
