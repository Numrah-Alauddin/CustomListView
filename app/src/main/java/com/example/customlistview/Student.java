package com.example.customlistview;

public class Student {

    int student_image;
    String name;
    String id;

    public Student(int student_image, String name, String id) {
        this.student_image = student_image;
        this.name = name;
        this.id = id;
    }

    public int getStudent_image() {
        return student_image;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public void setStudent_image(int student_image) {
        this.student_image = student_image;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }
}
