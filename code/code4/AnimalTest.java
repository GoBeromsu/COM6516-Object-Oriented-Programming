package code4;

public class AnimalTest {

    Animal[] animals = new Animal[3];


    public AnimalTest() {
        animals[0] = new Cow();
        animals[1] = new Pig();
        animals[2] = new Sheep();
    }

    public static void main(String[] args) {
        AnimalTest test = new AnimalTest();

        for (Animal animal : test.animals) {
            animal.talk();
        }
    }
}
