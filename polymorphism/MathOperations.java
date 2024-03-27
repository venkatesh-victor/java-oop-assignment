package polymorphism;

class Operation {
    public int add(int a, int b) {
        return a + b;
    }

    public float add(float a, float b) {
        return a + b;
    }

    public float add(float a, int b) {
        return a + b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public float multiply(float a, float b) {
        return a * b;
    }

    public float multiply(float a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        return a / b;
    }

    public float divide(float a, float b) {
        return a / b;
    }

    public float divide(float a, int b) {
        return a / b;
    }

    public int substract(int a, int b) {
        return a - b;
    }

    public float substract(float a, float b) {
        return a - b;
    }

    public float substract(float a, int b) {
        return a - b;
    }


}

public class MathOperations {
    public static void main(String[] args) {
        Operation o = new Operation();

        System.out.println(o.add(10, 5));
        System.out.println(o.add(10.5f, 15));
        System.out.println(o.add(20.3f, 30));

        System.out.println(o.multiply(10, 5));
        System.out.println(o.multiply(10.5f, 15));
        System.out.println(o.multiply(20.3f, 30));

        System.out.println(o.divide(10, 5));
        System.out.println(o.divide(10.5f, 15));
        System.out.println(o.divide(20.3f, 30));
    }
}
