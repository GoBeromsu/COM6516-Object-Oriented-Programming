package code3;

public class TestCircle {
    public static void main(String args[]) {
        System.out.println(Circle.PI);
        System.out.println(Circle.radToDeg(3.141));

        Circle myCircle = new Circle(3);
        System.out.println(myCircle.toString());
        System.out.println(myCircle.getClass());

        Circle myCircle2 = new Circle(3);

        System.out.println(myCircle2.equals(myCircle));

    }

}
