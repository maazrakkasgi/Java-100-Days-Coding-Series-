/*There are N students in a class, where the i-th student has a score of Ai?.

The i-th student will boast if and only if the number of students scoring less than or equal Ai? is greater than the number of students scoring greater than Ai?.

Find the number of students who will boast.

Input Format

The first line contains T - the number of test cases. Then the test cases follow.
The first line of each test case contains a single integer N - the number of students.
The second line of each test case contains N integers 1,2,…,A1?,A2?,…,AN? - the scores of the students.
Output Format

For each test case, output in a single line the number of students who will boast. */
import java.util.*;
import java.lang.*;
import java.io.*;
class Day71
{
public static void main (String[] args) throws java.lang.Exception
{
Scanner s= new Scanner(System.in);
int t= s.nextInt();
while(t-->0){
 int n = s.nextInt();
 int a[] = new int[n];
 for(int i=0;i<n;i++){
 a[i] = s.nextInt();
 }
 Arrays.sort(a);
 int cnt=n/2;
 while(cnt>0 && a[cnt-1]==a[cnt]){

 cnt--;
 }
 System.out.println(n-cnt);
}
}
}
