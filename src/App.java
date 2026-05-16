
public class App {

    public static void main(String[] args) throws Exception {

        Student student = new Student("Carlos Paredes", 13);

        String message = (student.isPassed()) ? "Student has passed." : "Student has not passsed";
        System.out.println(message);

        Calculator.getMax(20, 20);

        System.err.println(Calculator.excuteOperation(8, 6, '/'));

        Calculator.displayEvenNumber(1, 15);

        Calculator.calculateMultiplesOfSix(15, 18);

        System.out.println(Calculator.calculateFactorial(8));
    }
}
