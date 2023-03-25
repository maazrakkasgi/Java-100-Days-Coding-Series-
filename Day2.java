//Write a program to identify if the character is an alphabet or not.

import java.util.Scanner;
class Day2
{
    public static void main (String args[])
    {
        System.out.println("ENter the letter");
        Scanner sc = new Scanner(System.in);
        char l = sc.next().charAt(0);
        if (!((l>='A' && l<='Z')||(l>='a'&&l<='z'))){
            System.out.println("not a Alphabet");
        }
        else
        {
            System.out.println("Alphabet");
        }
    }
}
