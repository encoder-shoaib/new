// package Inheritsance;
class A {
    int a, b, c;

    void add() {
        a = 50;
        b = 27;
        c = a + b;
        System.out.println("Add of two number=" + c);
    }

    void sub() {
        a = 50;
        b = 27;
        c = a - b;
        System.out.println("sub of two number=" + c);
    }
}

class B extends A {

    void mul() {
        a = 50;
        b = 27;
        c = a * b;
        System.out.println("Multiplaction  of two number=" + c);
    }
    void div() {
        a = 50;
        b = 27;
        c = a /b;
        System.out.println("Division   of two number=" + c);
    }
}
class C extends B {

void mud() {
    a = 50;
    b = 27;
    c = a /b;
    System.out.println("mud  of two number=" + c);
}
}
public class Mul7Inheritance {
    public static void main(String []args)
    {
        C shoaib= new C();
        shoaib.add();
        shoaib.sub();
        shoaib.mul();
        shoaib.div();
        shoaib.mud();

    }
}
