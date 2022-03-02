import java.util.ArrayList;
import java.util.Scanner;

public class ArithmeticGeometricMean {
    public static void main(String[] args) {
        while (true) {
            ArrayList<Double> arrList = new ArrayList<Double>();

            Scanner sc = new Scanner(System.in);

            System.out.print("Please enter in your numbers.\nYou can ([q]uit) too.\nMake sure to seperate the numbers with commans! Max : 10\n>> ");
            String userResponse = sc.nextLine();

            String[] numbers = (userResponse.contains(", ")) ? userResponse.split(", ") : userResponse.split(",");

            if (numbers[0].toLowerCase().contains("q")) break;

            if (numbers.length > 10) {
                System.out.println("Too many numbers bro");
                continue;
            }

            for (String num : numbers) {
                arrList.add(Double.parseDouble(num));
            }

            System.out.println(arithmeticMean(arrList));
            System.out.println(geometricMean(arrList));
        }
    }

    public static double arithmeticMean(ArrayList<Double> arrList) {
        double sum = 0;
        for (Double num : arrList) {
            sum += num;
        }

        return sum / arrList.size();
    }

    public static double geometricMean(ArrayList<Double> arryList) {
        double product = 1;
        for (Double num : arryList) {
            product *= num;
        }

        return Math.pow(product, 1.0 / arryList.size());
    }
}
