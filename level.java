import java.util.*;

public class level {
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
        public static Node buildTree(int nodes[]){
            if(nodes[index]==-1){
                return null;
            }

            Node newNode=new Node(nodes[index]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);
            return newNode;
        }
        public static void levelorder(Node root){
            if(root==null){
                return;
            }
            Queue<Node> q= new LinkedList<>();
            q.add(root);
            q.add(null);

            while(!q.isEmpty()){
                Node CurNode=q.remove();
                if(CurNode==null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;

                    }
                    else{
                        q.add(null);
                    }

                }
                else{
                    System.out.print(CurNode.data+" ");
                    if(CurNode.left!=null){
                        q.add(CurNode.left);
                    }
                    if(CurNode.right!=null){
                        q.add(CurNode.right);
                    }

                }
            }
        }
    }
    public static void main(String args[]){
        int nodes[]={1,2,3,-1,-1,4,5,-1,-1,6};
        BinaryTree tr= new BinaryTree();
        Node root=tr.buildTree(nodes);
        levelorder(root);

}    }
    

