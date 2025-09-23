package org.example.introToOOPS;

public class BeginnerStudent extends Student{

    BeginnerStudent() {
        Student student = new Student();
        student.name = "Kumar";
        student.age = 25;
       // student.email = "ganesh150@gmail.com"; can't be accessed
    }
}
