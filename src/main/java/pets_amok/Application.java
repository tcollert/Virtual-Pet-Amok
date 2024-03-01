package pets_amok;

import java.util.Collection;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        VirtualPetShelter catsAndDogs = new VirtualPetShelter();

        Scanner input = new Scanner(System.in);

        OrganicDog sonic = new OrganicDog("Sonic ", " The Blue Heeler known as the Blue Blur.");
        OrganicDog tails = new OrganicDog("Tails ", " A Red Heeler and Sonic's best friend.");
        OrganicCat amy = new OrganicCat("Amy ", " She is a fun loving calico kitten with lots of energy");
        OrganicCat blaze = new OrganicCat("Blaze ", "The organge Tabby cat who likes to lay in the sun");
        RoboticDog robotnik = new RoboticDog("Robotnik ",
                " Robotinik is a robot dog who loves science and is a little on the mischievous side.");
        RoboticDog metalSonic = new RoboticDog("Metal Sonic ",
                " Sonic's robotic twin, Metal Sonic is a robotic Blue Heeler.");
        RoboticCat scratch = new RoboticCat("Scratch ",
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

        Collection<VirtualPet> collection = catsAndDogs.getAllVirtualPets();

        System.out.println(
                "Hey there! Welcome to our shelter! We are excited to have a new friend to play with. What is your name?");
        System.out.println("            |\\_/|         \\___/\r\n" + //
                "            (0_0)         (0_o)\r\n" + //
                "           ==(Y)==         (V)\r\n" + //
                "----------(u)---(u)----oOo--U--oOo---\r\n" + //
                "__|_______|_______|_______|_______|___ ");

        String newFriendsName = input.nextLine();
        System.out.println(
                "It is great to meet you " + newFriendsName + "!" + " My friends and I cannot wait to hang out!");
        System.out.println("Let me introduce you to my friends." + catsAndDogs.getAllVirtualPets());

        while (true) {

            System.out.println("What should we do today?");
            System.out.println(">> [0] Take a walk with Sonic and Tails");
            System.out.println(">> [1] Feed the organic pets.");
            System.out.println(">> [2] Chill and have some Vitamin water with your organic pals.");
            System.out.println(">> [3] Adopt a friend to spend the day with.");
            System.out.println(">> [4] Bring a new friend for us at the Shelter.");
            System.out.println(">> [5] Clean a dog cage.");
            System.out.println(">> [6] Oil the robotic pets.");
            System.out.println(">> [7] Maintain the robotic pets.");
            System.out.println(">> [8] quit");

            int choice = input.nextInt();

            if (choice == 0) {
                System.out.println("Awesome! Who would you like to hang out with today? ");
                System.out.println(catsAndDogs.getAllVirtualPets());
                input.nextLine();
                String answer = input.nextLine();
                String organicDogs = answer;
                catsAndDogs.playWithDogs(organicDogs);
                System.out.println("You played with " + organicDogs);

            } else if (choice == 1) {
                catsAndDogs.feedMyPet();

            } else if (choice == 2) {
                catsAndDogs.hydrateMyPet();

            } else if (choice == 3) {
                System.out.println("Which pet would you like to adopt?");
                System.out.println(catsAndDogs.getAllVirtualPets());
                input.nextLine();
                String answer = input.nextLine();
                String petToBeAdopted = answer;
                catsAndDogs.allPets.remove(petToBeAdopted);
                System.out.println(petToBeAdopted + " has been adopted!");

            } else if (choice == 4) {
                System.out.println("Please choose a name for our new pet...");
                input.nextLine();
                String newPetName = input.nextLine();
                System.out.println("Please give a brief description of our new pet...");
                String petDescription = input.nextLine();
                System.out.println("Is the pet organic or robotic? Enter your answer.");
                String petType = input.nextLine();
                System.out.println("Is your pet a cat or dog?");
                String petCatOrDog = input.nextLine();
                if (petType == "robotic" && petCatOrDog == "cat") {
                    catsAndDogs.addPet(new RoboticCat(newPetName, petDescription));
                } else if (petType == "robotic" && petCatOrDog == "dog") {
                    catsAndDogs.addPet(new RoboticDog(newPetName, petDescription));
                    System.out.println("Thanks for bringing us a new friend!");
                } else if (petType == "organic" && petCatOrDog == "cat") {
                    catsAndDogs.addPet(new OrganicCat(newPetName, petDescription));
                    System.out.println("Thanks for bringing us a new friend!");
                } else if (petType == "organic" && petCatOrDog == "dog")
                    ;
                catsAndDogs.addPet(new OrganicDog(newPetName, petDescription));
                System.out.println("Thanks for bringing us a new friend!");

            } else if (choice == 5) {
                System.out.println("Whose cage would you like to clean...Sonic or Tails?");
                input.nextLine();
                String answer = input.nextLine();
                String cleanCage = answer;
                catsAndDogs.cleanADogCage();
                System.out.println("Thanks for cleaning " + cleanCage + "'s cage!");

            } else if (choice == 6) {
                catsAndDogs.oilChangeAll();

            } else if (choice == 7) {
                catsAndDogs.maintenanceRoboticPets();

            } else if (choice == 8) {
                break;
            }
            catsAndDogs.allOrganicPetStatus();
            catsAndDogs.allRoboticPetStatus();
            catsAndDogs.updateAllTick(collection);
        }

        input.close();
    }
}