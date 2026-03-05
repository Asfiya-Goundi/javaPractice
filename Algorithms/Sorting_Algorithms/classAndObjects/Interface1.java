interface parent{
    public void hello();
}

interface parent2 extends parent{
    public void hello();
}
class children implements parent,parent2{
    public void hello(){
  System.out.println("hey from child");
    }
}

public class Interface1 {
    public static void main(String[] args) {
    children c= new children();
    c.hello();
    }
    
}
