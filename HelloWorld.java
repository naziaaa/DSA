  Naive Approach
class HelloWorld {
    static int sec_largest(int arr[]){
        int largest=getlargest(arr);
        int res=-1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=largest){
                if(arr[i]>res)
                res=arr[i];
            }
        }
        return res;
    }
   static int getlargest(int arr[] ){
               int res=arr[0];
               for(int i=0;i<arr.length;i++)
               {
                if(arr[i]>res)
                res=arr[i];
               }
               return res;
     }
    public static void main(String args[]) {
        int arr[]={1,32,45,3,6};
        System.out.println(sec_largest(arr));
        
    }
}
class HelloWorld{
    static int sec_largest(int arr[]){
        int res=Integer.MIN_VALUE,largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>largest)
            {res=largest;
            largest=arr[i];
            }
            else if(arr[i]>res && arr[i]!=largest)
            res=arr[i];
      
        }
        return res;
    }
public static void main(String args[]) {
    int arr[]={1,32,45,37,6};
    System.out.println(sec_largest(arr));
    
}
}