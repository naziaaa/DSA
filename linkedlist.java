import java.util.*;
class linkedlist{

    public static void main(String[] args) {
        
        LinkedList<String> list=new LinkedList<>();
        list.addFirst("I");
        list.add("am");
        list.add("Linkedlist");
        System.out.print(list);
        list.addLast("Framework");
        System.out.println(list.size());

        for(int i=0;i<list.size();i++){
            if(list.get(i)=="I")
            System.out.println(i);
        }

        list.removeFirst();
        System.out.println(list);

        list.removeLast();
        System.out.println(list);

        list.remove(1);
        System.out.println(list);

    }
}