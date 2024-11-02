public class IncrementDecrement {
    public static void main(String[] args) {
        int a=10;
        int b=--a + a++ + ++a - a++ + --a + a++ + ++a + --a + a++;
        System.out.println("Second Assignment:");
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("Third Assignment:");
        int c=10;
        int d=c++ - c++ - ++c - c++ - --c - c++ - c++ + ++c + c++;
        System.out.println("c="+c);
        System.out.println("d="+d);
    }
}
