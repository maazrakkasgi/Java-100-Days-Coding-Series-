//Write a Program to check if two strings are Anagram or not
// v v v important for interview
import java.util.Arrays;
import java.util.*;
public class Day39 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first string");
        String str1=sc.nextLine();

        System.out.println("Enter the second string");
        String str2=sc.nextLine();
        if(str1.length()==str2.length()){
            char[] arr1=str1.toCharArray();
            char[] arr2=str2.toCharArray();

            Arrays.sort(arr1);
            Arrays.sort(arr2);
             boolean result=Arrays.equals(arr1,arr2);
             if(result){
                System.out.println(str1 + " and "+str2+ " is anagram");
             }
             else{
                System.out.println(str1+" and "+str2+" is Not anagram");
             }
        }
        else{
            System.out.println(str1+" and "+str2+" is Not anagram");
        }
    }
}