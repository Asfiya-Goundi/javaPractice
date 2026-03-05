public class Basics {
    void area(int a,int b){
    int area=a*b;
    System.out.println("Area:"+area);
}
public static void main(String[] args) {
    // object is created in the heap memory
    //an object is consisting of :
    // 1. state: data stored in the object
    //2. behaviour : how object behaves with different data
    //3. identity : a unique identity given to each object
Basics rec=new Basics();
   rec.area(6,10);
   rec.area(3,7);

}
}    

