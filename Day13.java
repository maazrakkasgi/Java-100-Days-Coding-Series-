// Write a program to find Sum of N natural numbers

import java.util.Scanner;
public class Day13{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        if (n==0){
            System.out.println("the sum of number is 0");
        }
        else if(n<0){
            System.out.println("Invalid input");
        }
        else{
            
            int sum=0;
            for (int i=0; i<=n; i++){
                sum=sum+i;}
                System.out.println(" sum of number is "+sum);


            
        }
    }
}
