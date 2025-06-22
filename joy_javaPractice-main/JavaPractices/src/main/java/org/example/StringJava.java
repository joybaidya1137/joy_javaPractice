package org.example;

import java.util.Scanner;

public class StringJava {

    public void String() {
        String j1 = "joy";
        String j2 = new String("joy");
        char[] j3 = {'a', 'b', 'c', 'd'};// Charcter types array can be  call String.

        System.out.println(j1);
        System.out.println(j2);
        System.out.println(j3); // print abcd

        int StingLenght = j1.length();
        System.out.println("j1 String length is = " + StingLenght);
        // variable can be compare
        if (j1 == j2) {
            System.out.println("j1 and j2 is Equals");
        } else
            System.out.println("Not Equals");
        // value can be Compare
        if (j1.equals(j2)) {
            System.out.println("j1 and j2 is Equals");
        } else System.out.println("Not Equals");

        boolean con = j1.contains("jo");
        System.out.println(con);
    }


    public void StringMathodsClass(){
        String fastname="Joy";
        String lastname= "Baidya";

        String fullname=fastname + lastname;
        System.out.println("Full Name: "+fullname);

        System.out.println("Uppercase: "+fullname.toUpperCase());
        System.out.println("Lowercase: "+fullname.toLowerCase());

        boolean Start = fastname.startsWith("J");
        boolean start1 =lastname.startsWith("B");
        System.out.println(Start);
        System.out.println(start1);

        boolean end = fastname.endsWith("y");
        boolean end1 =lastname.endsWith("a");
        System.out.println(end);
        System.out.println(end1);
        boolean empty = fastname.isEmpty();
        System.out.println(empty);
    }


    public void stringDemo(){
        String s3 = "    Bangladesh is my country      ";
        System.out.println(s3);

        String s4 =s3.trim();// remove suru and seser space
        System.out.println(s4);

        char ch = s3.charAt(0);
        System.out.println(ch);

        int value =s3.codePointAt(1);
        System.out.println(value);

        int pos = s3.indexOf("is");
        System.out.println(pos);

        pos = s3.lastIndexOf("n");



    }


    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter User input: ");

        StringJava obj = new StringJava();
        obj.String();
        obj.StringMathodsClass();
        obj.stringDemo();
    }
}
