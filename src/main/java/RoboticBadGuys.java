public class RoboticBadGuys extends VirtualPet implements RoboticPets {

    int oilLevel = 50;
    int condition = 50;

    public RoboticBadGuys(String petName, String petDescription, int petHealth) {
        super(petName, petDescription, petHealth);

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

    public void maintenanceAll() {
        for (RobtoticPets roboticPets : getPetName()) {
            if (roboticsPets instanceof RoboticBadGuys) {
                ((RoboticBadGuys) roboticPets).maintenance();

            }
        }
    }

}
