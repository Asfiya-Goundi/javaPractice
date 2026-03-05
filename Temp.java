
import java.util.Scanner;

public class Temp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enetr the temperature:");
        int temp =sc.nextInt();
        if(temp==40){
            System.out.println("hot");
        }
        else if(temp>=30 && temp<=40){
            System.out.println("warm ");
        }
        else if(temp>=20 && temp<=29){
            System.out.println("pleasent");
        }
      else if(temp<20){
            System.out.println("cold");
        }
        else{
            System.out.println(" not determine");
        }
    }}

