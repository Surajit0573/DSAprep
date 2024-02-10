import java.util.*;
public class _151_ReverseWordsinaString{

    public String reverseWords(String s) {
        ArrayList<String>arr=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            int j=i+1;
            if(j<s.length()&&s.charAt(i)!=' '){
                while(s.charAt(j)!=' '){
                    j++;
                }
                arr.add(s.substring(i,j));
                i=j;
            }
        }
        String ans="";
        for(int i=arr.size()-1;i>=0;i--){
            ans=ans+arr.get(i)+" ";
        }
        return ans.substring(0, ans.length()-1);
    }
public static void main(String args[]){
Scanner sc=new Scanner(System.in);

sc.close();
}
}