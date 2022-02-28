import java.util.ArrayList;

public class FellowshipStarter {
    public static void main(String[] args) {
        ArrayList<String> fellowship = new ArrayList<String>();
        fellowship.add("Frodo");
        fellowship.add("Sam");
        fellowship.add("Merry");
        fellowship.add("Pippin");
        fellowship.add("Aragorn");
        fellowship.add("Boromir");
        fellowship.add("Legolas");
        fellowship.add("Gimli");
        fellowship.add("Gandalf");

        // insert code here //

        for (int i = 0; i < fellowship.size(); i++) {
            if (fellowship.get(i).equals("Sam")) {
                fellowship.add(i + 1, "Sam");
                i++;
            }

            if (fellowship.get(i).equals("Merry")) {
                fellowship.set(i, "Master Brandybuck");
            } else if (fellowship.get(i).equals("Pippin")) {
                fellowship.set(i, "Fool of a Took");
            }

            if (fellowship.get(i).length() == 7 || fellowship.get(i).substring(0, 1).toLowerCase().equals("g")) {
                fellowship.remove(i);
                i--;
            }
        }

        System.out.println(fellowship);

        // ---------------- //
    }
}