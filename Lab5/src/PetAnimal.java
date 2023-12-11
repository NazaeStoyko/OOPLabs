

public class PetAnimal {
    private int id;
    private String name;
    private String species;
    private String breed;
    private String gender;
    private String birthDate;
    private String color;
    private double size;
    private String vaccinationInfo;


    public PetAnimal(int id, String name, String species, String breed, String gender,
                     String birthDate, String color, double size, String vaccinationInfo) {
        this.id = id;
        this.name = name;
        this.species = species;
        this.breed = breed;
        this.gender = gender;
        this.birthDate = birthDate;
        this.color = color;
        this.size = size;
        this.vaccinationInfo = vaccinationInfo;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public String getBreed() {
        return breed;
    }

    public String getGender() {
        return gender;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getColor() {
        return color;
    }

    public double getSize() {
        return size;
    }

    public String getVaccinationInfo() {
        return vaccinationInfo;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public void setVaccinationInfo(String vaccinationInfo) {
        this.vaccinationInfo = vaccinationInfo;
    }

    public boolean isOlderThanTenYears() {

        String[] birthDateParts = birthDate.split("/");
        int birthYear = Integer.parseInt(birthDateParts[1]);
        int currentYear = java.time.Year.now().getValue();
        return (currentYear - birthYear) > 10;
    }
    @Override
    public String toString() {
        return "PetAnimal{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", species='" + species + '\'' +
                ", breed='" + breed + '\'' +
                ", gender='" + gender + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", color='" + color + '\'' +
                ", size=" + size +
                ", vaccinationInfo='" + vaccinationInfo + '\'' +
                '}';
    }
}

