// Write a java Program to Capitalize the first and last letter of each word of a string

import java.util.*;
public class Day36 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the String");
        String str=sc.nextLine();
       String newstr="";
       String[] arr=str.split("\\s"); // it is used to store in array if it is a sentence
       for(String string:arr){
        int len=string.length();
        String f=string.substring(0, 1);
        String r=string.substring(1,len-1);
        String l=Character.toString(string.charAt(len-1));
        newstr=newstr+f.toUpperCase()+r+l.toUpperCase();

       }
      System.out.println(newstr);



    }
}
