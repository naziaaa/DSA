class Dup{
        static int Rem_dup(int arr[]){
            int res=1;
            for(int i=1;i<arr.length;i++)
            {
                if(arr[i]!=arr[res-1]){
                    arr[res]=arr[i];
                    res++;
                }
            }
            return res;
        }
    public static void main(String args[]) {
        int arr[]={1,2,2,3,4,6,7,7,8,9,9,9,67};
        System.out.println(Rem_dup(arr));
        
    }
}