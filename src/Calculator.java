
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

    public static void displayEvenNumber(int min, int max){
        while (min <= max ) {
            if (min % 2 == 0) {
                System.out.println(min + " is an even number.");
            }
            min++;

        }
    }

    public static void calculateMultiplesOfSix(int min, int max) {

        int count = 0;
        int sum = 0;
        for (int i = min; i <= max; i++) {
            if (i % 6 == 0) {
                count++;
                sum += i;
            }
        }

        System.out.println("There are " + count + " multiples of six." );
        System.out.println("Total: " + sum);

    }

}
