package Calendar; 

public class Day {
    private String event;
    private boolean isOpen;

    public String getEvent() {
        return event;
    }
    public boolean isOpen() {
        return isOpen;
    }
    public void setOpen(boolean isOpen) {
        this.isOpen = isOpen;
    }
    public void setEvent(String event) {
        this.event = event;
    }

    public String toString() {
        return event + " " + isOpen;
    }


}