import java.util.*;
public class _706_DesignHashMap{

    class MyHashMap {

        public static class Node{
            int k;
            int v;
            Node(int k,int v){
                this.k=k;
                this.v=v;
            }
        }
        private int n=0;
        private int N=4;
        private LinkedList<Node> buckets[]; // N

        @SuppressWarnings("unchecked") //
        public MyHashMap(){
            this.buckets = new LinkedList[4];// it's give an error in some compiler so we use SuppressW....
            for (int i = 0; i < 4; i++) {
                this.buckets[i] = new LinkedList<>();
            }

        }

        private int hashFunction(Integer key) {
            int hc = key.hashCode();
            return Math.abs(hc) % N;// Remainder of Absulte value / size = (0 -> size);
        }

        private int ScarchInLL(Integer key, Integer bi) {
            LinkedList<Node> ll = buckets[bi];
            int di = 0;
            for (int i = 0; i < ll.size(); i++) {
                Node node = ll.get(i);
                if (node.k == key) {
                    return di;
                }
                di++;
            }
            return -1;

        }
        @SuppressWarnings("unchecked") //
        private void rehash() {
            LinkedList<Node> oldBuck[] = buckets;
            buckets = new LinkedList[N * 2];
            N = N * 2;
            for (int i = 0; i < buckets.length; i++) {
                buckets[i] = new LinkedList<>();
            }

            // nodes -> add in new buckets
            for (int i = 0; i < oldBuck.length; i++) {
                LinkedList<Node> ll = oldBuck[i];
                for (int j = 0; j < ll.size(); j++) {
                    Node node = ll.remove();
                    put(node.k, node.v);
                }
            }
        }

        public void put(Integer key, Integer value) {
            int bi = hashFunction(key);
            int di = ScarchInLL(key, bi);
            if (di != -1) {
                Node node = buckets[bi].get(di);
                node.v = value;
            } else {
                buckets[bi].add(new Node(key, value));
                n++;
            }

            double lamda = (double) n / N;
            if (lamda > 2.0) {
                rehash();
            }
        }
    
        public Integer get(Integer key){
            int bi = hashFunction(key);
            int di = ScarchInLL(key, bi);
            if (di != -1) {
                Node node = buckets[bi].get(di);
                return node.v;
            } else {
                return -1;
            }
        }
    
    
        public Integer remove(Integer key){
            int bi = hashFunction(key);
            int di = ScarchInLL(key, bi);
            if (di != -1) {
                Node node = buckets[bi].remove(di);
                n--;
                return node.v;
            } else {
                return null;
            }
        }
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);

sc.close();
}
}