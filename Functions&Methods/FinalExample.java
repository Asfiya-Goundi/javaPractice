public class FinalExample {
    //final String name; // ERROR : need to initialize the instance variable but local variables can be declared and can be initilized later.
      final String name; // the other way to initialize the instance variable which is final ,we initialize it using the constructor.
    FinalExample(){
         name="boo";

         class MethodFinal{
            final void stop(){
                System.out.println("final method");
            }
            private int add(final int a,final int b){
                //a=a+20;     // cannot change the value after it is declared as final ...we used here because we donot want to change the value of variables a,b.
                //b=b+10;
                return a+b;
            }

         }
         class Demo extends MethodFinal{
         //   void stop(){                                           // cannot override  the final method
           //     System.out.println("final method extended....?");
            //}
         }
}
    public static void main(String[] args){
        final int a=30;
        System.out.println(a);
        //a=40;  ERROR : cannot modify the final variable
        final int b;
        b=10;
    }
}
