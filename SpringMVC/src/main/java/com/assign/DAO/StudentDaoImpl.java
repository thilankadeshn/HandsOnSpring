package com.assign.DAO;

import com.assign.model.Student;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

/**
 * Created by thilanka on 12/1/15.
 */

@Repository("studentDao")
@ImportResource("classpath:spring-config.xml")
@Transactional (propagation = Propagation.REQUIRED)
public class StudentDaoImpl implements StudentDao {

    private static final String SELECT_QUERY = "select p from Student p";

    @PersistenceContext
    private EntityManager entityManager;
//    private EntityManagerFactory entityManagerFactory;

//    EntityManager entityManager = entityManagerFactory.createEntityManager();

    public EntityManager getEntityManager() {
        return entityManager;
    }

    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void insert(Student student) {
//        EntityManager entityManager=getEntityManager();
        Student chkStudent=entityManager.find(Student.class,student.getStudentId());
        if(chkStudent==null) {
//            System.out.println("DB availability of this student:"+entityManager.contains(student));
            System.out.println("chkStudent:"+chkStudent);
            System.out.println("adding student");
            entityManager.persist(student);
        }else{
            System.out.println("Error:Student already contains");
        }
    }

    public void removeStudent(Student student){
        Student chkStudent=entityManager.find(Student.class,student.getStudentId());
        if(chkStudent!=null){
            entityManager.remove(chkStudent);
        }else{
            System.out.println("Error:No student with ID"+student.getStudentId());
        }
    }

    public List<Student> selectAll() {
//        EntityManager entityManager=getEntityManager();
//        System.out.println("\n\n"+"Entity manager="+entityManager+"\n\n");

        Query query = entityManager.createQuery(SELECT_QUERY);
        List<Student> students = (List<Student>) query.getResultList();
        return students;
    }
}
