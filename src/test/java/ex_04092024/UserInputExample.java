package ex_04092024;

import java.util.Scanner;

public class UserInputExample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name=sc.nextLine();
        System.out.println("Enter Your Age: ");
       int age= sc.nextInt();
        System.out.println("Hello "+name + " and "+ " your age is "+age +" years ");
    }

}
