class Mypoint{
    int x,y;
    Mypoint(){
        this.x=0;
        this.y=0;
    }
    Mypoint(int x,int y){
        this.x=x;
        this.y=y;
    }
    void setXY(int x,int y){
        this.x=x;
        this.y=y;
    }
    int[] getXY(){
        int[] coordinates={this.x,this.y};
        return coordinates;

    }
    String tostring(){
        return "("+this.x+","+this.y+")";
    }
    double distance(int x,int y){
        int xdiff=this.x-x;
        int ydiff=this.y-y;
        return Math.sqrt(xdiff*xdiff+ydiff*ydiff);
    }
    double distance(Mypoint another){
        return distance(another.x,another.y);
    }
    double distance(){
        return distance(0,0);
    }

}

public class Example {
  public  static void main(String args[]){
    Mypoint p1=new Mypoint(5,2);
    Mypoint p2=new Mypoint();
    System.out.println(p1.tostring());
    System.out.println(p2.tostring());
    System.out.println(p2.distance(p1));
    System.out.println(p1.distance(5,6));
    System.out.println(p1.distance());
  } 

    
}
