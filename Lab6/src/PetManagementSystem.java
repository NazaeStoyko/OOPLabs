import java.util.Scanner;

public class PetManagementSystem {
    public static void main(String[] args) {
        PetListManager petManager = new PetListManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Pet");
            System.out.println("2. Remove Pet");
            System.out.println("3. Filter by Species");
            System.out.println("4. List Species with Count");
            System.out.println("5. List Pets Older than");
            System.out.println("6. Save to File");
            System.out.println("7. Load from File");
            System.out.println("8. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume the newline

            switch (choice) {
                case 1:
                    System.out.println("Enter Pet details (id, name, species, breed, gender, birthDate(MM/yyyy), color, sizeWeight, vaccinationInfo):");
                    String inputLine = scanner.nextLine();
                    String[] petDetails = inputLine.split(",");
                    if (petDetails.length == 9) {
                        try {
                            PetAnimal newPet = new PetAnimal(Integer.parseInt(petDetails[0].trim()), petDetails[1].trim(),
                                    petDetails[2].trim(), petDetails[3].trim(), petDetails[4].trim(), petDetails[5].trim(),
                                    petDetails[6].trim(), petDetails[7].trim(), petDetails[8].trim());
                            petManager.addPet(newPet);
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid input for ID. Please enter a valid integer.");
                        }
                    } else {
                        System.out.println("Invalid input. Please enter all required details.");
                    }
                    break;

                case 2:
                    System.out.println("Enter Pet ID to remove:");
                    int idToRemove = scanner.nextInt();
                    petManager.removePet(idToRemove);
                    break;
                case 3:
                    System.out.println("Enter Species to filter:");
                    String speciesToFilter = scanner.next().trim();
                    petManager.filterBySpecies(speciesToFilter);
                    break;
                case 4:
                    petManager.listSpeciesWithCount();
                    break;
                case 5:
                    System.out.println("Enter age in years:");
                    int age = scanner.nextInt();
                    petManager.listOlderThan(age);
                    break;
                case 6:
                    petManager.saveToFile("pet_data.dat");
                    break;
                case 7:
                    petManager.loadFromFile("pet_data.dat");
                    break;
                case 8:
                    System.out.println("Exiting program.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
