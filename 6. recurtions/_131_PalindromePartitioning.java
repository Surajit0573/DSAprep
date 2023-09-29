import java.util.*;
public class _131_PalindromePartitioning{

    public static boolean isPalindrome(String s) {
        if(s.length()<2){
        return true;
        }

        for(int i=0;i<=s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-i-1)){
                return false;
            }
        }
        return true;
    }

    public static void recurtion(String s,List<String>list,List<List<String>> ans){
        if(s.length()==0){
            List<String>list2=new ArrayList<>(list);
            ans.add(list2);
            return;
        }
    
        for(int i=1;i<=s.length();i++){
            if(isPalindrome(s.substring(0, i))){
                list.add(s.substring(0, i));
                recurtion(s.substring(i,s.length()),list,ans);
                list.remove(list.size()-1);
            }
        }
    }


    public List<List<String>> partition(String s) {
        List<String>list=new ArrayList<>();
        List<List<String>> ans=new ArrayList<>();
        recurtion(s, list, ans);
        return ans;
    }
public static void main(String args[]){
Scanner sc=new Scanner(System.in);

sc.close();
}
}