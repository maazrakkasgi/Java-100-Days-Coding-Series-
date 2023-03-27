//Write a program to print Pyramid pattern using stars
import java.util.*;
public class Day24 {
    public static void main (String args []){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the number of rows");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=n;j>i;j--){
                System.out.print(" ");

            }
            for(int k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
    
}

/*
 // Write a java program to print Pyramid of difference of 2 pattern using stars

import java.util.*;
public class Day24 {
    public static void main (String args []){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the number of rows");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=n;j>i;j--){
                System.out.print(" ");

            }
            for(int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    
}

 */
