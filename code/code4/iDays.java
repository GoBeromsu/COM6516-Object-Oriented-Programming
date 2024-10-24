package code4;

class iDays implements iTime {
    private final int days;

    public iDays(int days) {
        this.days = days;

    }

    public int getMinutes() {
        return days * 24 * 60;
    }
}