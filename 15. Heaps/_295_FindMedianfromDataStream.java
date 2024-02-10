import java.util.*;
public class _295_FindMedianfromDataStream {

    class MedianFinder {
         private PriorityQueue<Integer> small;
           private PriorityQueue<Integer> large;
            private boolean even;

    public MedianFinder() {
         small = new PriorityQueue<>(Collections.reverseOrder());
         large = new PriorityQueue<>();
    even = true;
    }
      
        
        public double findMedian() {
            if (even)
                return (small.peek() + large.peek()) / 2.0;
            else
                return small.peek();
        }
        
        public void addNum(int num) {
            if (even) {
                large.offer(num);
                small.offer(large.poll());
            } else {
                small.offer(num);
                large.offer(small.poll());
            }
            even = !even;
        }

    }

public static void main(String args[]){
Scanner sc=new Scanner(System.in);

sc.close();
}
}