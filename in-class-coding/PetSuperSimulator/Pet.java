package PetSuperSimulator;

public class Pet {
    public static final int CAT = 1;
    public static final int DOG = 2;
  
    private String name;
  
    private int energy;
    private int happy;
  
    /*---------- constructors ----------*/
    // public Pet(String name, int type) {
    //   this.name = name;
  
    //   energy = 25;
    //   happy = 20;
    // }
  
    /*---------- accessors ----------*/
    public String getName() {
      return name;
    }


    /*---------- mutators for name and owner ----------*/
    public void setName(String name) {
      this.name = name;
    }
  
    /*------ mutators that change happy or energy   ----------*/
    public void feed() {
      energy += 10;
      happy += 5;
      System.out.println(name + " says: Mealtime!");
    }
  
    public void sleep() {
      energy += 5;
      System.out.println(name + " says: zzzzzzzzzzzzzzzzzzz");
    }
  }
  