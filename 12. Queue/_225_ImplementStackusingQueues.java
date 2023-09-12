import java.util.*;

public class _225_ImplementStackusingQueues {
    class MyStack {
           Queue<Integer> full;
            Queue<Integer>empty;
        public MyStack() {
         this.full=new LinkedList<>();
         this.empty=new LinkedList<>();
        }

        public void push(int x) {
            full.add(x);
        }

        public int pop() {
            while(!full.isEmpty()){
                int e=full.remove();
                if(full.isEmpty()){
                    Queue<Integer> temp;
                    temp=empty;
                    empty=full;
                    full=temp;
                    return e;
                }
                empty.add(e);
            }
            return -1;
        }

        public int top() {
            while(!full.isEmpty()){
                int e=full.remove();
                 empty.add(e);
                if(full.isEmpty()){
                    Queue<Integer> temp;
                    temp=empty;
                    empty=full;
                    full=temp;
                    return e;
                }
            }
            return -1;
        }

        public boolean empty() {
        return full.isEmpty();
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        sc.close();
    }
}