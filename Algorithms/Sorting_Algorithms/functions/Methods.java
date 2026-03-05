public class Methods {
    public static void print(String msg){ // method with no return type and behaves different with different input
        System.out.println("the given text is: " + msg);
    }
 public static int firstprime(){// method with no parameter and with return type
        return 2;
    }

    public static int add(int a,int b){// method with 2 parameters
        return a+b;
    }
    public static void main(String[] args) {
        print("hi");
        print("hello mike !");
      int res=  firstprime();
      System.out.println(res);
      int res2=add(10,20);
      System.out.println(res2);

        
    }}

