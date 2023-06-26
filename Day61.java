//Chess Format 
import java.util.*;
import java.lang.*;
import java.io.*;
class Day61

{
public static void main (String[] args) throws java.lang.Exception
{
Scanner sc = new Scanner(System.in);
int t = sc.nextInt();
for(int i = 0;i<t;i++)
{
 int a = sc.nextInt();
 int b = sc.nextInt();
 int sum = 0;
 sum = a+b;
 if(sum<3)
 {
System.out.println("1");
 }
 else if(sum>=3 && sum<=10)
 {
System.out.println("2");
 }
 else if(sum>=11 && sum<=60)
 {
System.out.println("3");
 }
 else
 {
System.out.println("4");
 }
}
}

}
