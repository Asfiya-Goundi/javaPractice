public class Neon {
    public static void main(String[] args) {

        int count=0;

        for(int num=0;num<10;num++){
        int sq=num*num;
        int digit;
        int sum=0;
        while(sq!=0){
         digit=sq%10;
           sum=sum+digit;
           sq=sq/10;
        }
        if(num==sum){
            System.out.println("yes");
            count++;
        }
        else{
            System.out.println("no");
        }
        
    }
    System.out.println(count);
    }}

