package Dog;

import java.util.Arrays;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Dog[] myDogs = new Dog[3];
        Dog[] neighborDogs = new Dog[3];

        /**
         * 1) You know the names of your own dogs (make up dog names if needed), but
         * don't know the names
         * of your neighbor's dogs. Use the most logical constructors to initialize and
         * populate both
         * arrays, myDogs and neighborDogs, one using an initializer list and the other
         * using the
         * no-parameter constructor for Dog.
         */

        myDogs[0] = new Dog("Link");
        myDogs[1] = new Dog("Frey");
        myDogs[2] = new Dog("Maggie");

        System.out.println(Arrays.toString(myDogs));

        for (int i = 0; i < neighborDogs.length; i++) {
            neighborDogs[i] = new Dog();
        }

        /**
         * 2) What will happen when you run the following line of code?
         * myDog[0].sit();
         * Run a few more Dog methods on your Dog objects in the arrays.
         */

        myDogs[0].sit();
        myDogs[0].eat("apples");
        myDogs[0].goOutside(3);

        /**
         * 3) Display the names of all your dogs and the names. Use a Dog method to do
         * this. Do not modify the Dog class.
         */

        for (int i = 0; i < myDogs.length; i++) {
            System.out.print(myDogs[i].getName() + " :: ");
        }
        System.out.println();

        /**
         * 4) Your neighbor brings their dogs over to visit you, allowing you to finally
         * learn their names. Use Dog methods
         * to assign names to each of your neighbor's dogs. Use a Dog method to do this
         * and do not change the way your
         * neighborDogs array is declared/initialized.
         */

        for (int i = 0; i < neighborDogs.length; i++) {
            System.out.print("Oh wow! So what is Dog number " + (i + 1) + "'s name? ::> ");
            neighborDogs[i].setName(sc.nextLine());
        }

        System.out.println(Arrays.toString(neighborDogs));

        /**
         * 5) Add the following line to your code:
         * neighborDogs = {new Dog("Cinnamon"), new Dog("Mocha")}; // error
         * Why does this line of code throw an error?
         */

        // neighborDogs = {new Dog("Cinnamon"), new Dog("Mocha")}; // error

        sc.close();
    }
}