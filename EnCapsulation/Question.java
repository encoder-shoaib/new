package EnCapsulation;
class Rectangle {
private int height;
private int width;
private int area;
public void setHeight(int height) {
    this.height = height;

    }
    public void setWidth(int width) {
    this.width = width;
    }
    public void setArea() {
    this.area = height*width;
    }
    public int getHeight() {
    return this.height;
    }
    public int getWidth(){
        return this.width;
    }
    public int getArea(){
        return this.area;
    }
    }

public class Question {
    public static void main(String[] args)
    {
        Rectangle sh=new Rectangle();
       sh.setHeight(100);
       int ah=sh.getHeight();
       System.out.println(ah);

       sh.setWidth(100);
       int ab=sh.getWidth();
       System.out.println(ab); 
       
       sh.setArea();
       System.out.println(sh.getArea());
       
    }
}
