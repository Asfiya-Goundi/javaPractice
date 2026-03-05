
import java.util.Scanner;

public class Condition {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
         System.out.println("enter the battery level:");
        int battery;
        battery = sc.nextInt();
        if(battery ==100){
            System.out.println("battery is full");
        }
        if(battery<=20){
            System.out.println("battery is low");
        }
        sc.close();
    
        }
    
}
