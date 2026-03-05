import java.util.Scanner;
public class BinomialCoef {

   public static int fact(int n){
    int sum=1;
    for(int i=1;i<=n;i++){
        sum*=i;
    }
    return sum;
   }

    public static int binomial(int r,int n){
    int result;
    result=fact(n)/(fact(r)*fact(n-r));
    return result;

    }


   public static void main(String args[]){
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the value of n:");
   int n=sc.nextInt();
   System.out.println("Enter the value of r:");
   int r=sc.nextInt();
   int res=binomial(r,n);

System.out.println("The Binomila Coeficient is:"+res);


 sc.close();  } 
}
