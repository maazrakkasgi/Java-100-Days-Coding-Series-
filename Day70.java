// Given an array, rotate the array by one position in clock-wise direction.
import java.util.Scanner;
public class Day70
{
public static void main(String[] args) {

 Scanner sc = new Scanner(System.in);
 int N = sc.nextInt();
 int [] arr = new int [N];

 for (int i = 0; i < N; i++) {
 arr[i] = sc.nextInt();
 }
 for(int i = 0; i < 1; i++){
 int j, last;
 last = arr[arr.length-1];

 for(j = arr.length-1; j > 0; j--){
 arr[j] = arr[j-1];
 }
 arr[0] = last;
 }

 System.out.println();
 for(int i = 0; i< arr.length; i++){
 System.out.print(arr[i] + " ");
 }
 }
} 
