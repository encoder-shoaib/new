package EnCapsulation;

class A {
    private int value;

    public void setValue(int x) {
        value = x;
    }

    public int getValue() {
        return value;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        A in = new A();
        in.setValue(100);
        int sh = in.getValue();
        System.out.println(sh);
    }
}
