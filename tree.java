import java.util.*;
public class tree{
     static class Node{
        int data;
        Node left,right;

        Node(int data){
            this.data=data;
            this.left=null;     
            this.right=null;
        }
    }
    static class BinaryTree{

     static int index=-1;
     public static Node buildTree(int nodes[]) {
     index++;
     if(nodes[index]==-1){
            return null;
     }

     Node newNode=new Node(nodes[index]);
     newNode.left=buildTree(nodes);
     newNode.right=buildTree(nodes);
     return newNode;

     }

     }
     public static void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
     }
     public static void postorder(Node root){
        if(root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.println(root.data+" ");
     }
     public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
     }
public static void levelorder(Node root){
    if(root==null){
        return;
    }
    Queue<Node> q=new LinkedList<>();
    q.add(root);
    q.add(null);


    while(!q.isEmpty()){
        Node currNode=q.remove();
        if(currNode==null){
            System.out.println();
            if(q.isEmpty()){
                break;
            }
            else{
                q.add(null);
            }

        }
        else{
            System.out.print(currNode.data+" ");
            if(currNode.left!=null){
                q.add(currNode.left);
            }
            if(currNode.right!=null){
                q.add(currNode.right);
            }

        }
    }
}
    public static int CountofNodes(Node root){
        if(root==null){
            return 0;
        }
        int LeftNode=CountofNodes(root.left);
        int RightNode=CountofNodes(root.right);
        return LeftNode+RightNode+1;
    }  
    public static int SumofNodes(Node root){
        if(root==null){
            return 0;
        }
        int leftsum=SumofNodes(root.left);
        int rightsum=SumofNodes(root.right);
        return leftsum+rightsum+root.data;
    }  
    public static int Height(Node root){
        if(root==null){
            return 0;
        }
        int leftheight=Height(root.left);
        int rightheight=Height(root.right);
        int myheight=Math.max(leftheight, rightheight);
        return myheight+1;
    }
    public static int diameter(Node root){
        if(root==null) return 0;
        int d1=diameter(root.left);
        int d2=diameter(root.right);
        int d3=Height(root.left)+Height(root.right)+1;

        return Math.max(d3,Math.max(d1, d2));
    }
    static class TreeInfo{
        int ht;
        int diam;

        TreeInfo(int ht, int diam){
            this.ht=ht;
            this.diam=diam;
        }
    }
    public static TreeInfo diameter2(Node root){
        if(root==null){
            return new TreeInfo(0, 0);
        }
        TreeInfo left=diameter2(root.left);
        TreeInfo right=diameter2(root.right);
         
        int myHeight=Math.max(left.ht,right.ht)+1;

        int diam1=left.diam;
        int diam2=right.diam;
        int diam3=left.ht+right.ht+1;

        int mydiam=Math.max(diam3, Math.max(diam2,diam1));

        TreeInfo res=new TreeInfo(myHeight, mydiam);
        return res;

    }
public static void main(String args[]){
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tr=new BinaryTree();
        Node root=tr.buildTree(nodes);
        System.out.print(diameter2(root).diam);
    }
}