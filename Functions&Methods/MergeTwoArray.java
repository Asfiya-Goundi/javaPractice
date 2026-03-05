public class MergeTwoArray {
    public static void main(String[] args) {

        //merge two array
        int[] arr={1,2,3,4,5};
        int[] arr1={6,7,8,9,10};
        int[] arr2=new int[arr.length+arr1.length];
        int k=0;
          for(int i=0;i<arr.length;i++){
            arr2[k]=arr[i];
            k++;
          }
          for(int j=0;j<arr1.length;j++){
            arr2[k]=arr1[j];
            k++;
        
          }
          for(int i=0;i<arr2.length;i++){
        System.out.println(arr2[i]);
          }
        }
    }

