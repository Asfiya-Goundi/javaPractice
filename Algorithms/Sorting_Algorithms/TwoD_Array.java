import java.util.Arrays;
public class TwoD_Array {
    public static void main(String[] args) {
      // collection of 1D array

        // twoD array always holds the reference of the 1D array.it will actually holds the data
      int[] arr1 ={1,2,3,4,5};
      int[] arr2 ={4,5,6,7,8};
      int[][] arr3 ={arr1,arr2};


      System.out.println(arr3.length);

      int[] first =arr3[0];
      for(int k=0;k<5;k++){
        System.out.print(first[k]+ "  ");
        
      }
      System.out.println();

      // both the array's are ponting to the same address.
      //  so if one array changes the value of any element it will directly reflect to the other array
      first[0]=100;
      for(int k=0;k<5;k++){
        System.out.print(first[k]+ "  ");
        
      }
      System.out.println();
      for(int i=0;i<2;i++){// first for loop indicates the rows in the 2D array 
        for(int j=0;j<5;j++){// second for loop indicates the number of elements in each array
       System.out.print(arr3[i][j]+"  ");
        }
        System.out.println();
            }
          System.out.println(java.util.Arrays.toString(arr3));

          for(int i=0;i< arr3.length;i++){
            //print the address of each array.
            System.out.println(arr3[i]);
            System.out.println(Arrays.toString(arr3[i]));
          }
    }
}
