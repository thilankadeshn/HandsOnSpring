package com.assign.DTO;

/**
 * Created by thilanka on 12/3/15.
 */
public class StudentDTO {
    private Integer StudentId;
    private String studentName;
    private Integer departmentId;
    private Integer advisorId;

    public Integer getStudentId() {
        return StudentId;
    }

    public void setStudentId(Integer studentId) {
        StudentId = studentId;
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

    public Integer getAdvisorId() {
        return advisorId;
    }

    public void setAdvisorId(Integer advisorId) {
        this.advisorId = advisorId;
    }
//    @Override
//    public String toString(){
//        return "StudentDTO{"+"StudentId="+st
//    }
}
