
abstract class MainVehicle{
    String name;
    float price;
    
   public MainVehicle(String name,float price){
        this.name=name;
        this.price=price;
    }
    public abstract void stop();
    public abstract void start();
}

class Mahindra extends MainVehicle{
Mahindra(){
    super("Mahindra",50000);
}
public void stop(){
System.out.println("stoped....");
}
    public void start(){
System.out.println(" Starting ....");
    }
}

public class vehicle {
    public static void main(String[] args){
          MainVehicle v= new Mahindra();
          System.out.println(v.name);
            System.out.println(v.price);
          v.start();
          v.stop();
    }
}
