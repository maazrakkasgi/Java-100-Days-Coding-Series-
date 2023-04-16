//Write a Program to print Non-repeating characters in a string

import java.util.*;
public class Day38 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Sentence");
        String str=sc.nextLine();
        str=str.toLowerCase();
        for (char ch='a';ch<='z';ch++){
            int count=0;
            for(int i=0;i<str.length();i++){
                if(ch==str.charAt(i)){
                    count++;
                }
            } 
                if(count==1){
                    System.out .println(ch);
                
            }
        }
    }
    
    
}

