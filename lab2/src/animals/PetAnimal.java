package animals;
import java.util.Date;

public class PetAnimal {
    private int id;
    private String name;
    private String species;
    private String breed;
    private String gender;
    private Date birthDate;
    private String color;
    private double sizeOrWeight;
    private boolean isVaccinated;

    public PetAnimal(int id, String name, String species, String breed, String gender, Date birthDate,
                     String color, double sizeOrWeight, boolean isVaccinated) {
        this.id = id;
        this.name = name;
        this.species = species;
        this.breed = breed;
        this.gender = gender;
        this.birthDate = birthDate;
        this.color = color;
        this.sizeOrWeight = sizeOrWeight;
        this.isVaccinated = isVaccinated;
    }

    public void setValue(String field, Object value) {
        switch (field) {
            case "name":
                this.name = (String) value;
                break;
            case "species":
                this.species = (String) value;
                break;
            case "breed":
                this.breed = (String) value;
                break;
            case "gender":
                this.gender = (String) value;
                break;
            case "birthDate":
                this.birthDate = (Date) value;
                break;
            case "color":
                this.color = (String) value;
                break;
            case "sizeOrWeight":
                this.sizeOrWeight = (Double) value;
                break;
            case "isVaccinated":
                this.isVaccinated = (Boolean) value;
                break;
        }
    }

    public Object getValue(String field) {
        switch (field) {
            case "name":
                return this.name;
            case "species":
                return this.species;
            case "breed":
                return this.breed;
            case "gender":
                return this.gender;
            case "birthDate":
                return this.birthDate;
            case "color":
                return this.color;
            case "sizeOrWeight":
                return this.sizeOrWeight;
            case "isVaccinated":
                return this.isVaccinated;
            default:
                return null;
        }
    }

    @Override
    public String toString() {
        return "ID: " + id +
                "\nName: " + name +
                "\nSpecies: " + species +
                "\nBreed: " + breed +
                "\nGender: " + gender +
                "\nBirth Date: " + birthDate +
                "\nColor: " + color +
                "\nSize/Weight: " + sizeOrWeight +
                "\nVaccinated: " + (isVaccinated ? "Yes" : "No");
    }
}
