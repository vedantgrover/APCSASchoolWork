package PetOverrides;

public class Pet {
  
    private String name;  
    private int energy;
    private int happy;

    public Pet(String name) {
      this.name = name;
      this.energy = 25;
      this.happy = 20;
    }

    /*------ methods ----------*/
    public void feed() {
      setEnergy(getEnergy() + 10);
      setHappy(getHappy() + 5);
      System.out.println(name + " says: Mealtime!");
    }
  
    public void sleep() {
      setEnergy(getEnergy() + 5);
      System.out.println(name + " says: zzzzzzzzzzzzzzzzzzz");
    }

    public void makeNoise() {
      System.out.println(this.name + " makes a noise!");
    }

    /*---------- accessors and mutators ----------*/
    public int getHappy() {
      return happy;
    }

    public void setHappy(int happy) {
      this.happy = happy;
    }

    public int getEnergy() {
      return energy;
    }

    public void setEnergy(int energy) {
      this.energy = energy;
    }

    public String getName() {
      return name;
    }
  
    public void setName(String name) {
      this.name = name;
    }
    
  }
  