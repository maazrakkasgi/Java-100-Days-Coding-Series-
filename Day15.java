//Write a program to identify if the number is Strong number or not

import java.util.Scanner;

public class Day15{

    public static void main(String[] args) {
        
        
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isstromg(number)==true){
            System.out.println(" Strong");
        
        }
        else {
            System.out.println("Not Strong");
        }
        
        }
        public static boolean isstromg(int number){
        int originalnum=number;
        int sum=0;
        while(number>0){
            int digit=number%10;
        
     int fact=1;
     
     for(int i=1; i<=digit;i++ ){
        fact=fact*i;

     }
     sum=sum+fact;
     number/=10;
    }
    
     
        if (sum==originalnum){
            return true ;

        }
        else {
            return false;
        }
        
        
    
            
        
    }

}
