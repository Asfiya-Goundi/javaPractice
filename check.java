import java.util.Scanner;

public class check {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the charaector");
        String s=sc.next();
        char ch =s.charAt(0);
        if(ch>65 && ch>96){
            System.out.println("upper case latter");
        }
        else if(ch>0 && ch<9){
            System.out.println("number");
        }
        

    }
}
