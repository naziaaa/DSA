class Rotate{
    static int[][]rotate(int nums[][] ){
        int n=nums.length;
        int rotated[][]=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                rotated[j][n-i-1]=nums[i][j];
            }
        }
   
        return rotated;
    }

    public static void main(String args[]) {
        
        int ar[][]={{1,2,3},{4,5,6,},{7,8,9}};
        int rotated[][]=rotate(ar);
        System.out.println("Rotated Image");
        for (int i = 0; i < rotated.length; i++) {
            for (int j = 0; j < rotated.length; j++) {
                System.out.print(rotated[i][j] + " ");
            }
            System.out.println();
        }

    }
    }
