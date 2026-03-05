public class ThreeDArray {
    public static void main(String[] args){

      // 3D array : collection of 2D arrays
    int[] arr1 ={1,2,3,4,5};
      int[] arr2 ={4,5,6,7,8};
      int[][] arr3 ={arr1,arr2};
      int[][][] m= {arr3};
      int[][][] threeD={//int[2][2][3]
              {
                {1,2,3},
                {4,5,6}
              },
              {
                {1,2,3},
                {4,5,6}
              }
      };
for(int i=0;i<2;i++){ 
        for(int j=0;j<2;j++){
               for(int k=0;k<3;k++){
                System.out.print(threeD[i][j][k]+" ");
               }
               System.out.println();
        }
        System.out.println();
       }

       for(int i=0;i<threeD.length;i++){ 
        for(int j=0;j<threeD[i].length;j++){
               for(int k=0;k<threeD[i][j].length;k++){
                System.out.print(threeD[i][j][k]+" ");
               }
               System.out.println();
        }
        System.out.println();
       }
}
}
