import java.util.Scanner;
class Day5
{
    public static void main (String args[])
    {
        System.out.println("ENter the Number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n%2==0){
        System.out.println("Even");
        }
       
        else{
            System.out.println(" Odd ");
        }
    }
}