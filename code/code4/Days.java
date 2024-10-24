package code4;

class Days extends Time {
    private int days;

    public int getMinutes() {
        return days * 24 * 60;
    }
}