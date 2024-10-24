package code4;

public class Person {

    protected String name;
    protected String birth;

    Person(String name, String birth) {
        this.name = name;
        this.birth = birth;
    }

    @Override
    public String toString() {
        return " name : " + name + ", birth : " + birth;
    }
}