class Leader{
    public static void main(String args[]) {
        int ar[]={1,2,2,3,3,4,4,4,5,6,6,6,6,9};
        int freq=1,i=1,n=ar.length;
        while(i<ar.length)
        {
            while(i<ar.length && ar[i]==ar[i-1])
            {
                freq++;
                i++;
            }
            System.out.println(ar[i-1]+" "+freq);
            i++;
            freq=1;}
            if(n==1 || ar[n-1]!=ar[n-2])
            System.out.println(ar[n-1]+" "+1);
        }
        
    }
