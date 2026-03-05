public class Armstrong {
    static int leng(int num){
        int lenC=0;
        while(num!=0){
         num= num/10;
          lenC++;
        }
        System.out.println(lenC);
        return lenC;
    }
    public static void main(String[] args){
        int count=0;
        for(int num=1;num<=5;num++){
        int temp=num;
        int digit;
        int sum=0;
        int len= leng(num);
        System.out.println(len);
        while(num!=0){
         digit=num%10;
         sum=(int) (sum+ Math.pow(digit, len));
         num=num/10;
        }
        if(temp==sum){
            //System.out.println(temp);
            //count++;
        }
       // else{
            //System.out.println("no");
        //}
    }
    System.out.println(count);
}
}
