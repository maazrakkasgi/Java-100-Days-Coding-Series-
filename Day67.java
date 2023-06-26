// Bricks Breaking
import java.util.*;
import java.lang.*;
import java.io.*;
class Day67
{
public static void main (String[] args) throws java.lang.Exception
{
 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 int t = Integer.parseInt(br.readLine().trim());
 while(t-->0){
 String[] input = br.readLine().split(" ");
 int s = Integer.parseInt(input[0]);
 int b1 = Integer.parseInt(input[1]);
 int b2 = Integer.parseInt(input[2]);
 int b3 = Integer.parseInt(input[3]);

 if((b1+b2+b3)<=s){
 System.out.println(1);
 }else if((b1+b2)<=s){
 System.out.println(2);
 }else if((b2+b3)<=s){
 System.out.println(2);
 }else{
 System.out.println(3);
 }
 }
}
}
