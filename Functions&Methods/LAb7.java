interface Resize{
    void resizewudth(int width);
    void resizehieght(int hieght);
}

class Rectangle implements Resize{
    int width;
    int hieght;
    public Rectangle(int h,int w){
        width=w;
        hieght=h;

    }

public void resizewudth(int width){
    this.width=width;
}
public void resizehieght(int hieght){
this.hieght=hieght;
}
} 


public class LAb7 {
    
}
