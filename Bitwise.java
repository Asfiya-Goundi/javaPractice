import java.util.Scanner;

public class Bitwise {

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int a=6;//0000 0110   
        int b=9;//0000 1001             
        int res;
        int op ;
        System.out.println("enter the operation:");
       op= sc.nextByte();
       switch (op) {
           case 1: System.out.println("& operation :");
           res=a&b;
           System.out.println(res);
               
               break;
       case 2: System.out.println("| operation :");
           res=a|b;
           System.out.println(res);
               
               break;
               case 3: System.out.println("Xor operation :");
           res=a^b;
           System.out.println(res);
               
               break;
               case 4: System.out.println("~ operation :");
           res=~a;
           System.out.println(res);
               
               break;
           default:
               throw new AssertionError();
       }
       
    }
    
}
