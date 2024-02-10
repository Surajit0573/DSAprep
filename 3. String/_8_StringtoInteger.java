class Solution {
public int myAtoi(String s) {
    if(s.length()==0){
        return 0;
    }
    int i=0;
    while(s.charAt(i)==' '&&i<s.length()){
        i++;
    }
     if(s.length()<=i){
        return 0;
    }
    boolean positive=true;
    if(s.charAt(i)=='-'||s.charAt(i)=='+'){
        if(s.charAt(i)=='-'){
            positive=false;
        }
        i++;
    }
    long ans=0;
        long min=-(long)Math.pow(2,31);
    long max=(long)Math.pow(2,31)-1;

    while((ans>min&&ans<max&&i<s.length())&&(s.charAt(i)-'0'>=0)&&(s.charAt(i)-'0'<=9)){
        ans=(ans*10)+(s.charAt(i)-'0');
        i++;
    }
    if(!positive){
        ans=ans*(-1);
    }

    if(ans<min){
        return (int)min;
    }
    if(ans>max){
        return (int)max;
    }
    return (int)ans;
    
}
}