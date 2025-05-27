package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class If_Ealse {

    public void even(int num1) {
        if (num1 % 2 == 0) {
            System.out.println("the number is even");
        } else
            System.out.println("The number is odd");
    }

    public void check(int num1) {
        if (num1>=0) {
            System.out.println("the number is positive");
        } else if(num1<0){
            System.out.println("The number is negative");
         }
         else{
            System.out.println("The number Zero");
        }
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;

        System.out.println("Enter the Integer number is:");
        num = input.nextInt();

        If_Ealse obj = new If_Ealse();
        obj.even(num);
        obj.check(num);
    }
}
