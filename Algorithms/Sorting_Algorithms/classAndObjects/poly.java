class Animal{
    String name ="animal";
      public void print(){
        System.out.println("aminal sound");
      }
      public static void greet(){
        System.out.println("hello");
      }
}
class Dog extends Animal{
    String name ="Dog";
     public void print(){
        System.out.println("Dog sound bow bow");
      }
        public static void greet(){
        System.out.println("hello dog");
      }

}
class Cat extends Animal{
    String name ="cat";
     public void print(){
        System.out.println("cat sound meow meow");
      }
    
}
public class poly {
    public static void main(String[] args) {
        Animal a; // refering to parent class object and contains variable of parent class.
        a= new Dog();
        a.print();
        System.out.println(a.name);
        a.greet();// method hiding
        
         a= new Cat();
        a.print();
        System.out.println(a.name);

        Dog d= new Dog();
        d.print();
        System.out.println(d.name);
        d.greet();

        Cat c= new Cat();
        c.print();
        System.out.println(c.name);

        a=c; // upcasting
        System.out.println(a.name);
        a.print();
        
    }}
