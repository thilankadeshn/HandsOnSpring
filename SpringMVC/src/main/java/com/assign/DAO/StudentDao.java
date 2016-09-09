package com.assign.DAO;

import com.assign.model.Student;

import javax.persistence.EntityManager;
import java.util.List;

/**
 * Created by thilanka on 11/30/15.
 */

public interface StudentDao {

    public EntityManager getEntityManager();

    public void setEntityManager(EntityManager entityManager);

    public void insert(Student student);

//    public Student findStudent()

    public void removeStudent(Student student);

    public List<Student> selectAll();

}
