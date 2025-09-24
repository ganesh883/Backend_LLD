package org.example.introToOOPS;

public class Student {
    public String name;
    int age;//default
    protected String batchName;
    private double psp;
    private String email;


    Student(String name, int age, String email){
        this.name = name;
        this.age = age;
        this.email = email;
    }

    Student (String name){
        this.name = name;
    }

//    Student (String batchName){
//        this.batchName = batchName;
//    }

    Student (int age){
        this.age = age;
    }

    Student (Student student){
        this.name = student.name;
        this.age  = student.age;
        this.email = student.email;
    }


     void attendClass() {
         System.out.println("Student is attending class");
     }

     void bookMockInterview() {
         System.out.println("Booking mock interview");
     }
}
