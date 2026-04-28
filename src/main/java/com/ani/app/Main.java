package com.ani.app;

import com.ani.app.model.Student;
import com.ani.app.service.StudentService;

public class Main {
    public static void main(String[] args) {
        StudentService studentService = new StudentService();

        studentService.addStudent(new Student(101, "Ani", 7.5, "ME"));
        studentService.addStudent(new Student(102, "Rani", 3.8, "BE"));
        studentService.addStudent(new Student(103, "Vitthal", 2.9, "BE"));

        studentService.getAllStudents().forEach(System.out::println);
    }
}