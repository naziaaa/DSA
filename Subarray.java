public class Subarray {
    public static void main(String args[]) {
        
        int ar[]={8,7,6,8,6,6,6};
        int i,n=ar.length;
        for(i=1;i<n;i++)
        {    int count=1;
            for(int j=i+1;j<n;j++)
        {
                if(ar[i]==ar[j])
                count++;
        }
                if(count>n/2)
                System.out.println(i);

        }
        System.out.println(-1);

    
}
}
