

public class Frequency {
    public static void main(String[] args){
        int[] arr={2,4,3,2,4,3,2,2,5,7,4,2};
        int[] freq= new int[arr.length];

        for(int i=0 ;i<arr.length;i++){
                freq[i]=0;
        }
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                     int temp = arr[j];
                     arr[j]= arr[j+1];
                     arr[j+1]=temp;
                }        
        }
        }
        for(int i=0 ;i<=arr.length-1;i++){
                System.out.println(arr[i]);
        }
      //System.out.println("freq:"+ freq[0]++ + "    "+ freq[0]);
      int k=0;
      int[] arr1=new int[arr.length];
      arr1[k]=arr[0];
      for(int i=0;i<=arr.length-1;i++){

          if(arr[i]==arr[i+1]){
       
          freq[k]++;
        }else{
          
        k++;
         arr1[k]=arr[i];
        
        }
       
    }
  
       for(int i=0 ;i<arr.length-1;i++){
             System.out.println(freq[i]);

            
       }
    }
}

