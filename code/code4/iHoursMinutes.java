package code4;

class iHoursMinutes implements iTime {
    private final int hours;
    private final int minutes;

    public iHoursMinutes(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    public int getMinutes() {
        return hours * 60 + minutes;
    }
}