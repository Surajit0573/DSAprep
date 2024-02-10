import java.util.*;
public class _2125_NumberofLaserBeamsinaBank{

    public int numberOfBeams(String[] bank) {
        int last=0;
        int count=0;
        for(int i=0;i<bank.length;i++){
            int curr=0;
            for(int j=0;j<bank[i].length();j++){
                if(bank[i].charAt(j)=='1'){
                    count+=last;
                    curr++;
                }
            }
            if(curr!=0){
            last=curr;
            }
        }
        return count;
    }

public static void main(String args[]){
Scanner sc=new Scanner(System.in);

sc.close();
}
}