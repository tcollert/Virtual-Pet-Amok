import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

    Map<String, VirtualPet> allPets = new HashMap<String, VirtualPet>();

    public VirtualPetShelter(Map<String, VirtualPet> allPets) {
        this.allPets = allPets;
    }

    public String getPets() {
        String petList = "";
        for (Map.Entry<String, VirtualPet> entry : allPets.entrySet()) {
            petList += (" Pet Name: " + entry.getKey());
            petList += (", Pet Description: " + entry.getValue().getPetDescription());

        }
        return petList;
    }

    public void addPet(VirtualPet pet) {
        allPets.put(pet.getPetName(), pet);
    }

    public VirtualPet findPet(String petName) {
        return allPets.get(petName);
    }

    public Collection<VirtualPet> getAllVirtualPets() {
        return allPets.values();
    }

    public void adoptPet(VirtualPet pet) {
        allPets.remove(pet.getPetName(), pet);
    }

    public void feedMyPet() {
        for (VirtualPet virtualPet : getAllVirtualPets()) {
            if (virtualPet instanceof Organic) {
                ((Organic) virtualPet).feedMe();
            }
        }
    }

    public void hydrateMyPet() {
        for (VirtualPet virtualPet : getAllVirtualPets()) {
            if (virtualPet instanceof Organic) {
                ((Organic) virtualPet).hydration();
            }
        }
    }

    public void playWithOnePet() {
        for (VirtualPet virtualPet : getAllVirtualPets()) {
            if (virtualPet instanceof OrganicDog) {
                ((OrganicDog) virtualPet).walk();
            }
        }
    }

    public void maintenanceRoboticPets() {
        for (VirtualPet virtualPet : getAllVirtualPets()) {
            if (virtualPet instanceof Robotic) {
                ((Robotic) virtualPet).maintenance();
            }
        }
    }

    public void oilChangeAll() {
        for (VirtualPet virtualPet : getAllVirtualPets()) {
            if (virtualPet instanceof Robotic) {
                ((Robotic) virtualPet).oilChange();
            }

        }
    }

    public void updateAllTick(Collection<VirtualPet> pets) {
        for (VirtualPet pet : pets) {
            pet.tick();
        }

    }

    // iterate through pets and display them
    public void allPetStatus(Collection<VirtualPet> pets) {
        System.out.println(
                "\nNAME\t\t|HUNGER\t|THIRST\t|BOREDOM|DESCRIPTION\t|HEALTH\t|CAGE CLEANLINESS\t|LITTER BOX CLEANLINESS  |");
        System.out.println(
                "------------------------|-------|-------|-------|--------------------|---------|------------------|-------------------|");
        for (VirtualPet pet : pets) {
            System.out.println(pet.getPetName() + "\t\t| " + pet.getPetHungerLevel()
                    + "\t| " + pet.getPetThirstLevel() + "\t| " + pet.getPetBoredomLevel()
                    + "\t| " + pet.getPetDescription() + "\t| " + pet.getPetHealth() + "\t| "
                    + pet.getPetWasteCage() + "\t| " + pet.getPetWasteLitterBox() + "\t| ");
        }
        System.out.println(
                "-----------------------------------------------------------------------------------------------------------------------");

    }
}
