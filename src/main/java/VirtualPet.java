public abstract class VirtualPet {
    protected String petName;
    protected String petDescription;
    protected int petHungerLevel;
    protected int petThirstLevel;
    protected int petBoredomLevel;
    protected int petHealth;
    protected int petWasteLitterBox;
    protected int petWasteCage;

    public VirtualPet(String petName, String petDescription, int petHealth) {
        this.petName = petName;
        this.petDescription = petDescription;
        this.petHealth = petHealth;
        this.petHungerLevel = 50;
        this.petThirstLevel = 50;
        this.petBoredomLevel = 50;
        this.petHealth = 50;

    }

    public VirtualPet(String petName, String petDescription, int petHungerLevel, int petThirstLevel,
            int petBoredomLevel, int petHealth) {
        this.petName = petName;
        this.petDescription = petDescription;
        this.petHungerLevel = petHungerLevel;
        this.petThirstLevel = petThirstLevel;
        this.petBoredomLevel = petBoredomLevel;
        this.petHealth = petHealth;

    }

    public abstract void petHappiness();

    public void tick() {
        // increase this calling object's thirst, hunger, boredom -using getters and
        // setters

        int currentHungerLevel = this.getPetHungerLevel();
        this.setPetHungerLevel(currentHungerLevel + 1);

        int currentThirstLevel = this.getPetThirstLevel();
        this.setPetThirstLevel(currentThirstLevel + 1);

        int currentBoredomLevel = this.getPetBoredomLevel();
        this.setPetBoredomLevel(currentBoredomLevel + 1);

        int currentPetHealth = this.getPetHealth();
        this.setPetHealth(currentPetHealth + 1);

        int currentPetWasteCage = this.getPetWasteCage();
        this.setPetWasteCage(currentPetWasteCage + 1);

        int currentPetWasteLitterBox = this.getPetWasteLitterBox();
        this.setPetWasteLitterBox(currentPetWasteLitterBox + 1);
    }

    @Override
    public String toString() {
        return petName + " Pet Health: " + petHealth;
    }

    public String getPetName() {
        return this.petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
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

    public int getPetBoredomLevel() {
        return this.petBoredomLevel;
    }

    public void setPetBoredomLevel(int petBoredomLevel) {
        this.petBoredomLevel = petBoredomLevel;
    }

    public String getPetDescription() {
        return this.petDescription;
    }

    public void setPetDescription(String petDescription) {
        this.petDescription = petDescription;

    }

    public int getPetHealth() {
        return this.petHealth;
    }

    public void setPetHealth(int petHealth) {
        this.petHealth = petHealth;
    }

    public int getPetWasteLitterBox() {
        return this.petWasteLitterBox;
    }

    public void setPetWasteLitterBox(int petWasteLitterBox) {
        this.petWasteLitterBox = petWasteLitterBox;
    }

    public int getPetWasteCage() {
        return this.petWasteCage;
    }

    public void setPetWasteCage(int petWasteCage) {
        this.petWasteCage = petWasteCage;

    }

}
