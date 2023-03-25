// Write a program to find the Quadrants in which coordinates lie
import java.util.Scanner;
public class Day6
{
public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the X and Y value");
    int X=sc.nextInt();
    int Y=sc.nextInt();
    if (X>0 && Y>0 ){
        System.out.println("X an Y belongs to First Quadrant");
    }
    else if (X<0 && Y>0 ){
        System.out.println("X an Y belongs to Second  Quadrant");
    }

    else if (X<0 && Y<0 ){
        System.out.println("X an Y belongs to Third  Quadrant");
    }
    else if (X>0 && Y<0 ){
        System.out.println("X an Y belongs to Fourth  Quadrant");
    }
    else if (X==0 && Y==0 ){
        System.out.println("X an Y belongs to Origin");
    }



}


}
