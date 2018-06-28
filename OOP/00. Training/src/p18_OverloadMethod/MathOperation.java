package p18_OverloadMethod;

public class MathOperation {
    protected int add(int a, int b) {
        return a + b;
    }

    protected int add(int a, int b, int c) {
        return a + b + c;
    }

    protected int add(int a, int b, int c, int d) {
        return a + b + c + d;
    }
}
