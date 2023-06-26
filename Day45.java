//Write Program to find smallest and largest element in an array

import java.util.Scanner;
public class Day45
{
 public static void main(String args[])
 {
 int n;
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter the size of the array: ");
 n = sc.nextInt();
 int[]arr = new int[n];
 System.out.println("Enter the array elements: ");
 for(int i = 0; i < n; i++)
 {
 arr[i] = sc.nextInt();
 }
 int large = arr[0], small=arr[0];
 for(int i=0; i<arr.length; i++)

 {
 if(small > arr[i])
 small = arr[i];
 if(large <arr[i])
 large = arr[i];
 }
 System.out.println("Smallest Number: "+small);
 System.out.println("Largest Number: "+large);
 }
}

