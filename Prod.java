
public class Prod{
public static void main(String[] args) {
    int num=234;
    int prod=1;
    int digit=0;

    while(num>10){
     digit=num%10;
     num=num/10;
     prod=digit*prod;
     System.out.println(prod);
    }
    prod=prod*num;
    System.out.println(prod);
}
}