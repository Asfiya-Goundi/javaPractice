

public class Count{
    public static void main(String[] args){
        int num=88;
        int sum=0;
        int digit;
        //int size= 
        while(num>10){
        digit=num%10;
        num=num/10;
        sum=sum+digit;
        // System.out.println(sum);
        }
      sum=sum+num;
         System.out.println(sum);
    }
}