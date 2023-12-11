//Завдання 4.1

//public class Main {
//    public static void main(String[] args) {
//        TextProcessor textProcessor = new TextProcessor();
//        textProcessor.readOneDimensionalArray("lab41.txt");
//        textProcessor.processArray();
//
//        double sumOfNegatives = textProcessor.calculate();
//        System.out.println("Sum of negative elements: " + sumOfNegatives);
//    }
//}

public class Main {
    public static void main(String[] args) {
        TextProcessor textProcessor = new TextProcessor();
        textProcessor.readTwoDimensionalArray("lab42.txt");
        textProcessor.processArray();

        double result = textProcessor.calculate();
        System.out.println("Result: " + result);
    }
}
