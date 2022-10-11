/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author vu
 */
public class Lecturer {

    private int teacherid;
    private String Teachername;

    public Lecturer() {
    }

    public Lecturer(int teacherid, String Teachername) {
        this.teacherid = teacherid;
        this.Teachername = Teachername;
    }

    public int getTeacherid() {
        return teacherid;
    }

    public void setTeacherid(int teacherid) {
        this.teacherid = teacherid;
    }

    public String getTeachername() {
        return Teachername;
    }

    public void setTeachername(String Teachername) {
        this.Teachername = Teachername;
    }

    
}
