import java.util.Scanner;

public class IntoToJaggedArray {
    public static void main(String[] args){
        //jagged array: when rows are fixed and columns are of variable length.

         Scanner sc= new Scanner(System.in);
        int[][] arr = new int[3][];
        //null,null,null
        System.out.println(arr[0]);// it will print null value
      //  System.out.println(arr[0].length); // will give an error
        // suresh -> 10,20,30,40
        //ramesh -> 20,10
        // mahesh -> 30,30,40

        arr[0] = new int[4];
        arr[1]=new int[2];
        arr[2] = new int[3];
        System.out.println(arr[0].length); // 4 will the output

       // arr[0][0]=10;
        //arr[0][1]=20;
        //arr[0][2]=30;
        //arr[0][3]=40;

       
        for(int i=0; i<arr.length;i++){
            System.out.println("enetr student "+ i + " data :");
            for(int j=0;j<arr[i].length;j++){
                arr[i][j] = sc.nextInt();            }
           // System.out.println();
        }
        int i=1;
        System.out.println("all students marks:2");
         for(int[] oneD : arr){
            System.out.println("student "+ i++ + "marks");
            for(int ele :oneD)
            System.out.print(ele+ " ");
        System.out.println();
        }



    }
}
