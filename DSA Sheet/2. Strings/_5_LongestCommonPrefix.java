import java.util.*;

public class _5_LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        String ans="";
        Arrays.sort(strs);
       for(int i=0;i<strs[0].length();i++){
        boolean flag=true;
        char ch=strs[0].charAt(i);
        for(int j=1;j<strs.length;j++){
            if(ch!=strs[j].charAt(i)){
                flag = false;
            }
        }
        if(flag){
            ans=ans+ch;
        }else{
            break;
        }
       }

        return ans;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        sc.close();
    }
}