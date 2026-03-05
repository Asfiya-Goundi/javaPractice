
import java.util.Scanner;

class Else{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the 2 digit number:");
        int num =sc.nextInt();
        if(num>10 && num<100){
            if(num%2==0){
            num*=2;
             System.out.println(num);    
        }else{
        num*=3;
             System.out.println(num);    
            
        }
        sc.close();
        }

        
    }
}