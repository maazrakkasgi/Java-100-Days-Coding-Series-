/*You have a binary string S of length N. In one operation you can select a substring of S and reverse it. For example, on reversing the substring [2,4]S[2,4] for S=11000, we change 11000→10010.

Find the minimum number of operations required to sort this binary string.
It can be proven that the string can always be sorted using the above operation finite number of times. */
import java.util.*;
import java.lang.*;
import java.io.*;
class Day81
{
public static void main (String[] args) throws java.lang.Exception
{
 Scanner scan = new Scanner(System.in);
 int times = scan.nextInt();

 while(times-- > 0){
 int val = scan.nextInt();
 scan.nextLine();

 String s = scan.nextLine();
 int count = 0;
 for(int i = s.length(); i >=2 ;i--){
 if(s.substring(i-2, i).equals("10"))
 count++;
 }
 System.out.println(count);
 }
}
}
