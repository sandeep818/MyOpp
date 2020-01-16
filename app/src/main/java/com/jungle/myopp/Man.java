package com.jungle.myopp;

public class Man extends Human {
    private String name;
    private int age;

    public Man(String gender, String name, int age) {
        super(gender);
        this.name = name;
        this.age = age;
    }

    @Override
    public String getGender() {
        return super.getGender();
    }

    @Override
    public void setGender(String gender) {
        super.setGender(gender);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
