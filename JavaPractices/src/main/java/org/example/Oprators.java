package org.example;

import java.util.Scanner;

public class Oprators {

    public void add(int num1, double num2) {
        int AddResult = (int) ((double)num1 + num2);

        System.out.println("The summation is: "+AddResult);

    }

    public void sub(int num1,double num2){
       double Result1 = num1 - num2;
        System.out.println("subtraction: "+Result1);
    };


    public void Mul(int num1, double num2){
        double Result1 = num1 * num2;
        System.out.println("Multiplication: " + num1+ "*" +num2 + "=" +Result1);
    };
    public void Dev(int num1 ,double num2){
        double Result1 = num1 /num2;
        System.out.println("Division: "+Result1);
    };
    public void Mod(int num1 ,double num2){
        double Result1 = num1 % num2;
        System.out.println("Modules: "+Result1);
    };


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num1;
        double num2;

        System.out.print("Enter fast number is :");
        num1 = input.nextInt();
        System.out.print("Enter 2nd Number is:");
        num2 = input.nextDouble();

        Oprators obj = new Oprators();
        obj.add(num1,num2);
        obj.sub(num1,num2);
        obj.Mul(num1,num2);
        obj.Dev(num1,num2);
        obj.Mod(num1,num2);

    }
}
