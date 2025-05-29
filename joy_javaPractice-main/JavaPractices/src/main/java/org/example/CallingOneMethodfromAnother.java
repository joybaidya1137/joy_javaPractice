package org.example;

import java.util.Scanner;

public class CallingOneMethodfromAnother {

    public void Mathod1(int num1){

        System.out.println("hi i am Mathod1");
        System.out.print("Please mathod2 can you hare me:");
        Mathod2(num1);

    }
    public void Mathod2(int num){
        System.out.println("hi i am Mathod2");
        int add=3;
         num*=20+add;
        System.out.println("Result is: num=num*20+3:" +num);
    }



    public void Mathod3(int n){
        n=n+10;
        System.out.println("Mathod3 Opration result:"+n);

    }
    public void Mathod4(int m){
        int sum=0;
        Mathod3(m);
        sum = 10 +m;
        System.out.println("Mathod3 is call mathod4 Opration result:"+m);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        int num1;
        int Rj=0;
        System.out.print("Enter the 1 number:");
        num = scanner.nextInt();
        System.out.println("\n");
        System.out.print("Enter the 2 number:");
        num1 = scanner.nextInt();

        CallingOneMethodfromAnother obj = new CallingOneMethodfromAnother();

        obj.Mathod1(num1);
        System.out.println("....................................................");
        obj.Mathod2(num);

        System.out.println(".......................................................");
         obj.Mathod3(num);
         obj.Mathod4(num1);
         obj.Mathod4(num);
    }
}
