import java.util.*;

import javax.print.event.PrintJobListener;
public class Test{
   static boolean is_sorted(int arr[]){
        int i;
        for(i=1;i<arr.length;i++){
            if(arr[i-1]>arr[i])
         return false;
        
            }    return true;
        
    }
     public static void main(String[] args) {
        int arr[]={23,34,45,2111,67,69};
       if(is_sorted(arr))
       System.out.println("yes");
       else
       System.out.println("No");
        
        
    }
}