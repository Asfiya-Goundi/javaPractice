abstract class Map{
    abstract double calculateArea();
  abstract double calculatePerimeter();

} 
class Circle extends Map{
    double r;
    public Circle(double r){
       this.r=r;
    }
     double calculateArea(){
        return 3.142*r*r;
    }
    double calculatePerimeter(){
        return 2*3.142*r;
    }
}
class Triangle {
    double side1=1.0;
    double side2=2.0;
    double side3=3.0;
    // Triangle(){
    //     this.side1=side1;
    //     this.side2=side2;
    //     this.side3=side3;
    // }
 double calculateArea(){
        double side;
        double res;
        side=(double)(side1+side2+side3)/2;
        res=Math.sqrt(side*(side-side1)*(side-side2)*(side-side3));
        return res;


    }
     double calculatePerimeter(){
        return side1+side2+side3;

    }
}
public class Lab6 {
    public static void main(String[] args){
        Circle circle =new Circle(5.0);
        Triangle tri =new Triangle();
       System.out.println("area is: "+circle.calculateArea());
        System.out.println("Perimeter of Circle is: "+circle.calculatePerimeter());
        System.out.println();
        System.out.println("Area of Triangle is: "+tri.calculateArea());
        System.out.println("Perimeter of the Triangle: "+tri.calculatePerimeter());

    }
}
