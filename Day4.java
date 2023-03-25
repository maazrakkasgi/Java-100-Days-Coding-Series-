import java.util.Scanner;
class Day4
{
    public static void main (String args[])
    {
        System.out.println("ENter the Number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n<0){
        System.out.println("Negative Number");
        }
        else if (n==0){
            System.out.println("Niether positive nor Negative");
        
        }
        else{
            System.out.println(" Positive Number");
        }
    }
}