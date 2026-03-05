public class Reva {
    public static void main(String[] args){
        var num=444;
        int num2=num;
        int num1=0;
        int digit=0;
        while(num>10){
              digit= num%10;
              num1=digit+num1*10;
            num=num/10;
            

        }
        num1=num+num1*10;
         System.out.println(num1);
         if(num2==num1){
            System.out.println("palindrom");
         }else{
            System.out.println("not a palindrome");
         }

    } 
}
