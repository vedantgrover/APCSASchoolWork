import java.text.ChoiceFormat;
import java.util.ArrayList;

public class HorseBarnRunner {
  public static void main(String[] args) {
    HorseBarn barn = new HorseBarn();
    ArrayList<Horse> barnSpaces = barn.getSpaces();

    ArrayList<Integer> horseWeights = new ArrayList<Integer>();

    for (Horse h : barnSpaces) {
      horseWeights.add(h.getWeight());
    }

    double avg = StandardAlgorithms.getAverage(horseWeights);

    System.out.println(avg);

    System.out.println("Horses above average weight: ");
    for (Horse h : barnSpaces) {
      if (h.getWeight() > avg) {
        System.out.print(h + ": " + h.getWeight() + "\n");
      }
    }

    System.out.println("\nLightest and Heaviest horses: ");
    for (Horse h : barnSpaces) {
      if (h.getWeight() == StandardAlgorithms.getGreatestValue(horseWeights)) {
        System.out.println(h + " and " + h.getWeight());
      } else if (h.getWeight() == StandardAlgorithms.getMin(horseWeights)) {
        System.out.println(h + " and " + h.getWeight());
      }
    }

    for (int i = 0; i < barnSpaces.size(); i++) {
      if (barnSpaces.get(i).getName().equals("Duke")) {
        System.out.println("Out goes " + barnSpaces.set(i, new Horse("Princess", 1445)) + ". In comes Princess!");
      }

      if (barnSpaces.get(i).getName().equals("Silver")) {
        barnSpaces.add(i + 1, new Horse("Chief", 1505));
        System.out.println("In comes Chief");
      }

      if (barnSpaces.get(i).getName().equals("Buddy")) {
        barnSpaces.add(i, new Horse("Gypsy", 1335));
        i++;
        barnSpaces.add(i + 1, new Horse("Magic", 1425));
        System.out.println("Woah...Gypsy and Magic are here. That's insane");
      }
    }

    for (Horse h : barnSpaces) {
      System.out.println(h + ": " + h.getWeight());
    }

    // int numSpaces = barnSpaces.size();
    // for (int i = 0; i < barnSpaces.size(); i++) {
    // Horse h = barnSpaces.get(i);
    // if (h.getName().equals("Patches")) {
    // System.out.println("Bye Bye " + barnSpaces.remove(i));
    // i--;
    // } else if (h.getName().equals("Lady")) {
    // System.out.println("Bye bye " + barnSpaces.remove(i));
    // i--;
    // }
    // //System.out.println(h);
    // }

    // for (Horse horse : barnSpaces) {
    // // The following code tries to modify ArrayList. NOPE. Cannot modify
    // ArrayList Size in enhanced for loop
    // // if (horse.getName().equals("Patches")) {
    // // barnSpaces.remove(horse);
    // // }
    // System.out.println(horse);
    // }
  }
}