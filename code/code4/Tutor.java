package code4;

public class Tutor extends Person {

    private String office;

    Tutor(String office, String name, String birth) {
        super(name, birth);
        this.office = office;

    }

    @Override
    public String toString() {
        return "office: "+office+super.toString();
    }
}
