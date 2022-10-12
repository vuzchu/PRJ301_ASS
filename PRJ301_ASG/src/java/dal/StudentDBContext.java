/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.util.ArrayList;
import model.Group;
import model.Student;

/**
 *
 * @author vu
 */
public class StudentDBContext extends DBContext {



    public ArrayList<Student> list() {
        ArrayList<Student> students = new ArrayList<>();
        try {
            
            students.add(new Student("1", "He150798", "Chu" , "Quang" , "Vu", "vucq"));
            students.add(new Student("2", "HE150567", "Nguyen" , "Thanh" , "Long", "longnt"));
            students.add(new Student("3", "He150785", "Vu" , "Nam" , "son", "sonvn"));     
        } catch (Exception e) {
            
        }
        return students;
    }
}
