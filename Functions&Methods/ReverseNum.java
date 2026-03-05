import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number to Reverse :");
        
        int n=sc.nextInt();
        int num = 0;
        int digit;

        for(int i=0;i<3;i++){
            digit=n%10;
            System.out.println(digit);
             num =digit*10;
             System.out.println(num);
        }
    

    }
    
}
