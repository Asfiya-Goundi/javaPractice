import java.util.Scanner;

public class Atm {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean card = false;
        float balance=6000;
        System.out.println("enter the card:");
        card=sc.nextBoolean();
        if(card==true){
            System.out.println("enter the amount fot withdrawal:");
            float amount = sc.nextFloat();
            if(amount <=6000){
                System.out.println(amount+" is withdrawed from your account !!");
                balance-=amount;
                System.out.println("available balance is "+ balance);
            }
        }
}

}
