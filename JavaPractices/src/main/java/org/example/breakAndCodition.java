package org.example;

import java.util.Scanner;

public class breakAndCodition {

    public void Break(int num){
        System.out.println("print numbers:");
        for(int i=0;i<=num;i++){
            if(i==10){
                System.out.println("\n");
                System.out.println("The break number is:"+i);
                break;
            }
            if(i!=9) {
                System.out.print(i + ",");
            }else
                System.out.println(i);
        }
    }

    public void Continue(int num){
        System.out.println("\n");
        System.out.println("The number without continue number: " );
        for(int i=1;i<=num;i++){
            if(i==10){
                continue;
            }
            if (i!=num) {
                System.out.print(i + ",");
            }else
                System.out.print(i);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num;
        num=scanner.nextInt();

        breakAndCodition obj = new breakAndCodition();
        obj.Break(num);
        obj.Continue(num);

    }
}
