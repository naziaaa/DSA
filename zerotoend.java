public class zerotoend {
    
        static int[] zero(int arr[]){
            int count=0;
            for(int i=0;i<arr.length;i++)
            {
               if(arr[i]!=0)
                arr[count++]=arr[i];}
               while(count<arr.length)
               arr[count++]=0;
            
        return arr;}
    
    public static void main(String args[]) {
        int arr[]={1,0,0,3,4,5,4,0,7};
        zero(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
        
    }
}
    

