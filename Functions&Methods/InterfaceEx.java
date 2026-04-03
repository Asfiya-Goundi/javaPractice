  interface payment{
     // public payment(){
        // donot allow construstor creation
      //}    
      
      String greet ="welcome";
       void pay(double amount);

       public default void display(){
        System.out.println("hello");// allow default method inside the interface (java 9 onwords)
       }
        public static void dis(){ // allow static method inside the interface (java 9 onwords)
       
        System.out.println("hello !!!");
       }
       
    }

    class Cash implements payment{

        @Override
        public void pay(double amount) {
        }
        

    }


public class InterfaceEx{
    public static void main(String[] args){
        //accessing interface variables 
           System.out.println(payment.greet);
           // calling interface methods
           payment.dis();
           Cash c= new Cash();
           c.display();
                                    
    }
}