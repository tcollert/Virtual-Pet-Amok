import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

    Map<String, VirtualPet> ourPets = new HashMap<String, VirtualPet>();

    public VirtualPetShelter(Map<String, VirtualPet> ourPets) {
        this.ourPets = ourPets;
    }
    @param pet

    public String getSonicAndFriends() {
        String friendsList = "";
        for (Map.Entry<String, VirtualPet> entry : sonicSuperStars.entrySet()) {
            friendsList += (" Pet Name: " + entry.getKey());
            friendsList += (", Pet Description: " + entry.getValue().getPetDescription());

        }
        return friendsList;
    }

    public void addPet(VirtualPet pet) {
        sonicSuperStars.put(pet.getPetName(), pet);
    }

    public VirtualPet findPet(String petName) {
        return sonicSuperStars.get(petName);
    }

    public Collection<VirtualPet> getAllPets() {
        return sonicSuperStars.values();
    }

    public void adoptPet(VirtualPet pet) {
        sonicSuperStars.remove(pet.getPetName(), pet);
    }

    public void feedMyPet() {
        for (Map.Entry<String, VirtualPet> sonicSuperStars : sonicSuperStars.entrySet()) {
            VirtualPet food = sonicSuperStars.getValue();
        VirtualPet.feedMe();
        }
    }

    
    public void hydrateMyPet() {
        for (Map.Entry<String, VirtualPet> sonicSuperStars : sonicSuperStars.entrySet()) {
            VirtualPet water = sonicSuperStars.getValue();
            VirtualPet.hydration();
        }
    }

   
    public void playWithOneFriend(String requestedFriendToPlay) {
        for (Map.Entry<String, VirtualPet> entry : sonicSuperStars.entrySet()) {
            String petName = entry.getKey();
            if (requestedFriendToPlay.equals(petName)) {
                entry.getValue().running();
            }
        }
    }

    public void maintenanceAll() {
        for (VirtualPet virtualPet : getAllPets()) {
            if (virtualPet instanceof Robotic) {
                ((Robotic) virtualPet).maintenance();

            }
        }
    }

    public void oilChangeAll() {
        for (VirtualPet virtualPet : getAllPets()) {
            if (virtualPet instanceof Robotic) {
                ((Robotic) virtualPet).oilChange();
            }

        }
    }

    // update tick for all pets
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
