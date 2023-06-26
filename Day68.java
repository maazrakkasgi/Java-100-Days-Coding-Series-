// you will be given queries. Each query is of one of the following three types: :

//Add an element to the set. :

//Delete an element from the set. (If the number is not present in the set, then do nothing). :

//If the number is present in the set, then print "Yes"(without quotes) else print "No"(without quotes).
import java.util.*;
public class Day68
{
public static void main(String[] args)
{
 Scanner sc = new Scanner(System.in);
 int t = sc.nextInt();
 Set<Integer> s = new LinkedHashSet<Integer>();
 for(int i=1 ; i<=t ; i++)
 {
 int n = sc.nextInt();
 int a = sc.nextInt();
 if(n==1){
 s.add(a);
 }
 else if(n==2){
 if(s.contains(a))
 s.remove(a);
 }
 else if(n==3){
 if(s.contains(a))
 System.out.println("Yes");
 else
 System.out.println("No");
 }

 }
}
}