import java.util.*;

public class stackbyll {
   static class Stack{
       static ArrayList<Integer> st=new ArrayList<>();
        public static boolean isEmpty(){
            return st.size()==0;
        }
        public static void push(int data){
    
            st.add(data);
        }
        public static int pop(){
            if(isEmpty()) return -1;
            int top=st.get(st.size()-1);
            st.remove(st.size()-1);
            return top;

        }
        public static int peek(){
            if(isEmpty()) return -1;
            int top=st.get(st.size()-1);
            return top;
            
        }
    }
    public static void main(String[] args) {
        Stack s =new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
