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
    public void tick() {
        int newPetHealth = getPetHealth();
        int newPetHappiness = getPetHappiness();
        if (this.getPetHungerLevel() < 75) {
            setPetHealth(newPetHealth -= 1);
        }
        if (this.getPetThirstLevel() < 75) {
            setPetHealth(newPetHealth -= 1);
        }
        if (this.getPetBoredomLevel() < 25) {
            setPetHealth(newPetHealth -= 2);
        }
        if (newPetHappiness < 25) {
            setPetHealth(newPetHealth -= 2);
        }
        if (newPetHealth > 50) {
            setPetHappiness(newPetHappiness += 2);
        }
    }

    @Override
    public void condition() {
    }

    @Override
    public void allPetStatus() {
    }
}
