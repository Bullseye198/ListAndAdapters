package com.example.listadapter;

public class Person {

    private String name;
    private String birthday;
    private String sex;

    public Person(String name, String birthday, String sex) {
        this.birthday = birthday;
        this.name = name;
        this.sex = sex;

    //alt + insert and generate Getter and Setter:
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
