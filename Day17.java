//Write a program to find the Factors of a number

import java.util.Scanner;
public class Day17{
    public static void main (String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=sc.nextInt();
    
        for (int i=1;i<=n;i++){
            if (n%i==0){
                System.out.println(i);

            }
            
        }
        
    }
}

