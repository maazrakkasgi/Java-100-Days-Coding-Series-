//Bucket Filling
import java.util.*;
import java.lang.*;
import java.io.*;
class Day58
{
public static void main (String[] args) throws java.lang.Exception
{
int n;
Scanner sc=new Scanner(System.in);

n=sc.nextInt();
int []k=new int [n];
int []x=new int [n];
int []r=new int [n];
int i;
for(i=0;i<n;i++)
{
 k[i]=sc.nextInt();
 x[i]=sc.nextInt();
 r[i]=k[i]-x[i];
}
for(i=0;i<n;i++)
{
System.out.println(r[i]=k[i]-x[i]);
}
}
}