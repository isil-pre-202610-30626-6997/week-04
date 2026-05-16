
public class Calculator {

    public static void getMax(int a, int b) {

        if (a > b) {
            System.out.println(a + " is greater than " + b);
            return;
        }

        if (b > a) {
            System.out.println(b + " is greater than " + a);
            return;
        }

        System.out.println("Both numbers are equeal.");

    }

    public static double excuteOperation(int a, int b, char operation) {
        double result = 0;
        switch (operation) {
            case '+' -> result = a + b;
            case '-' -> result = a - b;
            case '*' -> result = a * b;
            case '/' -> result = a / b;
            case '%' -> result = a % b;
        }

        return result;
    }

}
