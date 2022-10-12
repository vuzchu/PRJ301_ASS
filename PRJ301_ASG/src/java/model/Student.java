/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author vu
 */
public class Student {

    private String studentid;
    private String studentcode;
    private String studentsurname;
    private String studentmiddlename;
    private String studentgivenname;
    private String studentemail;

    public Student() {
    }

    public Student(String studentid, String studentcode, String studentsurname, String studentmiddlename, String studentgivenname, String studentemail) {
        this.studentid = studentid;
        this.studentcode = studentcode;
        this.studentsurname = studentsurname;
        this.studentmiddlename = studentmiddlename;
        this.studentgivenname = studentgivenname;
        this.studentemail = studentemail;
    }

    public String getStudentid() {
        return studentid;
    }

    public void setStudentid(String studentid) {
        this.studentid = studentid;
    }

    public String getStudentcode() {
        return studentcode;
    }

    public void setStudentcode(String studentcode) {
        this.studentcode = studentcode;
    }

    public String getStudentsurname() {
        return studentsurname;
    }

    public void setStudentsurname(String studentsurname) {
        this.studentsurname = studentsurname;
    }

    public String getStudentmiddlename() {
        return studentmiddlename;
    }

    public void setStudentmiddlename(String studentmiddlename) {
        this.studentmiddlename = studentmiddlename;
    }

    public String getStudentgivenname() {
        return studentgivenname;
    }

    public void setStudentgivenname(String studentgivenname) {
        this.studentgivenname = studentgivenname;
    }

    public String getStudentemail() {
        return studentemail;
    }

    public void setStudentemail(String studentemail) {
        this.studentemail = studentemail;
    }

    @Override
    public String toString() {
        return "Student{" + "studentid=" + studentid + ", studentcode=" + studentcode + ", studentsurname=" + studentsurname + ", studentmiddlename=" + studentmiddlename + ", studentgivenname=" + studentgivenname + ", studentemail=" + studentemail + '}';
    }

}
