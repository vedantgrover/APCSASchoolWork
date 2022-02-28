import java.util.ArrayList;

public class ArithmeticGeometricMean {
    public static void main(String[] args) {
        ArrayList<Double> arrList = new ArrayList<Double>();

        arrList.add(4.0);
        arrList.add(7.0);
        arrList.add(7.0);
        arrList.add(1.0);
        arrList.add(9.0);

        System.out.println(arithmeticMean(arrList));
        System.out.println(geometricMean(arrList));
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

        return Math.pow(product, 1.0/arryList.size());
    }
}
