class A{
    void input () {
System.out.println("Ente your name :");
    }
}
class B extends A {
    void name1(){
        System.out.println("My name is Shoaib Ahammed");
    }
}
class C extends A{
    void name2(){
        System.out.println("My name is Abir");
    }

}
public class Hierarchical7Inheritance {
    public static void main (String[] args)
    {
B s=new B();
C a =new C();
    s.input();
    s.name1();
    a.input();
    a.name2();
    }
}
