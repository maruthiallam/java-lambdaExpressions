interface Intref1{
    public void m2();
}
public class LambdaExpression {
    public static void main(String[] args) {
        Intref1 intref1 = ()->System.out.println("m2 method implementation using lambda");
        intref1.m2();
    }
}
