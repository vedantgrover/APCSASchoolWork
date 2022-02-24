public class Board {

    private final int MAX_NUMBER = 100;
    protected int currentNumber;
    protected boolean isFinished = false;

    protected String displayString = "Current Number: ";

    public Board() {
        currentNumber = (int) (Math.random() * MAX_NUMBER) + 10;
        //System.out.println(displayString + currentNumber);
    }

    public int subtractAmount(int n) {
        if (currentNumber == 0) {
            isFinished = true;
            return 0;
        } else {
            return currentNumber-=n;
        }
    }

    public String toString() {
        return displayString + currentNumber;
    }
    
}
