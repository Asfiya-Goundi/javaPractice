import java.util.Scanner;
public class FunctionBasic{
 public static int sum(int a,int b){

 int sum=a+b;

   return sum;
 }
 public static int pro(int x,int y){   // parameters or formal parameters
    int pro=x*y;
    return pro;
 }


    public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value for a:");
int a=sc.nextInt();
System.out.println("Enter the value for b:");
int b=sc.nextInt();
//System.out.println(a+b);
int sum=sum(a,b);             // arguments or actual parameters
int pro=pro(a,b);
 System.out.println("The sum of a & b is:"+sum);
 System.out.println("The product of the a & b is:"+pro);
    sc.close();
}
}
