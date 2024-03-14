package pets_amok;

public class OrganicDog extends Organic implements Dog {

    private int cageNeedsCleaned = 50;

    public OrganicDog(String petName, String petDescription) {
        super(petName, petDescription);
    }
    
    public int getCageNeedsCleaned() {
        return this.cageNeedsCleaned;
    }

    public void setCageNeedsCleaned(int cageNeedsCleaned) {
        this.cageNeedsCleaned = cageNeedsCleaned;
    }

    public void cleanDogCages() {
        cageNeedsCleaned = this.getCageNeedsCleaned();
        int updatedPetWasteInCage = cageNeedsCleaned - 10;
        this.setCageNeedsCleaned(updatedPetWasteInCage);
    }

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
    public void tick() {
        super.tick();
        setCageNeedsCleaned(this.cageNeedsCleaned -= 2);
        if (this.getCageNeedsCleaned() < 25) {
            setCageNeedsCleaned(this.cageNeedsCleaned -= 5);
        }
    }
}
