//Write a java Program to Remove vowels from a string

import java.util.*;
public class Day32 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the String");
        String str=sc.nextLine();
        String s1=str.replaceAll("[aeiouAEIOU]", "");
        System.out.println(s1);

    }
}
