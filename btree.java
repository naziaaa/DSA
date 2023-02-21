public class btree{
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
         public static Node buildtree(int nodes[]){
            index++;
            if(nodes[index]==-1){
                return null;
            }
            Node newNode=new Node(nodes[index]);
            newNode.left=buildtree(nodes);
            newNode.right=buildtree(nodes);
            return newNode;
                 }
    }
    public static void main(String args[]){
        int nodes[]={1,2,3,-1,-1,4,-1,5,-1,-1,6};
        BinaryTree tr=new BinaryTree();
        Node root=tr.buildtree(nodes);  
        System.out.println(root.data);

    }
}