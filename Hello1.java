import java.util.Scanner;
public class Hello1{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        //System.out.println("Enter a num: ");
        // int n=scn.nextInt();
        // System.out.println("number : "+n);
        System.out.println("Enter a string : ");
        String str=scn.nextLine();
        System.out.println("String : "+str);
        float f=scn.nextFloat();
        System.out.println("Flaot : "+f);
        System.out.println("hi");
        scn.close();
        
    }
}