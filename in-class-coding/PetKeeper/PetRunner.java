package PetKeeper;

public class PetRunner {
    public static void main(String[] args) {
        // create an array that can hold up to 10 pets (does not require looping)
        Pet[] pets = new Pet[10];
        // adopt (create and name) four pets: two cats, two dogs (does not require
        // looping)
        pets[0] = new Pet("Odin", Pet.CAT);
        pets[1] = new Pet("Loki", Pet.CAT);
        pets[2] = new Pet("Link", Pet.DOG);
        pets[3] = new Pet("Frey", Pet.DOG);

        // first things first, feed your pets
        for (Pet pet : pets) {
            if (pet == null)
                continue;
            pet.feed();
        }

        System.out.println();
        // next, make yourself the owner of all of your new pets
        for (Pet pet : pets) {
            if (pet == null)
                continue;
            pet.setOwner("Vedant");
        }
        System.out.println();
        // your dogs make some noise, take them for a walk
        for (Pet pet : pets) {
            if (pet == null || pet.getType() == pet.CAT)
                continue;
            pet.walk();
         }
        System.out.println();
        // when you get back, your cats make some noise

        // give all of your pets a treat
        for (Pet pet : pets) {
            if (pet == null)
                continue;
            pet.giveTreat();
        }
        System.out.println();
        // groom your cats
        for (Pet pet : pets) {
            if (pet == null || pet.getType() == pet.DOG)
                continue;
            pet.groom();
        }
        System.out.println();
        // grooming is done, play with all pets
        for (Pet pet : pets) {
            if (pet == null)
                continue;
            pet.play();
        }
        System.out.println();
        // whew, that was tiring, all pets nap and get fed
        for (Pet pet : pets) {
            if (pet == null) continue;
            pet.sleep();
            pet.feed();
        }
        System.out.println();

        System.out.println("--- MY PETS ---");
        // show the state of all of your pets
        for (Pet pet : pets) {
            if (pet == null) continue;
            System.out.println(pet.toString());
        }
        System.out.println();
        // You decide to get a couple of pets for your friend (does not require looping)
        pets[4] = new Pet("Poopy", Pet.CAT);
        pets[5] = new Pet("Poofy", Pet.DOG);
        // set the owner of the new pets to your friends name
        for (Pet pet : pets) {
            if (pet == null) continue;
            if (pet.getOwner() != null) continue;
            pet.setOwner("Lester Papadoupolis");
        }
        System.out.println();
        System.out.println("--- MY PETS ---");
        // show the state of all of your pets
        for (Pet pet : pets) {
            if (pet == null || pet.getOwner().equalsIgnoreCase("Lester Papadoupolis")) continue;
            System.out.println(pet.toString());
        }
    }
}
