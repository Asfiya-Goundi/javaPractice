import java.util.*;
public class linearSearch {

public static int search(int[] myarray ,int key){
    for(int i=0;i<5;i++){
        if(myarray[i]==key){
            return i;
        }
    }
    return -1;
}
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int key;
        //int myarray[]=new int[];
       // System.out.println("Enter the number of elements you want in the array:");
        //n=sc.nextInt();
        int myarray[]=new int[5];

        for(int i=0;i<5;i++){
          System.out.println("Enter the num "+(i+1)+":");
          myarray[i]=sc.nextInt();
        }
        System.out.println("Elements of array:");
        for(int i=0;i<5;i++){
            System.out.println("Element "+(i+1)+" is "+myarray[i]);
          }
        
        System.out.println("Enter the element to be searched:");
        key=sc.nextInt();

        int result=search(myarray,key);
        
        if(result>=0){
            System.out.println("Search is successful .....\n key is found at "+(result+1));
        }
        else{
            System.out.println("Search is unseccessful....\n key is not fount");
        }
        sc.close();
    }
}
