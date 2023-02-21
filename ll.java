
public class ll {
    Node head;
    // NODE

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    // 1. add the element at first pos
    public void addf(int data){
        Node nn=new Node(data);
        if(head==null){
            head=nn;
            return;
        }
        nn.next=head;
        head=nn;
    }
    // 2. add the element at last
    public void addl(int data){
        Node nn=new Node(data);
        if(head==null){
            head=nn;
            return;
        }
        Node cn=head;
        while(cn.next!=null){
            cn=cn.next;
        }
        cn.next=nn;
        nn.next=null;

    }
    // 3. print the linkedlist
    public void printlist(){
        if(head==null){
            System.out.print("LL is null");
        }
        Node cn = head;
        while(cn != null){
            System.out.print(cn.data + "->");
            cn=cn.next;
        }
        System.out.println("NULL");

    }

    // 4. Delete the first element from list
    public void deletef() {
        if(head==null){
            System.out.println("No Node found to be deleted");
            return;
        }
        head=head.next;
    }
    // 5. Delete the element from last
    public void deletel(){
        if(head==null){
            System.out.println("List is Empty");
            return;
        }

        if(head.next==null){
            head=null;
            return;
        }
        Node sln=head;
        Node ln=head.next;
        while(ln.next!=null){
            ln=ln.next;
            sln=sln.next;
        }
        sln.next=null;
    }
   // 6. reverse the linked list-by iteration
  public void reverseIter(){
    if(head==null || head.next==null) return ;
    Node prevNode=head;
    Node curNode=head.next;
    while(curNode != null){
        Node nextNode=curNode.next;
        curNode.next=prevNode;
        prevNode=curNode;
        curNode=nextNode;
    }
    head.next=null;
    head=prevNode;
  }
    // 7. reverse the list- by recursion
    public Node reverseRecurisve(Node head){
        if(head==null || head.next==null){         // divide the ll into 2 parts-first and the rest, reverse the rest and then link the first acc.
            return head;
        }
        Node newNode=reverseRecurisve(head.next);
        head.next.next=head;
        head.next=null;
        return newNode;
    }
    // 8. Remove nth node from last
    public Node removenth(Node head,int n){
        if(head.next==null) {
            return null;
        }
        //8.1 find the size. 
        int size=0;
        Node cn=head;
           while(cn!=null)
           {
            cn=cn.next;
            size++;
           }

        // 8.2 if n=size of list, then we will return head.next
        if(n==size)
        {
            return head.next;
        }

           // 8.3 find the prev node to the nth node given by (size-n);
        int index=size-n,i=1;
        Node prevNode=head;
          while(i<index)
          {
            prevNode=prevNode.next;
            i++;
           }
        prevNode.next=prevNode.next.next;
        return head;
    }

    
    //9. Check whether the linkedlist is palindrome or not     
   /* 3 steps: 1.divide ll into 2 parts from middle            O(N/2)
    *          2.2nd half reverse                              O(N/2)
               3.compare the first half with second half       O(N/2)=O(N/2)
   */
  public Node reverse(Node head){
    if(head==null && head.next==null) return head;
    Node newNode=reverse(head.next);
    head.next=head;
    head.next=null;
    return newNode;

  }
  public boolean ispalindrome(Node head){
    if(head==null || head.next==null) return true;
    Node slow=head,fast=head;
    while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next;
    }
    slow.next=(reverse(slow.next)); 
    slow=slow.next;
    Node dummy=head;
    while(slow!=null){
        if(dummy.data != slow.data) return false;
        dummy=dummy.next;
        slow=slow.next;
    }
    return true;


  }


    // main function
    public static void main(String[] args) {
        ll list =new ll();        list.addf(1);
        list.addf(1);
        list.addl(2);
        list.addf(1);
        list.printlist();
        list.printlist();
       
    }
}

