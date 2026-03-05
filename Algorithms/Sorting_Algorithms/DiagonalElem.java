public class DiagonalElem {
    public static void main(String[] args){

        // print the diagonal elements of the Square matrix
    int[] arr1 ={1,2,3};
    int[] arr2 ={4,5,6};
    int[] arr3 ={7,8,9};
    int[][] twoD ={arr1,arr2,arr3};
    

        for(int i=0;i<3;i++){
            for(int j=0;j<5;j++){
                if(i==j)
                    System.out.println(twoD[i][j]);
            }
            System.out.println();
        }

        // addition of two matrix

         int[] arr4={1,2,3};
         int[] arr5 ={4,5,6};
         int[] arr6 ={7,8,9};
         int[][] twoDs ={arr4,arr5,arr6};
          int[][] sum=new int[3][3];

         for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
            sum[i][j]=twoD[i][j]+twoDs[i][j];
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
             System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }
}
}