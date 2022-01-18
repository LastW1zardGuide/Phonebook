package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            int n;
            System.out.println("Hello! This is phonebook!");
            System.out.println("1. To print all");
            System.out.println("2. To add");
            System.out.println("3. To search");
            System.out.println("4. To delete");
            System.out.println("5. To quit");
            n = sc.nextInt();
            if (n == 5) {
                break;
            } else{
                switch (n){
                    case 1:
                        Application.toInform();
                        break;
                    case 2:
                        Application.addFunction();
                        break;
                    case 3:
                        System.out.println("Name: ");
                        Application.toSearch(sc.next());
                        break;
                    case 4:
                        System.out.println("Id: ");
                        Application.students.remove(sc.nextInt());
                        break;
                    default:
                        System.out.println("Error!Try Again!");
                }
            }
        }
    }
}
