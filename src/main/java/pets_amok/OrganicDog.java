package pets_amok;

public class OrganicDog extends Organic implements Dog {

    public OrganicDog(String petName, String petDescription) {
        super(petName, petDescription);
    }

    private int cageNeedsCleaned = 50;

    public void cleanADogCage() {
        cageNeedsCleaned = this.getCageNeedsCleaned();
        int updatedPetWasteInCage = cageNeedsCleaned - 10;
        this.setCageNeedsCleaned(updatedPetWasteInCage);
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
    public void walk() {
        int petHappiness = this.getPetHealth();
        int noPooInCage = this.getCageNeedsCleaned();
        int updatedPetHealth = petHappiness + 10;
        int updatedPetWasteCage = noPooInCage - 10;
        int boredomDecrease = this.getPetBoredomLevel();
        this.setPetBoredomLevel(boredomDecrease - 10);
        this.setPetHealth(updatedPetHealth);
        this.setCageNeedsCleaned(updatedPetWasteCage);
    }

    @Override
    public void condition() {
    }

    @Override
    public void allPetStatus() {
    }
    
    public int getCageNeedsCleaned() {
        return this.cageNeedsCleaned;
    }

    public void setCageNeedsCleaned(int cageNeedsCleaned) {
        this.cageNeedsCleaned = cageNeedsCleaned;
    }

    @Override
    public void tick() {
        setPetHungerLevel(this.petHungerLevel += 1);
        setPetThirstLevel(this.petThirstLevel += 1);
        setPetBoredomLevel(this.petBoredomLevel + 1);
        setCageNeedsCleaned(this.cageNeedsCleaned -= 2);
        if (this.getCageNeedsCleaned() < 25) {
            setCageNeedsCleaned(this.cageNeedsCleaned -= 5);
        }
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
}
