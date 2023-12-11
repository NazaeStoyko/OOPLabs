package main;
import animals.PetAnimal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Comparator;
public class Main {
    public static void main(String[] args) {

        List<PetAnimal> petAnimals = createPetAnimals();


        String speciesToFind = "cat";
        System.out.println("List of " + speciesToFind + "s:");
        displayAnimalsBySpecies(petAnimals, speciesToFind);


        System.out.println("\nList of species with the number of registered animals:");
        displaySpeciesWithCount(petAnimals);


        int ageThreshold = 10;
        System.out.println("\nList of animals older than " + ageThreshold + " years:");
        displayAnimalsOlderThan(petAnimals, ageThreshold);
    }


    private static List<PetAnimal> createPetAnimals() {
        List<PetAnimal> petAnimals = new ArrayList<>();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM");
        try {

            petAnimals.add(new PetAnimal(1, "Fluffy", "cat", "Siamese", "Female",
                    dateFormat.parse("2015-04"), "White", 5.2, true));
            petAnimals.add(new PetAnimal(2, "Max", "dog", "Golden Retriever", "Male",
                    dateFormat.parse("2018-09"), "Golden", 30.5, true));
            petAnimals.add(new PetAnimal(3, "Buddy", "dog", "Labrador Retriever", "Male",
                    dateFormat.parse("2017-02"), "Black", 28.0, true));
            petAnimals.add(new PetAnimal(4, "Whiskers", "cat", "Maine Coon", "Male",
                    dateFormat.parse("2016-07"), "Tabby", 8.7, true));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return petAnimals;
    }

    private static void displayAnimalsBySpecies(List<PetAnimal> animals, String species) {
        for (PetAnimal animal : animals) {
            if (animal.getValue("species").equals(species)) {
                System.out.println(animal.toString());
            }
        }
    }


    private static void displaySpeciesWithCount(List<PetAnimal> animals) {

        List<String> speciesList = new ArrayList<>();
        for (PetAnimal animal : animals) {
            String species = (String) animal.getValue("species");
            if (!speciesList.contains(species)) {
                speciesList.add(species);
            }
        }


        for (String species : speciesList) {
            int count = 0;
            for (PetAnimal animal : animals) {
                if (animal.getValue("species").equals(species)) {
                    count++;
                }
            }
            System.out.println(species + " - " + count + " animals");
        }
    }

    private static void displayAnimalsOlderThan(List<PetAnimal> animals, int ageThreshold) {
        Date currentDate = new Date();
        for (PetAnimal animal : animals) {
            Date birthDate = (Date) animal.getValue("birthDate");
            int age = currentDate.getYear() - birthDate.getYear();
            if (currentDate.getMonth() < birthDate.getMonth() ||
                    (currentDate.getMonth() == birthDate.getMonth() && currentDate.getDate() < birthDate.getDate())) {
                age--;
            }
            if (age > ageThreshold) {
                System.out.println(animal.toString());
            }
        }
    }
}








