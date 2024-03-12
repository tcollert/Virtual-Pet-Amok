package pets_amok;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Map;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class VirtualPetShelterTest {

    private VirtualPetShelter catsAndDogs;

    @BeforeEach
    public void Setup() {
        catsAndDogs = new VirtualPetShelter();

        OrganicDog sonic = new OrganicDog("Sonic", " The Blue Heeler known as the Blue Blur.");
        OrganicDog tails = new OrganicDog("Tails", " A Red Heeler and Sonic's best friend.");
        OrganicCat amy = new OrganicCat("Amy", " She is a fun loving calico kitten with lots of energy");
        OrganicCat blaze = new OrganicCat("Blaze", "The organge Tabby cat who likes to lay in the sun");
        RoboticDog robotnik = new RoboticDog("Robotnik",
                " Robotinik is a robot dog who loves science and is a little on the mischievous side.");
        RoboticDog metalSonic = new RoboticDog("Metal Sonic",
                " Sonic's robotic twin, Metal Sonic is a robotic Blue Heeler.");
        RoboticCat scratch = new RoboticCat("Scratch",
                " He is a robotic kitten who loves to hang out with his pal Robotnik and get into trouble.");
        RoboticCat coconuts = new RoboticCat("Coconuts",
                "Coconuts is a goofy little robotic kitten who loves bananas and thinks she is a monkey");

        // adding pets to map
        catsAndDogs.addPet(sonic);
        catsAndDogs.addPet(tails);
        catsAndDogs.addPet(amy);
        catsAndDogs.addPet(blaze);
        catsAndDogs.addPet(robotnik);
        catsAndDogs.addPet(metalSonic);
        catsAndDogs.addPet(scratch);
        catsAndDogs.addPet(coconuts);
    }

    @Test
    public void hungerTest() {
        catsAndDogs.feedOrganicPets();

        for (Map.Entry<String, VirtualPet> entry : catsAndDogs.allPets.entrySet()) {
            if (entry.getValue() instanceof Organic) {
                assertEquals(40, ((Organic) entry.getValue()).getPetHungerLevel());
            }
        }
    }

    @Test
    public void thirstTest() {
        catsAndDogs.hydrateOrganicPets();

        for (Map.Entry<String, VirtualPet> entry : catsAndDogs.allPets.entrySet()) {
            if (entry.getValue() instanceof Organic) {
                assertEquals(40, ((Organic) entry.getValue()).getPetThirstLevel());
            }
        }

    }
    
    @Test
    public void tickTest1() {

        catsAndDogs.tick();

        for (Map.Entry<String, VirtualPet> entry : catsAndDogs.allPets.entrySet()) {
            if (entry.getValue() instanceof Organic) {
                assertEquals(51, ((Organic) entry.getValue()).getPetHungerLevel());
                assertEquals(51, ((Organic) entry.getValue()).getPetThirstLevel());
                assertEquals(51, ((Organic) entry.getValue()).getPetBoredomLevel());
            }
        }

    }

    @Test
    public void testAdopt() {

        catsAndDogs.adoptPet("Sonic");

        assertEquals(7, catsAndDogs.allPets.size());

    }

    @Test
    public void testAdd() {

        OrganicCat testPet = new OrganicCat("test", "test");
        catsAndDogs.addPet(testPet);

        assertEquals(9, catsAndDogs.allPets.size());
    }
}
