package pets_amok;
public class OrganicCat extends Organic implements Cat {

    protected static int litterBoxNeedsCleaned = 50;

    public OrganicCat(String petName, String petDescription) {
        super(petName, petDescription);

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
    public void condition() {

    }

    @Override
    public void tick() {

    }

    @Override
    public void allPetStatus() {

    }

    
    public void cleanTheCommunalLitterBox(){
          litterBoxNeedsCleaned = this.getGetPetWasteLitterBox();
        int updatedPetWasteLitterBox = litterBoxNeedsCleaned - 10;
        this.setGetPetWasteLitterBox(updatedPetWasteLitterBox);


    }

}
