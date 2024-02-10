import java.util.*;

public class _496_NextGreaterElementI {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st = new Stack<>();
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(nums2[nums2.length - 1], -1);
        st.push(nums2[nums2.length - 1]);
        for (int i = nums2.length - 2; i >= 0; i--) {
            while (!st.isEmpty()) {
                if (st.peek() > nums2[i]) {
                    hm.put(nums2[i], st.peek());
                    st.push(nums2[i]);
                    break;
                }
                st.pop();
            }
            if(st.isEmpty()){
                 hm.put(nums2[i],-1);
                 st.push(nums2[i]);
            }
        }
        for(int i=0;i<nums1.length;i++){
            nums1[i]=hm.get(nums1[i]);
        }
        return nums1;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        sc.close();
    }
}