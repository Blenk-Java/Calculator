public class Main {

    public static void main(String[] args) {

        int x = 0;
        int y = 0;

        System.out.println("this is a line printed");
        int a = 8;
        int b = 4;

        System.out.format("\n%d plus %d is %d\n", a, b, addNumbers(a, b));

    }

    public static int addNumbers(int a, int b) {
        return a + b;

        }

    public int subtract(int x, int y){

        return x-y;



    }
    public static int multiply(int x, int y){
        return x * y;
    }
}
