import java.util.Scanner;

public class SearchInJagged {
    public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    int target =1;
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
          //  System.out.println("enetr student "+ i + " data :");
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==target){
                    System.out.println("element found at index "+ j);
                }        }
    
        
        
        
}
}

}
