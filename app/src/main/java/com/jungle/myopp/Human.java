package com.jungle.myopp;

public class Human {
    private String gender;

    public Human(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return "You are a : "+gender;
    }

    public void setGender(String gender) {
        this.gender = gender +"human";
    }
}
