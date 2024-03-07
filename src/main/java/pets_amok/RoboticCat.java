package pets_amok;

public class RoboticCat extends Robotic implements Cat {

    public RoboticCat(String petName, String petDescription) {
        super(petName, petDescription);
    }

    @Override
    public void performOilChange() {
        int newLevel = getOilLevel() +10;
        setOilLevel(newLevel);
    }

    @Override
    public void performMaintenance() {
        int newCondition = getCondition() +10;
        setCondition(newCondition);
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
