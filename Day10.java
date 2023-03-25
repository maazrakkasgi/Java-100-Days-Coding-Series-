import java.util.Scanner;
public class Day10 {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        if (n==0){
            System.out.println("the factorial of number is 1");
        }
        else if(n<0){
            System.out.println("Invalid input");
        }
        else{
            
            int fact=1;
            for (int i=1; i<=n; i++){
                fact=fact*i;}
                System.out.println("Facortial of number is "+fact);


            
        }
    }
}
