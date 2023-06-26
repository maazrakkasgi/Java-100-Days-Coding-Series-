//"Pass or Fail
import java.util.*;
import java.lang.*;
import java.io.*;
class Day57
{
public static void main (String[] args) throws java.lang.Exception
{
int n;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
 int t[]=new int [n];
 int c[]=new int [n];
 int m[]=new int [n];
 int i;
 for(i=0;i<n;i++)
 {
 t[i]=sc.nextInt();
 c[i]=sc.nextInt();
 m[i]=sc.nextInt();
 }
 for(i=0;i<n;i++)
{ if(((c[i]*4)-t[i])>=m[i] )
 {
System.out.println("Pass");
 }
else{
System.out.println("Fail");

 }
 }
}
}
