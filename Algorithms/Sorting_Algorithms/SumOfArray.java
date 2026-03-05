public class SumOfArray {
    public static void main(String[] args) {

        // twoD array always holds the reference of the 1D array.it will actually holds the data
      int[] arr1 ={1,2,3,4,5};
      int[] arr2 ={4,5,6,7,8};
      int[][] arr3 ={arr1,arr2};
      //sum of all elements 
      int sum=0;
      for(int i=0;i<2;i++){ 
        for(int j=0;j<5;j++){
        sum+=arr3[i][j];
        }
        System.out.println();
            }
            System.out.println("sum of all elements:");
        System.out.println(sum);



      // sum of each row
      int[] rowSum= new int[arr3.length];
      for(int i=0;i<2;i++){ 
        for(int j=0;j<5;j++){
            rowSum[i]+=arr3[i][j];
        sum+=arr3[i][j];
        }
        System.out.println();
            }
            System.out.println("row sum:");
              for(int i=0;i<arr3.length;i++)
             System.out.println(rowSum[i]);


      //sum of each column
      int[] colSum =new int[arr1.length];
       for(int i=0;i<5;i++){ 
        for(int j=0;j<2;j++){
        
            colSum[i]+=arr3[j][i];
        }
       }
       System.out.println("column sum:");
       for(int i=0;i<arr1.length;i++){
        System.out.println(colSum[i]);
       }
    }
}
