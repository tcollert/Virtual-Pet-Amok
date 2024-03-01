package pets_amok;
public class OrganicDog extends Organic implements Dog {

    public OrganicDog(String petName, String petDescription) {
        super(petName, petDescription);
       
    }

    protected static int cageNeedsCleaned = 50;

    public void cleanTheIndDogCage(){
        cageNeedsCleaned = this.getGetPetWasteInCage();
      int updatedPetWasteInCage = cageNeedsCleaned- 10;
      this.setGetPetWasteInCage(updatedPetWasteInCage);


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

    public void walk() {
        if (run.nextBoolean()) {
            petBoredomLevel -= newAmt + newAmtMult;
            if (petBoredomLevel < lowLevel) {
                petBoredomLevel = lowLevel;
                int petHappiness = this.getPetHealth();
                int noPooInCage = this.getPetWasteInCage();
                int updatedPetHealth = petHappiness + 10;
                int updatedPetWasteCage = noPooInCage - 10;
                this.setPetHealth(updatedPetHealth);
                this.setPetWasteInCage(updatedPetWasteCage);
            }
        }
    }

    private void setPetWasteInCage(int updatedPetWasteCage) {
    }

    private int getPetWasteInCage() {
        return this.getPetWasteInCage;

    }

    @Override
    public void cleanCage() {

    }

    @Override
    public void condition() {

    }

    @Override
    public void tick() {


    }

    @Override
    public void allPetStatus() {
       
    }

}
