public class trial {
    public static void main(String args[]) {
        int arr[]={1,23,45,32};
        int n=arr.length;
        int temp=arr[0];
        for(int i=1;i<n;i++)
        {
            arr[i-1]=arr[i];
        }
        arr[n-1]=temp;
        for(int i=0;i<n;i++)
        System.out.println(arr[i]);


        
    }
    
}
