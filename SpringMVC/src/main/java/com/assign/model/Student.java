package com.assign.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by thilanka on 11/30/15.
 */

@Entity
@Table(name="T_TH_STUDENT")
public class Student implements Serializable{

    @Id
//    @GeneratedValue
    @Column(name = "S_ID")
    private Integer studentId;

    @Column(name = "S_NAME")
    private String studentName;

    @Column(name="DEP_ID")
    private Integer departmentId;

    @Column(name="ADVISOR_ID")
    private Integer advisorID;

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public Integer getAdvisorID() {
        return advisorID;
    }

    public void setAdvisorID(Integer advisorID) {
        this.advisorID = advisorID;
    }
}
