//Write a Program to print Length of the string without using strlen() function
import java.util.*;
public class Day30{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the  string");
    String str1=sc.nextLine();
    char ch[]=str1.toCharArray();
    int count=0;
    for (char c:ch){
        count++;
    }
    System.out.println(count);
}
}
