package pets_amok;

public class RoboticDog extends Robotic implements Dog{
    
    public RoboticDog(String petName, String petDescription) {
        super(petName, petDescription);
    }

    public void walk() {
        int petHappiness = this.getPetHealth();
        int updatedPetHealth = petHappiness + 10;
        this.setPetHealth(updatedPetHealth);
    }
}
