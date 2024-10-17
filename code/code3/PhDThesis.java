package code3;

public class PhDThesis extends Publication {

    private int numChapters;
    private String university;
    private String supervisor;


    PhDThesis(int numbChapters, String university, String supervisor,
              String t, String a, int i, int n) {
        super(t, a, i, n);
        this.numChapters = numbChapters;
        this.university = university;
        this.supervisor = supervisor;
    }

    // method
    public String toString() {
        return super.toString() + "[university=" + university + ",supervisor="
                + supervisor + ",numChapters=" + numChapters + "]";
    }


}
