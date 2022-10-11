/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author vu
 */
public class Course {

    private String courseid;
    private String coursename;
    private int NumberOfslot;

    public Course() {
    }

    public Course(String courseid, String coursename, int NumberOfslot) {
        this.courseid = courseid;
        this.coursename = coursename;
        this.NumberOfslot = NumberOfslot;
    }

    public String getCourseid() {
        return courseid;
    }

    public void setCourseid(String courseid) {
        this.courseid = courseid;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public int getNumberOfslot() {
        return NumberOfslot;
    }

    public void setNumberOfslot(int NumberOfslot) {
        this.NumberOfslot = NumberOfslot;
    }

    @Override
    public String toString() {
        return "Course{" + "courseid=" + courseid + ", coursename=" + coursename + ", NumberOfslot=" + NumberOfslot + '}';
    }

}
