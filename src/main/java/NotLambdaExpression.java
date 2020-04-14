interface Intref{
    public void m1();
}

public class NotLambdaExpression implements Intref{

    @Override
    public void m1() {
        System.out.println("m1 method implementation without using lambda");
    }
}

class Test{
    public static void main(String[] args) {
        Intref i = new NotLambdaExpression();
        i.m1();
    }
}


