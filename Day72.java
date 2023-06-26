/* In this problem you will have to implement a simple editor. The editor maintains the content of a string S and have two following functions:
 

"+ i x": insert a string x into the current string S after the i'th character of the S (we use 1-indexing in this problem). When i equals to 0 it mean we add x at the beginning of S.
"? i len": Print the sub-string of length len starting at position i'th of S.
At the beginning, the editor holds an empty string. There will be Q queries of the two types described above. */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.StringBuilder;
public class Day72
{
public static void main(String aa[]) throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
StringBuilder st=new StringBuilder();
int q=Integer.parseInt(br.readLine());
for(int i=0;i<q;i++)
{
String s[]=br.readLine().split(" ");
if(s[0].equals("+"))
{
int start=Integer.parseInt(s[1]);
String sub=s[2];
 st.insert(start, sub);
}else{
int start=Integer.parseInt(s[1])-1;
int last=Integer.parseInt(s[2])-1;
String subt=st.substring(start, start+last+1);
System.out.println(subt);
}
}

}
}

