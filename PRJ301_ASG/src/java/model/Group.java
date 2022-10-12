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
public class Group {
    private int groupid;
    private String groupname;
    private String instructorid;
    private String courseid;
    //private Student StudentID;
    private ArrayList<Session> sessions = new ArrayList<>();
    private ArrayList<StudentGroup> studentgroups = new ArrayList<>();

    public Group() {
    }

    public Group(int groupid, String groupname, String instructorid, String courseid) {
        this.groupid = groupid;
        this.groupname = groupname;
        this.instructorid = instructorid;
        this.courseid = courseid;
    }

    public int getGroupid() {
        return groupid;
    }

    public void setGroupid(int groupid) {
        this.groupid = groupid;
    }

    public String getGroupname() {
        return groupname;
    }

    public void setGroupname(String groupname) {
        this.groupname = groupname;
    }

    public String getInstructorid() {
        return instructorid;
    }

    public void setInstructorid(String instructorid) {
        this.instructorid = instructorid;
    }

    public String getCourseid() {
        return courseid;
    }

    public void setCourseid(String courseid) {
        this.courseid = courseid;
    }

    public ArrayList<Session> getSessions() {
        return sessions;
    }

    public void setSessions(ArrayList<Session> sessions) {
        this.sessions = sessions;
    }

    public ArrayList<StudentGroup> getStudentgroups() {
        return studentgroups;
    }

    public void setStudentgroups(ArrayList<StudentGroup> studentgroups) {
        this.studentgroups = studentgroups;
    }

    @Override
    public String toString() {
        return "Group{" + "groupid=" + groupid + ", groupname=" + groupname + ", instructorid=" + instructorid + ", courseid=" + courseid + ", sessions=" + sessions + ", studentgroups=" + studentgroups + '}';
    }

    
    
    
    
    
}
