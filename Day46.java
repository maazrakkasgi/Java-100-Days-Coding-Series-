//Write Program to find sum of elements in an array
import java.util.Scanner;
public class Day46
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
 int sum = 0;
 for(int i=0; i<arr.length; i++)
 {
 sum = sum + arr[i];
 }
 System.out.print("Sum: "+sum);
 }
}