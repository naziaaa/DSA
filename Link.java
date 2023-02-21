public class Link{

   Node head;

    class Node{
        int  data,
        Node next;

       Node(int data){
        this.data=data;
        this.next=null;

       }
    }
    public void addf(int data){
        Node nn=new Node();
        if(head==null) { 
            head=nn;
            return;}
            nn.next=head;
            head=nn;

    }

    public void addl(int data){
        Node nn=new Node();
        if(head==null) { 
            head=nn;
            return;}
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
        temp.next=nn;
        nn.next=null;   

    }
    public void s
}