import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

public class PetListManager {
    private ArrayList<PetAnimal> petList = new ArrayList<>();

    public void addPet(PetAnimal pet) {
        petList.add(pet);
        System.out.println("Pet added: " + pet);
    }

    public void removePet(int id) {
        Iterator<PetAnimal> iterator = petList.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().id == id) {
                iterator.remove();
                System.out.println("Pet with ID " + id + " removed.");
                return;
            }
        }
        System.out.println("Pet with ID " + id + " not found.");
    }

    public void filterBySpecies(String species) {
        for (PetAnimal pet : petList) {
            if (pet.species.equalsIgnoreCase(species)) {
                System.out.println(pet);
            }
        }
    }

    public void listSpeciesWithCount() {
        // Реалізуємо логіку для виведення переліку видів та кількості тварин кожного виду
        // Використовуйте HashMap для підрахунку кількості тварин кожного виду
    }

    public void listOlderThan(int years) {
        Date currentDate = new Date();
        for (PetAnimal pet : petList) {
            long ageInMilliseconds = currentDate.getTime() - pet.birthDate.getTime();
            long ageInYears = ageInMilliseconds / (1000L * 60 * 60 * 24 * 365);
            if (ageInYears > years) {
                System.out.println(pet);
            }
        }
    }

    public void saveToFile(String filename) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(petList);
            System.out.println("Data saved to " + filename);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void loadFromFile(String filename) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            petList = (ArrayList<PetAnimal>) ois.readObject();
            System.out.println("Data loaded from " + filename);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
