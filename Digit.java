
import java.util.Scanner;

public class Digit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int f1= num/10;
        int f2=num%10;
        System.out.println("first gidit:"+ f1);
         System.out.println("second gidit:" +f2);
          sc.close();
        
    }
    
}
