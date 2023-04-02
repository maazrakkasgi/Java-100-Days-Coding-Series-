//Write a Program to print Length of the string without using strlen() function
import java.util.*;
public class Day30{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the  string");
    String str1=sc.nextLine();
    int count=0;
    for(int i=str1.length()-1;i>=0;i--)
{ count++;


    }
System.out.println(count);
}
}
