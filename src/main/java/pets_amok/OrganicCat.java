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
        int health = this.getPetHealth();
        int updatedPetHappiness = health + 10;
        this.setPetHealth(updatedPetHappiness);

    }

    @Override
    public void condition() {

    }

    @Override
    public void tick() {
        setPetHungerLevel(this.petHungerLevel += 1);
        setPetThirstLevel(this.petThirstLevel += 1);
        setPetBoredomLevel(this.petBoredomLevel + 1);
        if (this.petHungerLevel < 75) {
            setPetHealth(this.petHealth -= 1);
        } 
        if (this.petThirstLevel < 75) {
            setPetHealth(this.petHealth -= 1);
        } 
        if (this.petBoredomLevel < 25) {
            setPetHealth(this.petHealth -= 2);
        }
         if (this.petHappiness < 25) {
            setPetHealth(this.petHealth -= 2);
        }
         if (this.petHealth > 50) {
            setPetHappiness(this.petHappiness += 2);
        }
    }

    @Override
    public void allPetStatus() {

    }



}
