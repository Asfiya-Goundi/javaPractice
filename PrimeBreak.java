public class PrimeBreak {

    static boolean isPrime(int num){
        for(int i=2;i<num;i++){
            if(num%i==0){
               return false;
                
            }  
        }
        return true;
    }
    public static void main(String[] args) {
        //check prime using break statement
        //print numbers from 2 to 100 : skip non-prime number using continue , stop when first prime greater than 50 is found
        int i;
        for(i=2;i<=100;i++){
            
            if(i>50 && isPrime(i)){
                System.out.println(i);
                break;

             
            }
        else{
             if(isPrime(i)){
                System.out.println(i);
             } 
            else
                continue;
        }
    
    }
}
}
