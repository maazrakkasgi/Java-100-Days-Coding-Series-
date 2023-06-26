//Given 2 integer arrays X and Y of same size. Consider both arrays as vectors and print the sum of maximum scalar product (Dot product) of 2 vectors.

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
class Day55
{
 public static void main (String[] args)
 {
 Scanner sc = new Scanner(System.in);
int n = sc.nextInt();

int arr1[] = new int[n];
for(int i = 0 ; i<n ; i++)
{
arr1[i] = sc.nextInt();
}
int arr2[] = new int[n];
for(int i = 0 ; i<n ; i++)
{
arr2[i] = sc.nextInt();
}
 Arrays.sort(arr1);
 Arrays.sort(arr2);
 int product = 0;
 for(int i=0; i<n; i++)
 product += arr1[i]*arr2[i];
 System.out.print(product);
 }
}