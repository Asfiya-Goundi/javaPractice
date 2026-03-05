import java.util.Scanner;

public class Multi5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

         System.out.println("lower to upper");
        System.out.println("enetr the character:");
        String s=sc.next();
         String l= s.toLowerCase();
          System.out.println(l.charAt(0));


        System.out.println("multipy by 5:");
        int a=6;
        if(a%2==0){
            a*=5;
            System.out.println(a);
        }

        System.out.println("print good morning");

        System.out.println("enter the day timing(AM/PM:");
        String time = sc.next();
        if(time.equals("AM")){
            System.out.println("Morning");
        }

        System.out.println("battery level: ");
        System.out.println(" enter the battery level:");
        int battery = sc.nextInt();
        if(battery<=15){
            System.out.println("low power mode!!!!");
        }


        System.out.println("ticket:");
        boolean ticket = false;
        System.out.println("enter if the person is having the ticket or not");
        ticket=sc.nextBoolean();
        if(ticket==true){
            System.out.println("allowed!!");

        }


        System.out.println("temperature:");
        System.out.println("enter the temperature:");
        int temp =sc.nextInt();
        if(temp>=45){
            System.out.println("high temerature");
        }

       
    }
    
}
