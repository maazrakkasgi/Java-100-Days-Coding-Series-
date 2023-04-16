//Write a Program to Remove brackets from an algebraic expression

import java.util.*;
public class Day34 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the algebraic expression");
        String str=sc.nextLine();
        String s1=str.replaceAll("[()]", "");
        System.out.println(s1);

    }
}
