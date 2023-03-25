
import java.util.Scanner;

public class Day19 {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Number");
        int num=sc.nextInt();
        int c=num;
        int result=0,rem,n=0;
        while (num!=0)
        {num /=10;
            n++;

        }
        num=c;
        while (num!=0){
            rem=num%10;
            int mul=1;
            for (int i=1;i<=n;i++){
                mul=mul*rem;
            }
            result=result+mul;


            
            num=num/10;


        }
    if (result==c){
        System.out.println("armstrong");

    }
    else {

    System.out.println(" Not armstrong");
    }

}
}