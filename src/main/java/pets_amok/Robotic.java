package pets_amok;

public abstract class Robotic extends VirtualPet {

    private int oilLevel = 50;
    private int condition = 50;

    public Robotic(String petName, String petDescription) {
        super(petName, petDescription);
    }

    public int getOilLevel() {
        return this.oilLevel;
    }

    public void setOilLevel(int oilLevel) {
        this.oilLevel = oilLevel;
    }

    public int getCondition() {
        return this.condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public void performMaintenance() {
        int newCondition = getCondition() +10;
        setCondition(newCondition);
    }

    public void performOilChange() {
        int newLevel = getOilLevel() +10;
        setOilLevel(newLevel);
    }

    @Override
    public void tick() {
        int newPetHealth = getPetHealth();
        int newPetHappiness = getPetHappiness();
        setOilLevel(this.oilLevel -= 1);
        setCondition(this.condition -= 1);
        if (this.oilLevel < 25) {
            setPetHealth(newPetHealth -= 1);
        }
        if (this.condition < 25) {
            setPetHealth(newPetHealth -= 1);
        }
        if (newPetHappiness < 25) {
            setPetHealth(newPetHealth -= 1);
        }
        if (this.oilLevel < 25) {
            setPetHappiness(newPetHappiness -= 2);
        }
        if (newPetHappiness < 25) {
            setPetHealth(newPetHealth -= 2);
        }
        if (newPetHealth > 50) {
            setPetHappiness(newPetHappiness += 2);
        }
    }
}
