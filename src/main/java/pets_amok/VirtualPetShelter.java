package pets_amok;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

    Map<String, VirtualPet> allPets = new HashMap<String, VirtualPet>();

    public VirtualPetShelter() {

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

    public void playWithDogs(String organicDogs) {
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

    public void cleanTheCommunalLitterBox() {
        for (VirtualPet virtualPet : getAllVirtualPets()) {
            if (virtualPet instanceof OrganicCat) {
                ((OrganicCat) virtualPet).cleanTheCommunalLitterBox();
            }
        }
    }

    public void cleanADogCage() {
        for (VirtualPet virtualPet : getAllVirtualPets()) {
            if (virtualPet instanceof OrganicDog) {
                ((OrganicDog) virtualPet).cleanTheIndDogCage();
            }
        }
    }

    public void updateAllTick(Collection<VirtualPet> pets) {
        for (VirtualPet pet : pets) {
            pet.tick();
        }

    }

    // iterate through pets and display them

    public void allOrganicPetStatus() {
        for (VirtualPet virtualPet : getAllVirtualPets()) {
            if (virtualPet instanceof Organic) {
                ((Organic) virtualPet).allPetStatus();

                System.out.println(
                        "\nNAME\t\t|HUNGER|THIRST\t|BOREDOM|DESCRIPTION\t\t\t\t\t|HEALTH\t\t|");
                System.out.println(
                        "----------------|-------|-------|-------|--------------------------------------------------|-----|");
                System.out.println(virtualPet.getPetName() + "\t\t| " + ((Organic) virtualPet).getPetHungerLevel()
                        + "\t| " + ((Organic) virtualPet).getPetThirstLevel() + "\t| "
                        + ((Organic) virtualPet).getPetBoredomLevel()
                        + "\t| " + virtualPet.getPetDescription() + "| " + virtualPet.getPetHealth() + "\t\t| ");
            }
            System.out.println(
                    "------------------------------------------------------------------------------------------------------");
        }
    }

    public void allRoboticPetStatus() {
        for (VirtualPet virtualPet : getAllVirtualPets()) {
            if (virtualPet instanceof Robotic) {
                ((Robotic) virtualPet).allPetStatus();

                System.out.println(
                        "\nNAME\t\t|OIL LEVEL\t|CONDITION\t|DESCRIPTION\t|HEALTH\t|");
                System.out.println(
                        "------------------------|-------|-------|-------|--------------------|---------|");
                System.out.println(virtualPet.getPetName() + "\t\t| " + ((Robotic) virtualPet).getOilLevel()
                        + "\t| " + ((Robotic) virtualPet).getCondition() + "\t| "
                        + virtualPet.getPetDescription() + "\t| " + virtualPet.getPetHealth() + "\t| ");
            }
            System.out.println(
                    "-----------------------------------------------------------------------");
        }
    }
}
