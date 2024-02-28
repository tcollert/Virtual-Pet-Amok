import java.util.Random;

public abstract class VirtualPet {

    protected String petName;
    protected String petDescription;
    protected int petBoredomLevel;
    protected int petHealth;
    protected int petHappiness;

    protected int lowLevel = 0;
    protected int highLevel = 100;
    protected int failLevel = (int) (highLevel / 1.25);
    protected int newAmt = 5;
    protected int newAmtMult = 4;

    protected Random run = new Random();

    public void walk() {
        if (run.nextBoolean()) {
            petBoredomLevel -= newAmt + newAmtMult;
            if (petBoredomLevel < lowLevel) {
                petBoredomLevel = lowLevel;
            }
        }
    }

    public VirtualPet(String petName, String petDescription) {
        this.petName = petName;
        this.petDescription = petDescription;
        this.petBoredomLevel = 50;
        this.petHealth = 50;

    }

    public VirtualPet(String petName) {
        this.petName = petName;

        petHappiness += newAmt + newAmtMult;
        if (petHappiness > highLevel) {
            petHappiness = highLevel;
        }
    }

    public abstract void condition();

    public abstract void feedMe();

    public abstract void hydration();

    public abstract void running();

    public abstract void petHappiness();

    public abstract void tick();
    // increase this calling object's thirst, hunger, boredom -using getters and
    // setters

    public abstract void currentStatus();

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

    public int getPetHappiness() {
        return this.petHappiness;
    }

    public void setPetHappiness(int petHappiness) {
        this.petHappiness = petHappiness;
    }

    public int getLowLevel() {
        return this.lowLevel;
    }

    public void setLowLevel(int lowLevel) {
        this.lowLevel = lowLevel;
    }

    public int gethighLevel() {
        return this.highLevel;
    }

    public void setMaxLevel(int highLevel) {
        this.highLevel = highLevel;
    }

    public int getFailLevel() {
        return this.failLevel;
    }

    public void setFailLevel(int failLevel) {
        this.failLevel = failLevel;
    }

    public int getNewAmt() {
        return this.newAmt;
    }

    public void setNewAmt(int newAmt) {
        this.newAmt = newAmt;
    }

    public int getNewAmtMult() {
        return this.newAmtMult;
    }

    public void setNewAmtMult(int newAmtMult) {
        this.newAmtMult = newAmtMult;
    }

}
