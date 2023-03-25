import java.util.Scanner;
class Day1
{
    public static void main (String args[])
    {
        System.out.println("ENter the letter");
        Scanner sc = new Scanner(System.in);
        char l = sc.next().charAt(0);
        if (l=='A' || l=='E' || l=='I' || l=='O'|| l=='U' || l=='a' || l=='e'|| l=='i'|| l=='o'|| l=='u' ){

        

        
            System.out.println("Vowel");
          
        }
        else if (!((l>='A' && l<='Z')||(l>='a'&&l<='z'))){
            System.out.println("Invalid");
        }
        else
        {
            System.out.println("Consonant");
        }
    }
}