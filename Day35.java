//Write a Program to Count the sum of numbers in a string
import java.util.*;
public class Day35 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the String");
        String str=sc.nextLine();
       int sum=0;
       for(int i=0;i<str.length();i++){
        if(Character.isDigit(str.charAt(i))){
            sum=sum+Character.getNumericValue(str.charAt(i));
        }
       } 
       System.out.println(sum);
 
    }
}