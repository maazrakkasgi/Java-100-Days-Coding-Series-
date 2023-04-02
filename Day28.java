//Write a Program to reverse a string.

import java.util.*;
public class Day28
{
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the String ");
String str=sc.nextLine();
StringBuffer r=new StringBuffer(str);
System.out.println(r.reverse());
}
}