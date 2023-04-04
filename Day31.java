import java.util.*;
public class Day31 {
    void toggle(String str){
         String str1="";
        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if( Character.isUpperCase(ch)){
                ch=Character.toLowerCase(ch);
            }
            else if (Character.isLowerCase(ch)){
                ch=Character.toUpperCase(ch);
            }
            str1=str1+ch;

        }
        System.out.println(str1);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Day31 obj=new Day31();
        System.out.println("Enter the String");
        String str=sc.nextLine();
        obj.toggle(str);
    }
    
}
