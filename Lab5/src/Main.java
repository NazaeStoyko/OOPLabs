import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<PetAnimal> petAnimals = new ArrayList<>();
        petAnimals.add(new PetAnimal(1, "Fluffy", "Cat", "Persian", "Female",
                "01/01/2015", "White", 5.2, "Up to date"));
        petAnimals.add(new PetAnimal(2, "Buddy", "Dog", "Golden Retriever ", "Male",
                "05/10/2018", "Golden", 25.0, "Annual shots"));
        petAnimals.add(new PetAnimal(3, "Tomm", "Cat", " Retriever", "Male",
                "11/12/2023", "Golden", 24.0, " Annual shots"));



        try (FileWriter writer = new FileWriter("petAnimals.txt")) {
            for (PetAnimal pet : petAnimals) {
                writer.write(pet.toString() + "\n");
            }
            System.out.println("Дані збережено у файл petAnimals.txt");
        } catch (IOException e) {
            System.err.println("Помилка при збереженні даних у файл: " + e.getMessage());
        }


        try (BufferedReader reader = new BufferedReader(new FileReader("petAnimals.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Помилка при зчитуванні даних з файлу: " + e.getMessage());
        }
        System.out.println("Список тварин старше 10 років:");
        for (PetAnimal pet : petAnimals) {
            if (pet.isOlderThanTenYears()) {
                System.out.println(pet.getName() + " (" + pet.getSpecies() + ")");
            }
        }

    }

}