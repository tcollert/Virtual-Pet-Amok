public class OrganicCat extends Organic implements Cat {

    protected static int litterBoxNeedsCleaned = 0;

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
    public void currentStatus() {

    }

    @Override
    public void running() {
      
    }

}
