public class RoboticDog extends Robotic implements Dog {


    public RoboticDog(String petName, String petDescription) {
        super(petName, petDescription);
      
    }

    @Override
    public void oilChange() {
        oilLevel += 10;
    }

    @Override
    public void maintenance() {
        condition += 10;

    }

    @Override
    public void petHappiness() {
        int health = this.getPetHealth();
        int updatedPetHappiness = health + 10;
        this.setPetHealth(updatedPetHappiness);

            }

    @Override
    public void cleanCage() {
       
    }

    @Override
    public void condition() {

    }

    @Override
    public void feedMe() {
       
    }

    @Override
    public void tick() {
      
    }

    @Override
    public void currentStatus() {
      
    }
}
