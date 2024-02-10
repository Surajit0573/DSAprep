import java.util.*;

public class _501_FindModeinBinarySearchTree {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static void inorder(TreeNode root,  HashMap<Integer,Integer>hm) {

        if (root.left != null) {
            inorder(root.left, hm);
        }
        hm.put(root.val,hm.getOrDefault(root.val,0)+1);
        if (root.right != null) {
            inorder(root.right, hm);
        }
    }

    public int[] findMode(TreeNode root) {
       HashMap<Integer,Integer>hm=new HashMap<>();
        inorder(root, hm);
        Set<Integer>keys=hm.keySet();
        ArrayList<Integer> ans=new ArrayList<>();
        int max=1;
        for(Integer key :keys){
            if(max==hm.get(key)){
                ans.add(key);
            }
            else if(hm.get(key)>max){
                ans.clear();
                max=hm.get(key);
                 ans.add(key);
            }
        }
        int[] re=new int[ans.size()];
        for(int i=0;i<re.length;i++){
            re[i]=ans.get(i);
        }
       return re;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        sc.close();
    }
}