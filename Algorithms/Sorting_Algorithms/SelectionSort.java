public class SelectionSort {
    public static void main(String[] args){
        int[] arr={3,5,1,6,8};
        int min;
        int n=arr.length;
        for(int i=0;i<n;i++){
            min=i;
            for(int j=i+1;j<n;j++){
                 if(arr[j]<arr[min]){
                    min=j;
                 }
            }
            int temp= arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }

        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
