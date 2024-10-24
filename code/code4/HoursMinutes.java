package code4;

class HoursMinutes extends Time {
    private int hours;
    private int minutes;

    public int getMinutes() {
        return hours * 60 + minutes;
    }
}