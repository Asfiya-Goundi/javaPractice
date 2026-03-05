import java.util.Scanner;

public class Avg {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enetr first num:");
        int num1= sc.nextInt();
         System.out.println("enetr 2nd num:");
        int sec= sc.nextInt();
         System.out.println("enetr 3rs num:");
        int num3= sc.nextInt();
        int res = (num1+sec+num3)/3;
        System.out.println(res);

}
}