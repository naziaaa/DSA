
public class quebyarray {
    // Queue class
   static class Queue{
        static int ar[];
        static int size;
        static int rear=-1;
   // queue constructor
        Queue(int n){
            ar= new int[n];
            this.size=n;
    }
    //is queue empty or not
    public static boolean isEmpty(){
        return rear==-1;
    }
    // add an item in queue
    public static void enqueue(int data){
        if(rear==size-1){
            System.out.println("Queue is full");
            return;
        }
        rear++;
        ar[rear]=data;
    }
    //add an item in dequeue
    public static int dequeue(){
        if(isEmpty()) {
            System.out.println("Empty Queue");
            return-1;
        }
        int front=ar[0];
        for(int i=0;i<rear;i++){
            ar[i]=ar[i+1];
        }
        rear--;
        return front;
    }
    // peek the first element
    public static int peek(){
        if(isEmpty()) {
            return-1;
        }
        int front=ar[0];
        return front;
        
    }
}
// main function

    public static void main(String[] args) {
        Queue q=new Queue(7);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.dequeue();
        }
        
    }
}
