package org.example;

import java.util.Scanner;

public class DigitReversalProgram {
    public void ReversesFor(int num,int rev){
                                             // 123/10=12 2nd 12/10 = 1      3rd = 1/10=0
        for (;num!=0; num/=10) {
            int digit =num%10;// 123%10=3 2nd 12%10=2       3rd 1%10=1
            rev=rev*10+digit; // 0+3=3     2nd 3*10+2 =32     3rd 32*10+1=321
        }
        System.out.println("The Revers of number is for ForLoops:"+rev);

    }


    public void ReversesWhile(int num,int rev){
        System.out.println("\n");
        while(num!=0) {
            int digit=num%10;// 123%10=3 2nd 12%10=2       3rd 1%10=1
            rev=rev*10+digit; // 0+3=3     2nd 3*10+2 =32     3rd 32*10+1=321
            num/=10;          // 123/10=12 2nd 12/10 = 1      3rd = 1/10=0
        }
        System.out.println("The Revers of number is for while loops:"+rev);
    }

    public void ReversesDoWhile(int num, int rev){
        System.out.println("\n");
       do {
           int digit = num%10;// 123%10=3 2nd 12%10=2       3rd 1%10=1
           rev=rev*10+digit; // 0+3=3     2nd 3*10+2 =32     3rd 32*10+1=321
           num/=10;          // 123/10=12 2nd 12/10 = 1      3rd = 1/10=0
        }while(num!=0);
        System.out.println("The Revers of number is for DoWhileLoops:"+rev);
    }


    public  int ReversesReturn(int num){
        int rev=0;
        do {
            int digit = num%10;
            rev=rev*10+digit;
            num/=10;
        }while(num!=0);

        return rev;
    }

    public void SumDigit(int num ,int rev){
        int digit=0;
        int sum=0;
        while(num!=0){
            digit=num%10;
            sum= sum+digit;// sum digits
            rev=rev*10+digit;   //reverse number (num%10 == digit)
            num=num/10;
        }

        System.out.println("Summation of digit:"+sum);
        System.out.println("Reverse Digit:"+rev);

        int Rev=rev;
        int DigitRev=0;
        int sumdigit=0;
        while(Rev!=0){
            DigitRev = Rev%10;
            sumdigit+=DigitRev;
            Rev/=10;
        }

        System.out.println("Summation of reversDigits:"+sumdigit);
    }


    public static void main(String[] args) {
        int num;
        int rev=0;
        System.out.print("Enter number digit:");
        Scanner scanner = new Scanner(System.in);
        num=scanner.nextInt();
         
        DigitReversalProgram obj = new DigitReversalProgram();
        obj.ReversesFor(num,rev);
        obj.ReversesWhile(num,rev);
        obj.ReversesDoWhile(num,rev);
        System.out.println(" useing return function call Reversed with Do-While Loop: " + obj.ReversesReturn(num));
         obj.SumDigit(num,rev);
    }
}
