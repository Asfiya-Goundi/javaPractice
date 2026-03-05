
import java.util.Scanner;

public class PositivePrint {
    public static void main(String[] args){
 // ask the user to enter the number continuosly : skip negative number print only positive numbers, stop when user enter o
       Scanner sc = new Scanner(System.in);
           int num=1;
        while(num!=0)
        {
        System.out.println("enter the number");
         num=sc.nextInt();
         if(num<0){
            continue;
         }
         else{
            System.out.println(num);
         }
    }
}
}