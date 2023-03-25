// Write a program to reverse a given number

import java.util.Scanner;

public class Day14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to reverse: ");
        int number = sc.nextInt();

        int reverseno=0;
        while(number!=0){
            int digit=number%10;
            reverseno =reverseno*10+digit;
            number/=10;
        }System.out.printf("The Reverse no is %d",reverseno);


    }
}
