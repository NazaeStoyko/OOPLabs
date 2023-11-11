import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Calculator {
    private double inputA;
    private double inputB;
    private double inputX;
    private double resultW;
    private double resultY;

    public void setInputValues(double a, double b, double x) {
        this.inputA = a;
        this.inputB = b;
        this.inputX = x;
    }

    public void calculate() {
        this.resultW = Math.sqrt(Math.pow(inputX, 2) + inputB) - Math.pow(inputB, 2) * Math.pow(Math.sin(inputX + inputA), 3);
        this.resultY = Math.cos(inputX) - (inputX / Math.sqrt(Math.pow(inputA, inputX) + 2 * Math.pow(inputB, 2)));
    }

    public void printResult() {
        System.out.println("Вхідні дані:");
        System.out.println("A: " + inputA);
        System.out.println("B: " + inputB);
        System.out.println("X: " + inputX);
        System.out.println("Результат W: " + resultW);
        System.out.println("Результат Y: " + resultY);
    }

    public void printCurrentDateTime(String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        String formattedDate = sdf.format(new Date());
        System.out.println("Поточна дата і час: " + formattedDate);


        LocalTime currentTime = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String formattedTime = currentTime.format(formatter);
        System.out.println("Поточний час: " + formattedTime);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть значення A: ");
        double a = scanner.nextDouble();

        System.out.print("Введіть значення B: ");
        double b = scanner.nextDouble();

        System.out.print("Введіть значення X: ");
        double x = scanner.nextDouble();

        calculator.setInputValues(a, b, x);
        calculator.calculate();
        calculator.printResult();

        System.out.print("Введіть формат для друку поточної дати і часу (наприклад, 'yyyy-MM-dd HH:mm:ss'): ");
        String dateFormat = scanner.next();

        calculator.printCurrentDateTime(dateFormat);

        scanner.close();
    }
}
