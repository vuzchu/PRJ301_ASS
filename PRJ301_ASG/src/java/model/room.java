/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author vu
 */
public class room {
    private int roomid;
    private String roomname;

    public room() {
    }

    public room(int roomid, String roomname) {
        this.roomid = roomid;
        this.roomname = roomname;
    }

    public int getRoomid() {
        return roomid;
    }

    public void setRoomid(int roomid) {
        this.roomid = roomid;
    }

    public String getRoomname() {
        return roomname;
    }

    public void setRoomname(String roomname) {
        this.roomname = roomname;
    }

    @Override
    public String toString() {
        return "room{" + "roomid=" + roomid + ", roomname=" + roomname + '}';
    }
    
    
}
