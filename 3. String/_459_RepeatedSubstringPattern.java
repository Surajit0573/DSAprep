import java.util.*;
public class _459_RepeatedSubstringPattern {


    public boolean repeatedSubstringPattern(String s) {
        
        for(int i=1;i<=s.length()/2;i++){
            int start=0;
            int end=i;
            int length=end-start;
            if(s.length()%length==0){
                boolean chack=true;
            while(end<s.length()){
                int nextstart=end;
                int nextend=end+length;
                if(!s.substring(start, end).equals(s.substring(nextstart, nextend))){
                    chack=false;
                }
                start=nextstart;
                end=nextend;
            }
            if(chack){
                return true;
            }
            }
        }
        return false;
    }

public static void main(String args[]){
Scanner sc=new Scanner(System.in);

sc.close();
}
}