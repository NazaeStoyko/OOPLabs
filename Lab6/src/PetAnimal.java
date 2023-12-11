import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PetAnimal implements Serializable {
    int id;
    String name;
    String species;
    String breed;
    String gender;
    Date birthDate;
    String color;
    String sizeWeight;
    String vaccinationInfo;

    public PetAnimal(int id, String name, String species, String breed, String gender, String birthDate,
                     String color, String sizeWeight, String vaccinationInfo) {
        this.id = id;
        this.name = name;
        this.species = species;
        this.breed = breed;
        this.gender = gender;

        try {
            this.birthDate = new SimpleDateFormat("MM/yyyy").parse(birthDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        this.color = color;
        this.sizeWeight = sizeWeight;
        this.vaccinationInfo = vaccinationInfo;
    }

    @Override
    public String toString() {
        return "PetAnimal{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", species='" + species + '\'' +
                ", breed='" + breed + '\'' +
                ", gender='" + gender + '\'' +
                ", birthDate=" + new SimpleDateFormat("MM/yyyy").format(birthDate) +
                ", color='" + color + '\'' +
                ", sizeWeight='" + sizeWeight + '\'' +
                ", vaccinationInfo='" + vaccinationInfo + '\'' +
                '}';
    }
}
