public class Mobile {
    String brand;
    float price;
    public Mobile(String brand,float price){
this.brand=brand;
this.price=price;
    }
    public void display(){
        System.out.println(brand);
        System.out.println(price);
    }
    public static void main(String[] args){
    Mobile m= new Mobile("onePlus",35000);
    Mobile m1= new Mobile("vivo",40000);
    m.display();
    m1.display();
    }
}
