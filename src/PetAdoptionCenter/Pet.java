package PetAdoptionCenter;

import java.io.Serializable;

public class Pet implements Serializable {
    protected int petId;
    protected String name;
    protected String species;
    protected int age;
    protected String breed;
    protected boolean isAdopted;

    public Pet(int petId, String name, String species, int age, String breed) {
        this.petId = petId;
        this.name = name;
        this.species = species;
        this.age = age;
        this.breed = breed;
        this.isAdopted = false;
    }

    public int getPetId() {
        return petId;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public int getAge() {
        return age;
    }

    public String getBreed() {
        return breed;
    }

    public boolean isAdopted() {
        return isAdopted;
    }

    public void adopt() {
        isAdopted = true;
    }

    public String getAdoptionStatus() {
        return isAdopted ? "Adopted" : "Available";
    }

    @Override
    public String toString() {
        return petId + ": " + name + " (" + species + ", " + breed + ", " + age + " years old) - " + getAdoptionStatus();
    }
}
