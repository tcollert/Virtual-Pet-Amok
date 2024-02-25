public class OrganicGoodGuys extends VirtualPet implements OrganicPets {

    public OrganicGoodGuys(String petName, String petDescription, int petHealth, int petHungerLevel, int petBoredomLevel, int petThirstLevel) {
        super(petName, petDescription, petHealth, petHungerLevel, petBoredomLevel, petThirstLevel);
    
    }

    @Override
    public void feedMe() {
        int feedMe = this.getPetHungerLevel();
        int updatedHungerLevel = feedMe - 10;
        this.setPetHungerLevel(updatedHungerLevel);

    }

    @Override
    public void running() {
        int running = this.getPetBoredomLevel();
        int petHappiness = this.getPetHealth();
        int noPooInCage = this.getPetWasteCage();
        int updatedBoredomLevel = running - 10;
        int updatedPetHealth = petHappiness + 10;
        int updatedPetWasteCage = noPooInCage - 10;
        this.setPetBoredomLevel(updatedBoredomLevel);  
        this.setPetHealth(updatedPetHealth);
        this.setPetWasteCage(updatedPetWasteCage);
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


}
