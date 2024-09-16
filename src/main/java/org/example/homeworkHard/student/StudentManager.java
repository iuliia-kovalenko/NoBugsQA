package org.example.homeworkHard.student;

import java.util.ArrayList;
import java.util.Objects;

public class StudentManager{

    private ArrayList<Student> students = new ArrayList<Student>();


    public void addStudent(Student student) {
        this.students.add(student);
    }



    public void printAllStudents () {
        for (Student student : students) {
            student.print();
        }
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void removeStudentById(String id) {
        Student foundStudent = null;
        for(Student student: students) {
            if(Objects.equals(student.getId(), id)) {
               foundStudent = student;
            }
        }

        students.remove(foundStudent);
     }


}
