 // Write Program to find whether the numbers of an array be made equal
 import java.util.*;
public class Day56
{
public static boolean convert(int b[], int n)
{
for (int i = 0; i < n; i++)
{
while (b[i] % 2 == 0)
b[i] /= 2;
while (b[i] % 3 == 0)
b[i] /= 3;
}
for (int i = 1; i < n; i++)
if (b[i] != b[0])
{
return false;
}
return true;
}
public static void main (String[] args)
{
Scanner sc = new Scanner(System.in);
int n,i;
System.out.println("Enter the number of elements in array: ");
n = sc.nextInt();
int a[] = new int[n];
System.out.println("Enter elements: ");
for(i=0; i<n; i++)
{
a[i] = sc.nextInt();
}
if (convert(a, n))
System.out.println("Yes, possible");
else
System.out.println("No, it's not possible");
}
}
