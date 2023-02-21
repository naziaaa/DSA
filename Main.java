Class Main{
    static int largest(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            boolean flag=true;
            for(int j=0;j<arr.length;j++)
            {
                if(arr[j]>arr[i])
                flag=false;
            }
            if(flag==true)
            return i;
    }
    return -1;
    }
 public static void main(String[] args) {
    int arr[]={23,45,56,687,89};
    System.out.println(largest(arr));
    }
   }
