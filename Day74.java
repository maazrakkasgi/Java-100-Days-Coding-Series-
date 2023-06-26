/*You have a grid with N rows and M columns. You have two types of tiles — one of dimensions 2×2 and the other of dimensions 1×1. You want to cover the grid using these two types of tiles in such a way that:

Each cell of the grid is covered by exactly one tile; and
The number of 1×1 tiles used is minimized.
Find the minimum number of 1×1 tiles you have to use to fill the grid. */
import java.util.*;
import java.lang.*;
import java.io.*;
class Day74
{
public static void main (String[] args) throws java.lang.Exception
{
Scanner sc=new Scanner (System.in);
int t=sc.nextInt();
while (t-->0){

 int n=sc.nextInt();
 int m=sc.nextInt();

 if(n%2==0&&m%2==0){
 System.out.println(0);
 }
 else if(n%2==0&&m%2!=0){
 System.out.println(n);
 }
 else if(n%2!=0&&m%2==0){

 System.out.println(m);
 }
 else{
 System.out.println(m+n-1);
 }
}
}
}