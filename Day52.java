//Given an integer array of size N, write a program to reverse the array;
import java.util.*;
class Day52
{
 static void Reverse(int arr[], int n)
 {
 int temp;
 for(int i = 0 ; i<n/2 ; i++)
 {
 temp = arr[i];
 arr[i] = arr[n-1-i];
 arr[n-1-i] = temp;

 }
 }
public static void main(String[] args) throws java.lang.Exception
{
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int arr[] = new int[n];
for(int i = 0 ; i<n ; i++)
{
arr[i] = sc.nextInt();
}
 Reverse(arr,n);
 for(int i = 0 ; i<n ; i++)
 {
 System.out.print(arr[i] + " ");
 }
}
}
