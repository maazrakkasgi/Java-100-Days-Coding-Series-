//New Tablet
import java.util.*;
import java.lang.*;
import java.io.*;
class Day65
{
public static void main (String[] args) throws java.lang.Exception
{
Scanner scanner = new Scanner(System.in);
 int t = scanner.nextInt();
 while (t-->0) {
 int n = scanner.nextInt();
 int b = scanner.nextInt();
 int size = 0;
 for (int j = 0; j < n; j++) {
 int w = scanner.nextInt();
 int h = scanner.nextInt();
 int p = scanner.nextInt();
 if (p <= b) {
 if (w * h > size) {

 size = w * h;
 }
 }
 }
 if (size!=0){
 System.out.println(size);
 }else {
 System.out.println("no tablet");
 }
 }
}
}