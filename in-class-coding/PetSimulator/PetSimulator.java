package PetSimulator;

public class PetSimulator {
  public static void main(String[] args) {
    // create an array that can hold 10 pets
    Pet[] pets = new Pet[10];

    // adopt four pets, two cats, two dogs
    pets[0] = new Pet("Odin", Pet.CAT);
    pets[1] = new Pet("Knittens", Pet.CAT);
    pets[2] = new Pet("Link", Pet.DOG);
    pets[3] = new Pet("Frey", Pet.DOG);

    // first things first, feed your
    for (Pet p : pets) {
      if (p != null)
        p.feed();
    }

    // next, make yourself the owner of all of your new pets
    for (Pet p : pets) {
      if (p != null)
        p.setOwner("yourself");
    }

    // your dogs make some noise, take them for a walk
    for (Pet p : pets) {
      if (p != null) {
        if (p.getType() == Pet.DOG) {
          p.makeNoise();
          p.walk();
        }
      }
    }

    // when you get back, your cats make some noise
    for (Pet p : pets) {
      if (p != null) {
        if (p.getType() == Pet.CAT) {
          p.makeNoise();
        }
      }
    }

    // Giv them all a treat
    for (Pet p : pets) {
      if (p != null)
        p.giveTreat();
    }

    // groom your cats
    for (Pet p : pets) {
      if (p != null) {
        if (p.getType() == Pet.CAT) {
          p.groom();
        }
      }
    }

    // grooming is done, play with all pets
    for (Pet p : pets) {
      if (p != null)
        p.play();
    }

    // whew, that was tiring, all pets nap and then get fed
    for (Pet p : pets) {
      if (p != null) {
        p.sleep();
        p.feed();
      }
    }

    System.out.println("--- MY PETS ---");
    // show the state of all of your pets
    for (Pet p : pets) {
      if (p != null)
        System.out.println(p);
    }

    // You decide to get a couple of pets for your friend (no looping required here)
    pets[4] = new Pet("Loki", Pet.CAT);
    pets[5] = new Pet("PooPoo", Pet.DOG);

    // set the owner of only the new pets to your friends name
    for (Pet p : pets) {
      if (p != null) {
        if (p.getOwner() == null) {
          p.setOwner("your friends name");
        }
      }
    }

    System.out.println("--- MY PETS ---");
    // show the state of all of your pets
    for (Pet p : pets) {
      if (p != null) {
        if (p.getOwner().equals("yourself")) {
          System.out.println(p);
        }
      }
    }
  }
}