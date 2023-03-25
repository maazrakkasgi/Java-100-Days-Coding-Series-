//Write a program to find Number of days in a given month of a given year

import java.util.Scanner;
public class Day7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the month  and Year value");
        int month=sc.nextInt();
        int year=sc.nextInt();
        if((year%4==0 && year%100!=0 && month==2) || (year %400==0 && month==2)) {
            System.out.println("29 days");
        }
        else if (month==2){
            System.out.println("28 days");

        }
        else if (month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12){
            System.out.println("31 days");
        }
        else{
            System.out.println("30 days");
        }

        }
    
    
}
