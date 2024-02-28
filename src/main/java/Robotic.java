import java.util.Random;

public abstract class Robotic extends VirtualPet {

    public Robotic(String petName, String petDescription) {
        super(petName, petDescription);
      
    }

    protected Random run = new Random();

    protected int oilLevel = 50;
    protected int condition = 50;
   
  
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
