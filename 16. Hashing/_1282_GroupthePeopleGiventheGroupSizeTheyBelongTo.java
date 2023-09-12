import java.util.*;
public class _1282_GroupthePeopleGiventheGroupSizeTheyBelongTo{
  
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        List<List<Integer>> list = new ArrayList<>();
        
        for(int i = 0; i < groupSizes.length; i++) {
            int size = groupSizes[i];
            
            List<Integer> group = map.getOrDefault(size, new ArrayList<>());
            group.add(i);
            map.put(size, group);
            
            if(group.size() == size) {
                list.add(group);
                map.remove(size);
            }
        }
        
        return list;
    }
public static void main(String args[]){
Scanner sc=new Scanner(System.in);

sc.close();
}
}