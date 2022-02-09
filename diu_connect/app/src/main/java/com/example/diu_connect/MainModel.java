package com.example.diu_connect;

public class MainModel {

    String role,name,turl,email,room,phone;

    MainModel()
    {

    }
    public MainModel(String role, String name, String turl, String email, String room,String phone) {
        this.role = role;

        this.name = name;

        this.turl = turl;
        this.email=email;
        this.room=room;
        this.phone=phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }





    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }





    public String getTurl() {
        return turl;
    }

    public void setTurl(String turl) {
        this.turl = turl;
    }
}
