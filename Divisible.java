import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int num= sc.nextInt();
        if(num%2==0){
            if(num%5==0){
                System.out.println("num is divisible by 2 and 5");
            }else{
                System.out.println("number is divisible by 2 but not 5");
            }
        }else{
            System.out.println("number is not divisible by 2 nor 5");
        }
    }
}
