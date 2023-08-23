import java.util.*;
public class _344_ReverseString {
    public void reverseString(char[] s) {
        for(int i=0;i<s.length/2;i++){
           
            char temp=s[i];
            s[i]=s[s.length-i-1];
            s[s.length-i-1]=temp;
            
        }
    }
public static void main(String args[]){
Scanner sc=new Scanner(System.in);

sc.close();
}
}