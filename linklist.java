public class linklist {
    Node head;
    class Node{
        String data;
        Node next;
         
        Node(String data){
            this.data=data;
            this.next=null;
        }
    }
    public void buildlist(String data){
        Node nn=new Node(data);
        if(head==null) {
            head=nn;
            return;} 
        nn.next=head;
        head=nn;
    }
    public void print(){
        if(head==null){
            System.out.println("List is empty");
        }
        Node cn=head;
        while(cn!=null){
            System.out.print(cn.data + "->");
            cn=cn.next;
        }
        System.out.println("NULL");
    }
    public Node reverseRecur(Node head){
        if(head==null || head.next==null){
            return head;
        }
        Node nn=reverseRecur(head.next);
        head.next.next=head;
        head.next=null;
        return nn;
    }

    public static void main(String[] args) {
        linklist list=new linklist();
        list.buildlist("linkedlist");
 
        list.buildlist("is");
    
        list.buildlist("this");
    
        
        list.buildlist("hey");
        list.print();
        list.head=list.reverseRecur(list.head);
        list.print();

    }
}
