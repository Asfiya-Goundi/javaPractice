public class ArrayLargestElem {
    public static void main(String[] args){

        // find the largest and second largest element in the array
        int[] arr={1,8,10,76,4,100};
        int max=arr[0];
        int secmax=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                secmax=max;
                max=arr[i];

            }
        }
        System.out.println(max);
        System.out.println(secmax);

        // copy one array from another array
        int[] arr2 = new int[arr.length];
           for(int i=0;i<arr2.length;i++){
            arr2[i]=arr[i];

           }
           for(int i=0;i<arr2.length;i++){
          System.out.println(arr2[i]);

           }

    }
}
