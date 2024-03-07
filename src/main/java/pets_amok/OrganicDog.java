package pets_amok;

public class OrganicDog extends Organic implements Dog {

    public OrganicDog(String petName, String petDescription) {
        super(petName, petDescription);
    }

    private int cageNeedsCleaned = 50;
    
    public void cleanDogCages() {
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
        int newPetHungerLevel = getPetHungerLevel() +1;
        setPetHungerLevel(newPetHungerLevel);
        int newPetThirstLevel = getPetThirstLevel() +1;
        setPetThirstLevel(newPetThirstLevel);
        int newPetBoredomLevel = getPetBoredomLevel() +1;
        setPetBoredomLevel(newPetBoredomLevel += 1);
        int newPetHealth = getPetHealth();
        int newPetHappiness = getPetHappiness();
        setCageNeedsCleaned(this.cageNeedsCleaned -= 2);
        if (this.getCageNeedsCleaned() < 25) {
            setCageNeedsCleaned(this.cageNeedsCleaned -= 5);
        }
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
