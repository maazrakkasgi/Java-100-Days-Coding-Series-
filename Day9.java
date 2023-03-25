//  Write a program to find Number of digits in an integer

import java.util.Scanner;

public class Day9{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();
        if (num==0){
            System.out.println("number of digit is 1");
        
        }
        else {
        int count=0;

        while(num!=0){

            num =num/10;
            count++;

        }
        System.out.printf("The number of Digit is %d",count);
    }
    }
}
