
import java.util.Scanner;


public class Char {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the character:");
        String s= sc.next();

  char ch=s.charAt(0);
  if(ch>=97 && ch<=122 || ch >=65 && ch<=98)
    System.out.println(ch+"  is a character");
else{
    System.out.println(" not a character");
}
    }
    
}
