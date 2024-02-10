import java.util.*;
public class _232_ImplementQueueusingStacks{

    class MyQueue {

        Stack<Integer>st;
        Stack<Integer>stre;
        public MyQueue() {
            st=new Stack<>();
            stre=new Stack<>();
        }
        
        public void push(int x) {
            st.push(x);
        }
        
        public int pop() {
            if(stre.isEmpty()){
                while(!st.isEmpty()){
                    stre.push(st.pop());
                }
            }
            return stre.pop();
        }
        
        public int peek() {
                if(stre.isEmpty()){
                while(!st.isEmpty()){
                    stre.push(st.pop());
                }
            }
            return stre.peek();
        }
        
        public boolean empty() {
           return stre.isEmpty()&&st.isEmpty(); 
        }
    }
    
public static void main(String args[]){
Scanner sc=new Scanner(System.in);

sc.close();
}
}