package pets_amok;

public abstract class VirtualPet {

    protected String petName;
    protected String petDescription;
    protected int petHealth;
    protected int petHappiness;

    public VirtualPet(String petName, String petDescription) {
        this.petName = petName;
        this.petDescription = petDescription;
        this.petHealth = 50;

    }

    public VirtualPet(String petName) {
        this.petName = petName;

    }

    public void walk() {

    }

    public void cleanADogCage(){
        
    }

    public abstract void condition();

    public abstract void petHappiness();

    public abstract void tick();

    public abstract void allPetStatus();

    @Override
    public String toString() {
        return petName + petDescription + ". Pet Health: " + petHealth;
    }

    public String getPetName() {
        return this.petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
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

}