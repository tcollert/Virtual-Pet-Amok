package pets_amok;

public class OrganicCat extends Organic implements Cat {

    public OrganicCat(String petName, String petDescription) {
        super(petName, petDescription);
    }

    @Override
    public void feedMe() {
        int feedMe = this.getPetHungerLevel();
        int updatedHungerLevel = feedMe - 10;
        this.setPetHungerLevel(updatedHungerLevel);
    }

    @Override
    public void hydration() {
        int hydration = this.getPetThirstLevel();
        int updatedThirstLevel = hydration - 10;
        this.setPetThirstLevel(updatedThirstLevel);
    }

    @Override
    public void petHappiness() {
    }

    @Override
    public void condition() {
    }
    
    @Override
    public void allPetStatus() {
    }

    @Override
    public void tick() {
        int newPetHungerLevel = getPetHungerLevel() +1;
        setPetHungerLevel(newPetHungerLevel);
        int newPetThirstLevel = getPetThirstLevel() +1;
        setPetThirstLevel(newPetThirstLevel);
        int newPetBoredomLevel = getPetBoredomLevel() +1;
        setPetBoredomLevel(newPetBoredomLevel += 1);
        int newPetHealth = getPetHealth();
        int newPetHappiness = getPetHappiness();
        if (newPetHungerLevel < 75) {
            setPetHealth(newPetHealth -= 1);
        }
        if (newPetThirstLevel < 75) {
            setPetHealth(newPetHealth -= 1);
        }
        if (newPetBoredomLevel < 25) {
            setPetHealth(newPetHealth -= 2);
        }
        if (newPetHappiness < 25) {
            setPetHealth(newPetHealth -= 2);
        }
        if (newPetHealth > 50) {
            setPetHappiness(newPetHappiness += 2);
        }
    }
}
