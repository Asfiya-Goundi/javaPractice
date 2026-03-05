
import java.util.Scanner;

public class Assign {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enetr the number:");
        int a= sc.nextInt();
        System.out.println("plus operation (a+=a):");
        a+=a;
        System.out.println(a);
        System.out.println("minus operation (a-=a):");
        a-=a;
        System.out.println(a);
        System.out.println("multi operation (a*=a):");
        a*=a;
        System.out.println(a);
        System.out.println("division operation (a*=a):");
        a/=a;
        System.out.println(a);
        System.out.println("modulus operation (a%=a):");
        a%=a;
        System.out.println(a);
    }
    
}
