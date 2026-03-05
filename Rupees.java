import java.util.Scanner;

public class Rupees {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enetr the Rupees: ");
        int num= sc.nextInt();
    
            int rem,thre;
      int dig = num/500;
      rem = num%500;
      System.out.print(dig*500+",");
        
       thre= rem/200;
      System.out.print(thre*200+",");
    
        int hund = thre/100;
        System.out.println(hund*100);

        }
    }
