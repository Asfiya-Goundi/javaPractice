public class Two {
  public static void main(String[] args){
    int num=22426253;
    int digit;
    int count=0;
    while(num>10){
        digit=num%10;
        num=num/10;
        if(digit==2){
            count++;
        }
    
    }
    if(num==2){
        count++;
    }
    System.out.println(count);
  }  
}
