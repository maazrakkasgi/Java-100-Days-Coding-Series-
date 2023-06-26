/*You have prepared four problems. The difficulty levels of the problems are A1?,A2?,A3?,A4? respectively. A problem set comprises at least two problems and no two problems in a problem set should have the same difficulty level. A problem can belong to at most one problem set. Find the maximum number of problem sets you can create using the four problems. */
import java.util.*;
 class Day100 {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 int t = sc.nextInt();
 for (int i = 0; i < t; i++) {
 int a=sc.nextInt();
 int b=sc.nextInt();
 int c=sc.nextInt();
 int d=sc.nextInt();

 HashSet<Integer> set=new HashSet<>();
 set.add(a);
 set.add(b);
 set.add(c);
 set.add(d);
 if (set.size()==4)
 System.out.println(2);
 else if(set.size()==1)
 System.out.println(0);
 else if (set.size()==2) {
 if ((a^b^c^d)==0)
 System.out.println(2);
 else
 System.out.println(1);
 }
 else if (set.size()==3)
 System.out.println(2);
 }
 }
 }