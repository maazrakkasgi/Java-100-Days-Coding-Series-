
import java.util.*;
public class Day40 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the  string");
        String str1=sc.nextLine();

        System.out.println("Enter the substring which has to be replaced");
        String str2=sc.nextLine();

        System.out.println("Enter the substring with which string has to be replaced");
        String str3=sc.nextLine();

        String rplc=str1.replaceAll(str2, str3);
        System.out.println("replaced string "+rplc);
    }
}
        