// Write a program to identify if the number is Perfect number or not

import java.util.Scanner;
public class Day16 {
    public static void main (String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=sc.nextInt();
        int sum=0;
        for (int i=1;i<n;i++){
            if (n%i==0){
                sum=sum+i;

            }
        }
        if (sum==n){
            System.out.println("Perfect number");

        }
        else{
            System.out.println("Not Perfect number");
        }
    }
}
