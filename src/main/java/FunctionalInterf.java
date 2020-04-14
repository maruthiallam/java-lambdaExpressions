@FunctionalInterface
public interface FunctionalInterf {
    /**
     * A valid functional interface as it contains only one abstract method. This can be used to invoke a lambda expression.
     */
    public void m1();
    default void m2(){

    }
    public static void m3(){}
}
