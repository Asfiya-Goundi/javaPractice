import java.util.Scanner;

public class mergeJagged {
    // merge 2d jagged array elements into a single linear array.
     

    public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    int target =1;
        int[][] arr = new int[3][];
        arr[0]=new int[3];
         arr[1]=new int[1];
          arr[2]=new int[2];


          int[] arr1= new int[arr[0].length+arr[1].length+arr[2].length];


          for(int i=0; i<arr.length;i++){
          //  System.out.println("enetr student "+ i + " data :");
            for(int j=0;j<arr[i].length;j++){
                arr[i][j] = j;            }
    
            }
            int k=0;
             for(int i=0; i<arr.length;i++){
          //  System.out.println("enetr student "+ i + " data :");
            for(int j=0;j<arr[i].length;j++){
                arr1[k]=arr[i][j];   
            k++;        }
    
            }
            for(int i=0;i<arr1.length;i++){
                System.out.println(arr1[i]);
            }


        }
}
