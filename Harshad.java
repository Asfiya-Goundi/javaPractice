public class Harshad {
    public static void main(String[] args) {
        int num=155;
        int digit;
        int sum=0;
        int temp=num;

          while(num>=1){
            digit=num%10;
            num=num/10;
            sum=sum+digit;
          }
          if(temp%sum==0){
            System.out.println("harshed number");
        
          }else{
            System.out.println(" not a harshed number");
          }
    }}

