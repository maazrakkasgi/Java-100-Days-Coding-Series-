import java.util.Scanner;
class Day3
{
    public static void main (String args[])
    {
        System.out.println("ENter the letter");
        Scanner sc = new Scanner(System.in);
        char l = sc.next().charAt(0);
        int i=l;
        System.out.println("The Asci value of /t"+l+ "is" +i);
    }
}