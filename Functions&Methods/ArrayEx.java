public class ArrayEx {
    public static void main(String[] args){
        String[] arr = {"abc", "xyz"};
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        int[] arr1={1,3,4,5,6};
        for(int i=0;i< arr1.length;i++){
            System.out.println(arr1[i]);
        }
     //enhanced for loop : when we want to work witheach and every element of the array 
     // only used to traverse from left to right.   
        for(String i:arr){
            System.out.println(i);

        }
        for(int i:arr1){
            System.out.println(i);
        }
        for(int i=arr1.length-1;i>=0;i--){
            System.out.println(arr1[i]);
        }
                for(int i=0;i<arr1.length;i++){
                       if(i==1){
                        int elem=arr1[i];
                        //System.out.println(elem);
                         arr1[i]=2;  
                         arr1[++i]=elem;
                         break;
                       } 
                }

        
        for(int i=0;i< arr1.length;i++){

            System.out.println(arr1[i]);
        }

    }
}



