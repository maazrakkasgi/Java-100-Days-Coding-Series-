//Write a java program to express a number as a sum of two prime numbers


import java.util.Scanner;

public class Day22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num = input.nextInt();
        boolean found = false;
    for (int i=2;i<=num/2;i++){
        if(isprime(i)){
            if(isprime(num-i)){
                System.out.printf("%d can be Expressed as %d + %d",num,i,num-i);
                found=true;
                break;
            }
        }
    }
    if (found==false){
        System.out.printf("%d cannot be expressed as sum of two prime numbers");
    }
    }


        public static boolean isprime(int num){
            boolean check=true;
            for(int i=2;i<=num/2;i++){
                if(num%i==0){
                    check=false;
                    break;
                }
            }
         return check;
        }

}
