package pets_amok;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

    Map<String, VirtualPet> allPets = new HashMap<String, VirtualPet>();

    private int litterBoxNeedsCleaned = 50;

    public VirtualPetShelter() {
    }

    public int getLitterBoxNeedsCleaned() {
        return this.litterBoxNeedsCleaned;
    }

    public void setLitterBoxNeedsCleaned(int litterBoxIsClean) {
        this.litterBoxNeedsCleaned = litterBoxIsClean;
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

    public Collection<VirtualPet> getAllOrganicDogs() {
        Collection<VirtualPet> getAllOrganicDogs = new ArrayList<>();
        for (VirtualPet searchPet : getAllVirtualPets()) {
            if (searchPet instanceof OrganicDog) {
                getAllOrganicDogs.add(searchPet);
            }
        }
        return getAllOrganicDogs;
    }

    public Collection<VirtualPet> getAllOrganicCats() {
        Collection<VirtualPet> getAllOrganicCats = new ArrayList<>();
        for (VirtualPet searchPet : getAllVirtualPets()) {
            if (searchPet instanceof OrganicCat) {
                getAllOrganicCats.add(searchPet);
            }
        }
        return getAllOrganicCats;
    }

    public void adoptPet(String petName) {
        allPets.remove(petName);
    }

    public void feedOrganicPets() {
        for (VirtualPet virtualPet : getAllVirtualPets()) {
            if (virtualPet instanceof Organic) {
                ((Organic) virtualPet).feedMe();
            }
        }
    }

    public void hydrateOrganicPets() {
        for (VirtualPet virtualPet : getAllVirtualPets()) {
            if (virtualPet instanceof Organic) {
                ((Organic) virtualPet).hydration();
            }
        }
    }

    public void walkOneOrganicDog(String requestedFriendToPlay) {
        for (Map.Entry<String, VirtualPet> entry : allPets.entrySet()) {
            String petName = entry.getKey();
            if (requestedFriendToPlay.equals(petName)) {
                entry.getValue().walk();
            }
        }
    }

    public void walkAllDogs() {
        for (VirtualPet virtualPet : getAllVirtualPets()) {
            if (virtualPet instanceof OrganicDog) {
                ((OrganicDog) virtualPet).walk();
            }
        }
    }

    public void maintenanceRoboticPets() {
        for (VirtualPet virtualPet : getAllVirtualPets()) {
            if (virtualPet instanceof Robotic) {
                ((Robotic) virtualPet).performMaintenance();
            }
        }
    }

    public void performOilChangeAll() {
        for (VirtualPet virtualPet : getAllVirtualPets()) {
            if (virtualPet instanceof Robotic) {
                ((Robotic) virtualPet).performOilChange();
            }
        }
    }

    public void cleanTheCommunalLitterBox() {
        litterBoxNeedsCleaned = this.getLitterBoxNeedsCleaned();
        int updatedPetWasteLitterBox = litterBoxNeedsCleaned - 10;
        this.setLitterBoxNeedsCleaned(updatedPetWasteLitterBox);
    }

    public void cleanDogCages() {
        for (VirtualPet virtualPet : getAllVirtualPets()) {
            if (virtualPet instanceof OrganicDog) {
                ((OrganicDog) virtualPet).cleanDogCages();
            }
        }
    }

    public void tick() {
        for (VirtualPet allVirtualPets : this.getAllVirtualPets()) {
            allVirtualPets.tick();
        }

        for (int cat = 0; cat < getAllOrganicCats().size(); cat++) {
            litterBoxNeedsCleaned = this.getLitterBoxNeedsCleaned();
            int updatedPetWasteLitterBox = litterBoxNeedsCleaned + 10;
            this.setLitterBoxNeedsCleaned(updatedPetWasteLitterBox);
        }
    }

    // iterate through pets and display them
    public void allOrganicPetStatus() {
        for (VirtualPet virtualPet : getAllVirtualPets()) {
            if (virtualPet instanceof OrganicDog) {
                ((OrganicDog) virtualPet).allPetStatus();

                System.out.println(
                        "\nORGANIC DOG NAME|HUNGER|THIRST\t|BOREDOM|DESCRIPTION\t\t\t\t|HEALTH|CAGE CLEANLINESS\t|");
                System.out.println(
                        "-----------------|------|-------|-------|------------------------------------------------|------|");
                System.out.println();
                System.out.println(virtualPet.getPetName() + "\t\t| " + ((Organic) virtualPet).getPetHungerLevel()
                        + "\t| " + ((Organic) virtualPet).getPetThirstLevel() + "\t| "
                        + ((Organic) virtualPet).getPetBoredomLevel()
                        + "\t| " + virtualPet.getPetDescription() + "\t| " + virtualPet.getPetHealth() + "\t\t|\t\t "
                        + ((OrganicDog) virtualPet).getCageNeedsCleaned());
            }
            System.out.println(
                    "----------------------------------------------------------------------------------------------------");
            if (virtualPet instanceof OrganicCat) {
                ((OrganicCat) virtualPet).allPetStatus();

                System.out.println(
                        "\nORGANIC CAT NAME|HUNGER|THIRST\t|BOREDOM|DESCRIPTION\t\t\t\t\t|HEALTH|LITTER BOX CLEANLINESS\t"
                                + getLitterBoxNeedsCleaned());
                System.out.println(
                        "-----------------|------|-------|-------|-----------------------------------------------|-------|");
                System.out.println();
                System.out.println(virtualPet.getPetName() + "\t\t| " + ((Organic) virtualPet).getPetHungerLevel()
                        + "\t| " + ((Organic) virtualPet).getPetThirstLevel() + "\t| "
                        + ((Organic) virtualPet).getPetBoredomLevel()
                        + "\t| " + virtualPet.getPetDescription() + "\t\t| " + virtualPet.getPetHealth() + "\t\t| ");
            }
        }
    }

    public void allRoboticPetStatus() {
        for (VirtualPet virtualPet : getAllVirtualPets()) {
            if (virtualPet instanceof Robotic) {
                ((Robotic) virtualPet).allPetStatus();

                System.out.println(
                        "\nROBOTIC NAME\t\t|OIL LEVEL|CONDITION|DESCRIPTION\t\t\t\t\t\t\t\t\t|HEALTH\t\t\t\t\t\t\t\t\t|");
                System.out.println(
                        "------------------------|-------|-------|-------------------------------------------------------------------------------------|-----|");
                System.out.println(virtualPet.getPetName() + "\t\t| " + ((Robotic) virtualPet).getOilLevel()
                        + "\t| " + ((Robotic) virtualPet).getCondition() + "\t| "
                        + virtualPet.getPetDescription() + "\t| " + virtualPet.getPetHealth() + "\t| ");
            }
            System.out.println(
                    "------------------------------------------------------------------------------------------------------------------------------------------");
        }
    }
}
