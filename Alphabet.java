import java.util.Scanner;
public class Alphabet{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enetr the Alphabet:");
        String s= sc.next();
        char ch= s.charAt(0);
    
        if(ch>=65 && ch<=122){
            if(ch>=65 && ch<=96){
                System.out.println("upper case latter");
            }
            else{
                System.out.println("lower case latter");
            }

        }
}
}