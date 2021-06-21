public class Main {

    public static void main(String[] args) {

        System.out.println("this is a line printed");
        int a = 8;
        int b = 4;

        System.out.format("\n%d plus %d is %d\n", a, b, addNumbers(a, b));

    }

    public static int addNumbers(int a, int b) {
        return a + b;
    }
}
