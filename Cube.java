import java.util.Scanner;

public class Cube {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num= sc.nextInt();
        int cube= num*num*num;
        int sq= num*num;
        System.out.println("cube: "+ cube);
        System.out.println("sq: "+ sq);
}
}