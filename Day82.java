/*You are given N binary strings of length N each. You need to find a binary string of length N which is different from all of the given strings.

 */
import java.util.*;
import java.lang.*;
import java.io.*;
class Day82
{
public static void main (String[] args) throws java.lang.Exception
{
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
while(t-->0)
{
 int n=sc.nextInt();
 sc.nextLine();
 String ans="";
 for(int j=0;j<n;j++)
 {
 String s = sc.nextLine();
 if(s.charAt(j)=='0')
 ans+="1";
 else
 ans+="0";
 }
 System.out.println(ans);


}
}
}
