public class DigitCount {
    public static void main(String[] args){
        int num=8948958;
        int count=0;
        while(num>10){
          num=num/10;
          count++;
        }
        count++;
        System.out.println(count);
    }
}
