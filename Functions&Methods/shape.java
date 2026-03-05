 class Shape1{
    public void draw(){
        System.out.println("shape is drawn");
    }
    public void erase(){
        System.out.println("shape is erase");
    }

}
class Circle extends Shape1{
   public void draw(){
        System.out.println("draw a circle");

    }
public void erase(){
        System.out.println("sraw a circle");
    
}
}
class Triangle extends Shape1{
    public void draw(){
        System.out.println("draw a triangle");

    }
public void erase(){
        System.out.println("sraw a triange");
    
}
}

public class shape {
    public static void main(String args[]){    Shape1 s=new Shape1();
    Circle c=new Circle();
    Triangle t=new Triangle();
    c.draw();
    t.draw();
    c.erase();
    t.erase();
    s.draw();
    }
}
