
abstract class Ani{
    abstract void sound();
    public void sleep(){
        System.out.println("sleeping...");
    }
}

class Dog extends Ani{
     @Override
     void sound(){
        System.out.println("bow bow,....");
    }
}
public class AbstracBasic {
    public static void main(String[] args){
        Dog a= new Dog();
       a.sleep();
         }
}
