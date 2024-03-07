package pets_amok;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class VirtualPetTest {

    private RoboticDog underTestRD;
    private OrganicDog underTestOD;

    @BeforeEach
    public void setup() {
        underTestOD = new OrganicDog("petName", "petDescription");
        underTestRD = new RoboticDog("petName", "petDescription");
    }

    @Test
    public void hungerTest() {
        int check = underTestOD.getPetHungerLevel();
        assertEquals(50, check);

    }

    @Test
    public void thirstTest() {
        int check = underTestOD.getPetThirstLevel();
        assertEquals(50, check);

    }

    @Test
    public void boredomTest() {
        int check = underTestOD.getPetBoredomLevel();
        assertEquals(50, check);
    }

    @Test
    public void tickTest1() {
        underTestOD.tick();
        assertEquals(51, underTestOD.getPetHungerLevel());
    }

    @Test
    public void tickTest2() {
        underTestOD.tick();
        assertEquals(51, underTestOD.getPetThirstLevel());
    }

    @Test
    public void tickTest3() {
        underTestOD.tick();
        assertEquals(51, underTestOD.getPetBoredomLevel());

    }

    @Test
    public void oilTest() {
        underTestRD.performOilChange();
        int check = underTestRD.getOilLevel();
        assertEquals(60, check);

    }

    @Test
    public void maintenanceTest() {
        underTestRD.performMaintenance();
        int check = underTestRD.getCondition();
        assertEquals(60, check);

    }

    @Test
    public void dogCageTest() {
        underTestOD.cleanADogCage();
        int check = underTestOD.getCageNeedsCleaned();
        assertEquals(40, check);

    }
}
