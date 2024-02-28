import java.util.Random;

public abstract class Organic extends VirtualPet {

   
    
    public Organic(String petName, String petDescription) {
        super(petName, petDescription);
        
    }

        protected Random run = new Random();

        protected int petHungerLevel;
        protected int petThirstLevel;
       

        public int getPetHungerLevel() {
            return this.petHungerLevel;
        }
        public void setPetHungerLevel(int petHungerLevel) {
            this.petHungerLevel = petHungerLevel;
        }
        public int getPetThirstLevel() {
            return this.petThirstLevel;
        }
        public void setPetThirstLevel(int petThirstLevel) {
            this.petThirstLevel = petThirstLevel;
        }
  




 

}
