package com.company;

import java.util.Scanner;

public class Student {
    private static int counter = 0;
    private String name;
    private String number;
    private int id;
    private int age;

    Student() {
        id = counter++;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getNumber() {
        return number;
    }

    public void setAge(int age) {
        while (true) {
            if (age < 150 && age > 0) {
                this.age = age;
                break;
            } else {
                System.out.println("Error!");
                Scanner sc = new Scanner(System.in);
                age = sc.nextInt();
            }
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(String number) {
        while (true) {
            if (number.length() < 13) {
                this.number = number;
                break;
            } else {
                System.out.println("Error!");
                Scanner sc = new Scanner(System.in);
                number = sc.next();
                }
            }
        }
    }
