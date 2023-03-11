package Method;
public class Overloding {
    int add()
    {
        int a=10;
        int b=5;
        int c=a+b;
        return c;
    }
    void add(int x,int y)
    {
        int c=x+y;
        System.out.println(c);
    }
    void add(int x,double y)
    {
        double c=x+y;
        System.out.println(c);
    }
    public static void main(String[] args)
    {
       Overloding sum=new Overloding();
      System.out.println(sum.add());
      sum.add(28,20);
      sum.add(23,28.23);
    }
}
