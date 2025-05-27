package org.example;

import java.util.Scanner;

public class TypesOfLoops {

    public void ForLoop(int num){

        System.out.print("The Numbers are: ");
        for(int i =0; i<=num; i++){
            if(i == num){
                System.out.print(i);
            } else {
                System.out.print(i + ",");
            }
        }

        System.out.println("\n");
        System.out.print("Even numbers: ");
        for(int i =0; i<=num; i+=2){
            System.out.print(i+",");
        }

        System.out.println("\n");
        System.out.print("Odd number is: ");
        for(int i =1; i<=num; i+=2){
            System.out.print(i+",");
        }
    }


    public void WhileLoop(int n){
        System.out.println("\n");
        int i=0;
        System.out.print("While loops Even number is: ");

        while(i<=n){
          if(i%2==0) {
              if(i<n){
                  System.out.print(i+",");
              }else
                  System.out.print(i);
          }
          i++;
        }
    }

    public void DoWhileLoop(int m) {
        System.out.println("\n");
        System.out.println("Welcome to Do While Loop");
        int i = 0;
        int sum=0;
        int odd=0;
        do {
            if(i%2==0) {
              sum=sum+i;
            }else{
               odd=odd+i;
            }
            i++;
        } while(i<=m);
        System.out.println("Summation of Even number is:"+sum);
        System.out.println("Summation of Odd number is:"+odd);
    }


    public void forEachLoop(){
        System.out.println("\n");
        System.out.println("print Name is:" );
        String[] names = {"joy","Ripa","Sabuj","Nirob"};

        for(String N:names){
            System.out.println(N);
        }

        System.out.println("\n");
        System.out.println("print Character is:" );

        char[] Ch = {'A','B','C','E','F'};
        for(char C:Ch){
            System.out.println(C);
        }

        System.out.println("\n");
        System.out.println("print Number is:" );

        int[] num = {10,20,21,23};
        for(int s:num){
            System.out.println(s);
        }


    }



    public static void main(String[] args) {
        int num1 , num2;
        Scanner  scanner = new Scanner(System.in);
        System.out.print("Enter integer  number1 :");
        num1 = scanner.nextInt();
        System.out.println("The number is:"+num1);

        System.out.print("Enter integer  number2 :");
        num2 = scanner.nextInt();
        System.out.println("The number is:"+num2);



        TypesOfLoops obj = new TypesOfLoops();

        obj.ForLoop(num1);
        obj.WhileLoop(num2);
        obj.DoWhileLoop(num2);
        obj.forEachLoop();

    }
}
