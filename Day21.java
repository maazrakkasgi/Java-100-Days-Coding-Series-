import java.util.Scanner;

public class Day21{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Number");
        int num=sc.nextInt();

        int c=num;
        int rev=0,rem;
        while(num!=0){
            rem=num%10;
            rev=(rev*10)+rem;
            num /=10;

        }
        if (rev==c){
            System.out.println("Palindrome");

        }
        else {
            System.out.println("Not Palindrome");
        }
    }
}
