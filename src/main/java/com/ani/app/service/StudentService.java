package com.ani.app.service;

import com.ani.app.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentService {
    private final List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> getAllStudents() {
        return new ArrayList<>(students);
    }

    public List<Student> findByCourse(String course) {
        List<Student> filteredStudents = new ArrayList<>();
        for (Student student : students) {
            if (student.getCourse() != null && student.getCourse().equalsIgnoreCase(course)) {
                filteredStudents.add(student);
            }
        }
        return filteredStudents;
    }

    public List<Student> findAboveCgpa(double cgpa) {
        List<Student> filteredStudents = new ArrayList<>();
        for (Student student : students) {
            if (student.getCgpa() > cgpa) {
                filteredStudents.add(student);
            }
        }
        return filteredStudents;
    }
}