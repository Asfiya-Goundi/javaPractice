import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args){
   Scanner sc= new Scanner(System.in);
   // create an array of size 5 and take the input from the user and print the array is reverse.
   int[] arr=new int[5];
   for(int i=0;i<arr.length;i++){
     System.out.println("enter the elments of the array:");{
        arr[i]=sc.nextInt();

     }
    }
     for(int j=arr.length-1;j>=0;j--){
        System.out.println(arr[j]);
     }

    int[] arr1={2,5,7,3,8,1};
    int sum=0;
    for(int j=0;j<arr1.length;j++){
      sum+=arr1[j];
    }
    System.out.println(sum);
   }
}
    

