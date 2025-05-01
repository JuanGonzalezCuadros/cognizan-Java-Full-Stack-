package PetAdoptionCenter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Adopter implements Serializable {
    private int adopterId;
    private String name;
    private String contactInfo;
    private List<Pet> adoptedPets;


    public Adopter(int adopterId, String name, String contactInfo) {
        this.adopterId = adopterId;
        this.name = name;
        this.contactInfo = contactInfo;
        this.adoptedPets = new ArrayList<>();
    }

    public int getAdopterId() {
        return adopterId;
    }

    public List<Pet> getAdoptedPets() {
        return adoptedPets;
    }

    public void adoptPet(Pet pet) {
        adoptedPets.add(pet);
    }

    @Override
    public String toString() {
        return adopterId + ": " + name + " (" + contactInfo + ")";
    }
}
