package pets_amok;

public abstract class Robotic extends VirtualPet {

    public Robotic(String petName, String petDescription) {
        super(petName, petDescription);

    }

    protected int oilLevel = 50;
    protected int condition = 50;

    public void oilChange() {

    }

    public void maintenance() {

    }

    @Override
    public void tick() {
        setOilLevel(this.oilLevel -= 1);
        setCondition(this.condition -= 1);
        if (this.oilLevel < 25) {
            setPetHealth(this.petHealth -= 1);
        }
        if (this.condition < 25) {
            setPetHealth(this.petHealth -= 1);
        }
        if (this.petHappiness < 25) {
            setPetHealth(this.petHealth -= 1);
        }
        if (this.oilLevel < 25) {
            setPetHappiness(this.petHappiness -= 2);
        }
        if (this.petHappiness < 25) {
            setPetHealth(this.petHealth -= 2);
        }
        if (this.petHealth > 50) {
            setPetHappiness(this.petHappiness += 2);
        }
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

}
