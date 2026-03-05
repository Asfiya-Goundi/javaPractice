public class Jumping {
    public static void main(String[] args){
        int i;
        for(i=1;i<=100;i++){
            if(i%3==0){
                continue;
            }
            else if(i%17==0){
                return;
            }
            else{
                System.out.println(i);
            }
     }
    
    }
}
