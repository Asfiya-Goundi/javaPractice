public class LargeNum {
    public static void main(String[] args){
        int num=31;
        int large=0;
        int digit=0;
        int seclarge=0;
        while(num>0){
           digit=num%10;
           num=num/10;
           if(digit>large){
            seclarge=large;
            large=digit;
           }
           else if(digit>seclarge)
            seclarge=digit;
           }
        
        System.out.println(large);
        System.out.println(seclarge);
    }
}
