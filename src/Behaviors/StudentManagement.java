package Behaviors;

import Entities.Student;

import java.util.ArrayList;

public class StudentManagement {
    ArrayList<Student> students = new ArrayList<Student>();

    public void addStudent(Student student){
        students.add(student);
    }

    public void deleteStudentById(int id){
        for(Student s: students){
            if(s.getId() == id){
                students.remove(s);
            }
        }
    }

    public void updateStudent(Student student){
        for (Student updateStudent: students) {
            if(updateStudent.getId() == student.getId()){
                updateStudent.setName(student.getName());
                updateStudent.setDateOfBirth(student.getDateOfBirth());
                updateStudent.set_class(student.get_class());
            }
        }
    }

    public Student searchStudentById(int id){
        Student student = null;
        for (Student s: students) {
            if (s.getId() == id){
                student = s;
            }
        }
        return student;
    }

    public void showListStudent(){
        for (Student s: students) {
            System.out.println(s.toString());
        }
    }
}
