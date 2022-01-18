package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Application {
    static  ArrayList<Student> students = new ArrayList<Student>();

public static void addFunction(){
    Scanner sc = new Scanner(System.in);
    Student student = new Student();
    System.out.println("Name: ");
    student.setName(sc.next());
    System.out.println("Age: ");
    student.setAge(sc.nextInt());
    System.out.println("Number: ");
    student.setNumber(sc.next());
    students.add(student);
}

public static void toSearch(String name){
    for (int i = 0;i < students.size();i++){
        if (students.get(i).getName().equals(name)){
            System.out.println("Id: " + students.get(i).getId() + "\n Name: " + students.get(i).getName() + "\n Number: " + students.get(i).getNumber());
        }
    }
}

public static void toInform(){
    for (int i = 0;i < students.size();i++){
    System.out.println("Id: " + students.get(i).getId() + " " + "Name: " + students.get(i).getName() + " " +"Age: " + students.get(i).getAge() +" " + "Number: " + students.get(i).getNumber());
    }
}
}