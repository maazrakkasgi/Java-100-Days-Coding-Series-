import java.util.*;
public class Day37 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Sentence");
        String str=sc.nextLine();
        str=str.toLowerCase();
        for (char ch='a';ch<='z';ch++){
            int count=0;
            for(int i=0;i<str.length();i++){
                if(ch==str.charAt(i)){
                    count++;
                }
            } 
                if(count!=0){
                    System.out .println("The Frequencies of"+"\t"+ch+"\t"+"is"+"\t"+count );
                
            }
        }
    }
    
    
}
