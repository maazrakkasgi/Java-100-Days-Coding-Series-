//Given an integer array of size N. Write Program to find whether Arrays are disjoint or not. Two arrays are said to be disjoint if they have no elements in common.
import java.util.*;
class Day54
{
 static boolean DisjointOrNot(int arr1[], int arr2[], int n1, int n2)
 {

 boolean flag = true;
 for (int i=0; i<n1; i++)
 {
 for (int j=0; j<n2; j++)
 {
 if (arr1[i] == arr2[j])
 {
 flag = false;;
 }
 }
 if(flag == false)
 {
 break;
 }
 }
 return flag;
 }

public static void main(String[] args) throws java.lang.Exception
{
Scanner sc = new Scanner(System.in);
int n1 = sc.nextInt();
int arr1[] = new int[n1];
for(int i = 0 ; i<n1 ; i++)
{

arr1[i] = sc.nextInt();
}
int n2 = sc.nextInt();
int arr2[] = new int[n2];
for(int i = 0 ; i<n2 ; i++)
{
arr2[i] = sc.nextInt();
}
if(DisjointOrNot(arr1,arr2,n1,n2)==true)
 {
 System.out.print("Disjoint");
 }
 else
 {
 System.out.print("Not disjoint");
 }
}
}
