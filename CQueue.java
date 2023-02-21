public class CQueue {                    // CIRCULAR QUEUE
   static class Queue{
        static int ar[];
        static int rear=-1,front=-1;
        static int size;
        Queue(int n){
            ar=new int[n];
            this.size=n;
        }
        //Check whether queue is empty or not
        public static boolean isEmpty(){
            return rear==-1 && front==-1;
        }
        // add element into circular queue
    public static void add(int data){
        if((rear+1)%size==front) {
            System.out.println("Queue is full");
            return;
        }
        if(front==-1) front=0;  //Single element
        rear=(rear+1)%size; 
        ar[rear]=data;
    }
    // remove element from queue
    public static int remove(){
        if(isEmpty()) return -1;
        int res=ar[front];
        if(rear==front) rear=front=-1; // single element
        else front=(front+1)%size;   
        return res;
    }
    // peek element of queue
    public static int peek(){
        if(isEmpty()) return -1;
        return ar[front];
    }
        }
    public static void main(String[] args) {
        Queue q=new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
        
    }
}
