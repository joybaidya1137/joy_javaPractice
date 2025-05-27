package org.example;

import java.util.Scanner;

 public class Joy {


public  static class Oprators {

    public void add(int num1, double num2) {
        int AddResult = (int) ((double) num1 + num2);

        System.out.println("The summation is: " + AddResult);

    }

    public void sub(int num1, double num2) {
        double Result1 = num1 - num2;
        System.out.println("subtraction: " + Result1);
    }




    public void Mul(int num1, double num2) {
        double Result1 = num1 * num2;
        System.out.println("Multiplication: " + num1 + "*" + num2 + "=" + Result1);
    }



    public void Dev(int num1, double num2) {
        double Result1 = num1 / num2;
        System.out.println("Division: " + Result1);
    }



    public void Mod(int num1, double num2) {
        double Result1 = num1 % num2;

        System.out.println("Modules: " + Result1);
    }



    public void Math(int num1, double num2) {
        double Result2 = Math.min(num1, num2);
        double Result3 = Math.max(num1, num2);
        double Result4 = Math.abs(num2);
        double Result5 = Math.pow(num1, num2);
        System.out.println("min number is : " + Result2);
        System.out.println("Max number is : " + Result3);
        System.out.println("Square number is:" + Result4);
        System.out.println(" Power number is :" + Result5);

    }
}

    public static class Loops{
        public void forloop(){
            System.out.println("Hi i am for loop");
        }
    }



    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num1;
        double num2;

        System.out.print("Enter fast number is :");
        num1 = input.nextInt();
        System.out.print("Enter 2nd Number is:");
        num2 = input.nextDouble();


// comment1: uses the full class name (Joy.Oprators) to correctly access static nested classes,
    /*  Joy.Oprators obj = new Joy.Oprators();
        obj.add(num1, num2);
        obj.sub(num1, num2);
        obj.Mul(num1, num2);
        obj.Dev(num1, num2);
        obj.Mod(num1, num2);

        obj.Math(num1, num2);


       Joy.Loops loop =new Joy.Loops();
        loop.forloop();
*/


//comment2: tries to use the nested classes directly without qualifying with Joy, which will cause errors
        Oprators obj = new Oprators();
        obj.add(num1, num2);
        obj.sub(num1, num2);
        obj.Mul(num1, num2);
        obj.Dev(num1, num2);
        obj.Mod(num1, num2);

        obj.Math(num1, num2);


        Loops loop = new Loops();
        loop.forloop();

    }

}