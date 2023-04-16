//Write a java Program to check if String is a palindrome or not

import java.util.*;
public class Day33 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String str=sc.nextLine();
        String org_str=str;
        int len=str.length();
        String rev="";
        for(int i=len-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
        //System.out.print(rev);
        if (org_str.equals(rev)){
            System.out.println("Palindrome");
        }
        else {
            System.out.println(" NOt a Palindrome");
        }
    }
    
}
