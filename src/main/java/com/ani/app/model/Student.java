package com.ani.app.model;

public class Student {
    private int id;
    private String name;
    private double cgpa;
    private String course;

    public Student() {
    }

    public Student(int id, String name, double cgpa, String course) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
        this.course = course;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", cgpa=" + cgpa + ", course=" + course + "]";
    }
}