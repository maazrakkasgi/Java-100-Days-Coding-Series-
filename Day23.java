//Write a program to Replace all 0’s with 1 in a given integer

import java.util.*;
public class Day23 {
    public static  void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        String str=Integer.toString(num);
        String newstr=str.replace('0', '1');
      int newint=Integer.parseInt(newstr);
      System.out.println(newint);


    }
    
}
