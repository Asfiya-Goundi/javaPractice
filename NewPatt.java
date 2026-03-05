public class NewPatt {
    public static void main(String[] args) {
        char ch='A';
        for(int i=1;i<=5;i++){
          for(int j=1;j<=5;j++){
            if(j<=i){
                if(i%2==1){
                System.out.print(ch+" ");
                }else{
                    System.out.print(i+" ");
                }
            }else{
                System.out.print(" ");
            }
           
        }
        ch++;
      //  ch-=5-i;

    System.out.println();

           }
        }
    }

