// Palindromic substrings
import java.util.*;
import java.lang.*;
import java.io.*;
class Day66
{
public static void main (String[] args) throws java.lang.Exception
{
// your code goes here
Scanner in=new Scanner(System.in);
 int t=in.nextInt();
 while(t-->0){
 String a=in.next();
 String b=in.next();
 int count=0;
 for (int i=0;i<a.length() ;i++ ){
 for(int j=0;j<b.length();j++){
 if(a.charAt(i)==b.charAt(j)){
 count=1;
 break;

 }
 }
 if(count==1){
 break;
 }
 }
 if(count==1){
 System.out.println("Yes");
 }
 else{
 System.out.println("No");
 }
 }
}
}
