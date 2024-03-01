package pets_amok;
import java.util.Random;

public abstract class Organic extends VirtualPet {

    public Organic(String petName, String petDescription) {
        super(petName, petDescription);
        this.petBoredomLevel = 50;
        this.petHungerLevel = 50;
        this.petThirstLevel = 50;
        this.getPetWasteLitterBox = 50;
        this.getPetWasteInCage = 50;

    }

    protected Random run = new Random();

    protected int petHungerLevel;
    protected int petThirstLevel;
    protected int getPetWasteInCage;
    protected int getPetWasteLitterBox;
    protected int petBoredomLevel;

    public abstract void hydration();

    public abstract void feedMe();

    @Override
    public void tick() {
        if (petThirstLevel + petBoredomLevel >= gethighLevel()) {
            setPetHealth(getPetHealth() - getNewAmt());
            if (getPetHealth() < 0) {
                setPetHealth(0);
            }
        }
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

    public int getGetPetWasteLitterBox() {
        return this.getPetWasteLitterBox;
    }

    public void setGetPetWasteLitterBox(int getPetWasteLitterBox) {
        this.getPetWasteLitterBox = getPetWasteLitterBox;
    }


    public int getGetPetWasteInCage() {
        return this.getPetWasteInCage;
    }

    public void setGetPetWasteInCage(int getPetWasteInCage) {
        this.getPetWasteInCage = getPetWasteInCage;
    }

}
