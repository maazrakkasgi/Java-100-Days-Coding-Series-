import java.util.Scanner;

public class Day8 {
    public static void main(String[] args){
        System.out.println("Enter the value of a,b,c");
        Scanner sc =new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        double d=b*b-4*a*c;
        if (d<0){
            System.out.println("No real roots");
        }
        else if (d==0){
            double root=-b/(2*a);
            System.out.println("Single root"+root);
            
        }
        else{
            double root1=(-b+Math.sqrt(d))/(2*a);
            double root2=(-b-Math.sqrt(d))/(2*a);

        
        System.out.println("The roots are"+ root1 + root2);

    }
    
}
}
