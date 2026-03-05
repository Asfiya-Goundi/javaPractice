public class CallByvalue_reference {

public static void m1(int i) {
    i=100; 
}

public static void m2(int[] arr) {
    arr[0]=30;
    
} 

public static void main(String[] args){
        int i=10; // call by value( copy of data will be send to method) : it wnot effect the orignal value
        System.out.println(i);

        int[] arr = new int[]{1,2,3}; // call by  refence( copy of the address will be send to method)
        
        for(int ele:arr){
            System.out.println(ele);
        }
        m2(arr);

        for(int ele:arr){
            System.out.println(ele);
        }

    }
}
