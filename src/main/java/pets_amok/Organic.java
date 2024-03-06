package pets_amok;

public abstract class Organic extends VirtualPet {

    public Organic(String petName, String petDescription) {
        super(petName, petDescription);
        this.petBoredomLevel = 50;
        this.petHungerLevel = 50;
        this.petThirstLevel = 50;

    }

    private int petHungerLevel;
    private int petThirstLevel;
    private int petBoredomLevel;

    public abstract void hydration();

    public abstract void feedMe();

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
    }
}
