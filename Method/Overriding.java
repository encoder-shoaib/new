package Method;

class Car{

 void color ()
 {
    System.out.println("the car color is red");
 }
}
class BMW  extends Car {
    @Override
    void color (){
        System.out.println("the BMW car color is black");
     }

}
public class Overriding {
    public static void main(String[] args) {
        Car shoab = new BMW();
        shoab.color();
    }
    }


