import java.util.Scanner;

public class JaggedArray {

    // print jagged array in reverse order
    public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
        int[][] arr = new int[3][];
        arr[0]=new int[3];
         arr[1]=new int[1];
          arr[2]=new int[2];

for(int i=0; i<arr.length;i++){
          //  System.out.println("enetr student "+ i + " data :");
            for(int j=0;j<arr[i].length;j++){
                arr[i][j] = j;            }
    
        }
          for(int i=0; i<arr.length;i++){
        //for(int i=arr.length-1; i>=0;i--){
         //   System.out.println("enetr student "+ i + " data :");
            for(int j=arr[i].length-1;j>=0;j--){
                System.out.print(arr[i][j]+" ");           }
                System.out.println();
    
        }

        
        
}
}
