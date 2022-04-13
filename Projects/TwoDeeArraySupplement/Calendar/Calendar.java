package Calendar;

public class Calendar {

    private Day[][] year;

    String[] seasons = { "Spring", "Summer", "Fall", "Winter" };

    public Calendar() {
        // initializes 'year[][]' as a 4x28 array where each row counts as
        // a season and each season counts as a day. The year starts with
        // Spring, Day 1 and ends with Winter, Day 28. Each season has 28
        // days.

        year = new Day[4][28];
        for (int row = 0; row < year.length; row ++) {
            for (int col = 0; col < year[0].length; col++) {
                year[row][col] = new Day();
            }
        }

        // Each Day in the year[][] should store the default String:
        // <Season>, Day <num>: no event scheduled

        // For example, the day associated with Fall, Day 22 should have the
        // 'event' attribute read >> "Fall, Day 22: no event scheduled"

        // Additionally, the boolean attribute 'isOpen' should be set to 'true'
        // for each day.

        for (int row = 0; row < year.length; row++) {
            for (int col = 0; col < year[0].length; col++) {
                year[row][col].setEvent(seasons[row] + ", Day " + (col + 1) + ": no event scheduled");
                year[row][col].setOpen(true);
            }
        }

        // You may not modify any contents of the Day class.
    }

    /**
     * Gets a Day object from year[][] given the season and day input.
     * 
     * For example, getDayByDate(Spring,2) return year[0,1].
     * getDayByDate(Summer,17) returns year[1,16]
     * 
     * @param season
     * @param day
     * @return
     */
    public Day getDayByDate(String season, int day) {
        int numSeason = findSeason(season);
        if (day > year[0].length || numSeason == -1)
            return null;

        return year[numSeason][day - 1];
    }

    /**
     * This method inputs a season and a day and sets the event attribute for
     * the Day object to the event parameter.
     * 
     * @param season
     * @param day
     */
    public void addEvent(String season, int day, String event) {
        int numSeason = findSeason(season);
        if (day > year[0].length || numSeason == -1) {
            System.out.println("Incorrect Parameters while adding event.");
            return;
        }

        year[numSeason][day - 1].setEvent(event);
    }

    /**
     * Resets the Day object to be the default string (desribed above in the
     * constuctor)
     * Turns the Day object attribute isOpen to true.
     */
    public void clearDay(String season, int day) {
        int numSeason = findSeason(season);
        if (day > year[0].length || numSeason == -1) {
            System.out.println("Incorrect Parameters while clearing day.");
            return;
        }

        year[numSeason][day].setEvent(seasons[numSeason] + ", Day " + day + ": no event scheduled");
        year[numSeason][day].setOpen(true);
    }

    /**
     * Searches the year array for the first day that contains the parameter
     * keyword (not case-sensitive).
     * 
     * @param keyword string to search for
     * @return Day object
     */
    public Day findEventByKeyword(String keyword) {
        for (Day[] row : year) {
            for (Day d : row) {
                if (d.getEvent().toLowerCase().contains(keyword.toLowerCase())) {
                    return d;
                }
            }
        }

        return null;
    }

    /**
     * Displays the entire season in the console, arranged vertically
     * 
     * @param season
     */
    public void displaySeason(String season) {
        int numSeason = findSeason(season);
        if (numSeason == -1) {
            System.out.println("Season not found.");
            return;
        }

        for (Day d : year[numSeason]) {
            System.out.println(d);
        }
    }

    private int findSeason(String season) {
        for (int i = 0; i < seasons.length; i++) {
            if (seasons[i].equalsIgnoreCase(season)) {
                return i;
            }
        }

        return -1;
    }

}
