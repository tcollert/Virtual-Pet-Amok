package pets_amok;

public abstract class Organic extends VirtualPet {

    private int petHungerLevel;
    private int petThirstLevel;
    private int petBoredomLevel;

    public Organic(String petName, String petDescription) {
        super(petName, petDescription);
        this.petBoredomLevel = 50;
        this.petHungerLevel = 50;
        this.petThirstLevel = 50;
    }
    
    public int getPetBoredomLevel() {
        return this.petBoredomLevel;
    }

    public void setPetBoredomLevel(int petBoredomLevel) {
        this.petBoredomLevel = petBoredomLevel;
    }

    public int getPetHungerLevel() {
        return this.petHungerLevel;
    }

    public void setPetHungerLevel(int petHungerLevel) {
        this.petHungerLevel = petHungerLevel;
    }

    public int getPetThirstLevel() {
        return this.petThirstLevel;
    }

    public void setPetThirstLevel(int petThirstLevel) {
        this.petThirstLevel = petThirstLevel;
    }

    public void feedMe() {
        int feedMe = this.getPetHungerLevel();
        int updatedHungerLevel = feedMe - 10;
        this.setPetHungerLevel(updatedHungerLevel);
    }

    public void hydration() {
        int hydration = this.getPetThirstLevel();
        int updatedThirstLevel = hydration - 10;
        this.setPetThirstLevel(updatedThirstLevel);
    }
    
    @Override
    public void tick() {
        int currentHungerLevel = this.getPetHungerLevel();
        this.setPetHungerLevel(currentHungerLevel + 1);

        int currentThirstLevel = this.getPetThirstLevel();
        this.setPetThirstLevel(currentThirstLevel + 1);

        int currentBoredomLevel = this.getPetBoredomLevel();
        this.setPetBoredomLevel(currentBoredomLevel + 1);
        if (getPetHealth() < 0) {
            setPetHealth(0);
        }

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
}
