import java.util.*;
public class BinToDec {


    public static void bintodec(int bin){
        int pow=0,dec=0;
        while(bin>0){
            
        int lastno=bin%10;
        dec=dec+lastno*(int)Math.pow(2,pow);
        pow++;
        bin=bin/10;
        } 
        System.out.println("the Decimal num is :"+dec);

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the binary Num:");
        int bin=sc.nextInt();
         bintodec(bin);   
        sc.close();
    }

}