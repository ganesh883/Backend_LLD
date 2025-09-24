package org.example.introToOOPS;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Ganesh",25,"ganesh150eee@gmail.com");
        student1.name="Ganesh";
        student1.age = 25;


        Student student2 = new Student(student1);
    }
}
