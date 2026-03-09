public class Binary {
    public static void main(String[] args) {
     int[] arr={1,2,4,5,7,9};
     int n=arr.length;
     int target=9;
     int start=0;
     int end=n-1;

  // for(int i=0;i<n;i++){
    
    while(start<=end){
        int mid=(start+end)/2;
    if(arr[mid]==target){
        System.out.println("found at index "+ mid);
        return;
    }
    else if(arr[mid]>target)
        end=mid-1;
     else
        start=mid+1;
    }
         }
        }
    //}
    
   

