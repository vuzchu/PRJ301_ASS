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
public class GroupDBContext extends DBContext {

    public ArrayList<Group> listGroup() {
        ArrayList<Group> groups = new ArrayList<>();
        try {
            groups.add(new Group(1, "IOT105-PRJ301", "SONNT5", "PRJ301"));
        } catch (Exception e) {
        }
        return groups;

    }
}
