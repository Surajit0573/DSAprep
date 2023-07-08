import java.util.*;

public class _4_ConsecutiveChar {

    public static String removeConsecutiveCharacter(String S) {
        for(int i=1;i<S.length();i++){
            if(S.charAt(i)==S.charAt(i-1)){
                S=S.substring(0, i)+S.substring(i+1);
                i--;
            }
        }
        return S;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println(removeConsecutiveCharacter("aaaaaaaa"));
        sc.close();
    }
}