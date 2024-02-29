public class RoboticCat extends Robotic implements Cat {


    public RoboticCat(String petName, String petDescription) {
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

    @Override
    public void hydration() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'hydration'");
    }

    @Override
    public void running() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'running'");
    }

}
