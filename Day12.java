//Write a program to find Sum of digits of a number

import java.util.Scanner;

public class Day12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int sum=0;
        while (n!=0){
            int digit=n%10;
            sum =sum+digit;
            n=n/10;
        }
        System.out.printf("The sum of the number is %d",sum);

    }
}
