import java.util.Scanner;

public class MinToHours{

    static void secToHours(int num){
        int res=(int)num/(60*60);
        int rem = num%(60);
        System.out.println(res+"hours:"+rem+"minuts");
    

    }
    static void hoursToSec(int num){
        double res= num*60*60;
       System.out.println(res);

    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the num value for seconds:");
        int num = sc.nextInt();
        secToHours(num);
        System.out.println("enter the value for hours:");
        int num1 =sc.nextInt();
        hoursToSec(num1);


       

}
}