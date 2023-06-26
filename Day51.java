//Given an integer array of size N, write a program to sort the array;
    
}

import java.util.*;

class Day51
{
public static void main(String[] args) throws java.lang.Exception
{
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int arr[] = new int[n];
for(int i = 0 ; i<n ; i++)
{
arr[i] = sc.nextInt();
}
Arrays.sort(arr);
for(int i = 0 ; i<n ; i++)
{
System.out.print(arr[i] + " ");
}
}
}