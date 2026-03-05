import java.util.Scanner;

public class Driving {
   public static void main(String[] args){
        Scanner sc = new Scanner(System.in); 
        boolean license = false;
       System.out.println("enter the person age");
       int age = sc.nextInt();
       if(age >=18){
        System.out.println("having licence:");
        license =sc.nextBoolean();
        if(license==true){
            System.out.println("no chalaan");

        }else{
            System.out.println("500 fine for not having a license");
        }
       }else{
        System.out.println("25000 for not having driving license and being minor!!!");
       }
   }
    
   }