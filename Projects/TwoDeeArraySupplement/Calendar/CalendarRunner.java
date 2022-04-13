package Calendar;

public class CalendarRunner {
    public static void main(String[] args) {
        Calendar c = new Calendar();

        // test your code here //
        // region
        c.addEvent("SumMer", 22, "Sandwiches");
        c.addEvent("Spring", 3, "Going to the country");
        c.addEvent("Spring", 4, "To eat a lot of peaches");
        c.displaySeason("Spring");
        System.out.println(c.getDayByDate("Summer", 22).toString());
        System.out.println(c.findEventByKeyword("eat").toString());
        System.out.println(c.findEventByKeyword("ing").toString());
        c.clearDay("SUmmer",22);
        c.displaySeason("Summer");
        // endregion //

        // DO NOT DELETE. For Code-checking purposes.

    }
}
