public class EvenDigit {
    public static void main(String[] args){
        int num=6525446;
        int sum=0;
        int digit=0;
        while(num>10){
            digit=num%10;
            num=num/10;
            if(digit%2==0){
                sum=sum+digit;
            }
        }if(num%2==0){
        sum=sum+num;
        }
        System.out.println(sum);
    }
}
