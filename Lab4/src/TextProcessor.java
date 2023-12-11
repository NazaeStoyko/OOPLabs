//Завдання 4.1

//import java.io.File;
//import java.io.FileNotFoundException;
//import java.util.Scanner;
//
//public class TextProcessor {
//    private double[] array;
//
//    public TextProcessor() {
//        // Конструктор без параметрів
//    }
//
//    public void readOneDimensionalArray(String fileName) {
//        try {
//            // Читання даних з файлу та ініціалізація масиву
//            Scanner scanner = new Scanner(new File(fileName));
//            int arraySize = scanner.nextInt();
//            array = new double[arraySize];
//
//            for (int i = 0; i < arraySize; i++) {
//                array[i] = scanner.nextDouble();
//            }
//
//            scanner.close();
//        } catch (FileNotFoundException e) {
//            System.err.println("File not found: " + fileName);
//            e.printStackTrace();
//        }
//    }
//
//    public void processArray() {
//        // Виведення масиву у консоль
//        System.out.print("Array: ");
//        for (double value : array) {
//            System.out.print(value + " ");
//        }
//        System.out.println();
//    }
//
//    public double calculate() {
//        // Обчислення суми від'ємних елементів масиву
//        double sum = 0;
//        for (double value : array) {
//            if (value < 0) {
//                sum += value;
//            }
//        }
//        return sum;
//    }
//}

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TextProcessor {
    private double[][] twoDimensionalArray;

    public TextProcessor() {
        // Конструктор без параметрів
    }

    public void readTwoDimensionalArray(String fileName) {
        try {
            // Читання даних з файлу та ініціалізація двовимірного масиву
            Scanner scanner = new Scanner(new File(fileName));
            int n = scanner.nextInt();
            twoDimensionalArray = new double[n][n];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    twoDimensionalArray[i][j] = scanner.nextDouble();
                }
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + fileName);
            e.printStackTrace();
        }
    }


    public void processArray() {

        for (int i = 0; i < twoDimensionalArray.length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(twoDimensionalArray[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public double calculate() {
        double sum = 0;
        for (int i = 0; i < twoDimensionalArray.length; i++) {
            for (int j = 0; j < twoDimensionalArray[i].length; j++) {
                sum += twoDimensionalArray[i][j];
            }
        }
        return sum;
    }
}
