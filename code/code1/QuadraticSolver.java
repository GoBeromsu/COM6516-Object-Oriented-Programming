package code1;

import sheffield.EasyReader;

public class QuadraticSolver {
    public static void main(String[] arg) {

        EasyReader keyboard = new EasyReader();
        double a = keyboard.readDouble("Input a value for a: ");
        double b = keyboard.readDouble("Input a value for b: ");
        double c = keyboard.readDouble("Input a value for c: ");

        // Handle the case where 'a' is zero (not a quadratic equation)
        if (a == 0) {
            System.out.println("This is not a quadratic equation (a cannot be 0).");
            return;
        }
        double x1, x2;
        double discriminant = b * b - 4 * a * c;
        double sqrtDiscriminant = Math.sqrt(discriminant);

        // Handle negative discriminant (complex roots)
        if (discriminant < 0) {
            System.out.println("The equation has complex roots (discriminant is negative).");
            return;
        }

        // Check for equal roots (discriminant == 0)
        if (discriminant == 0) {
            x1 = -b / (2 * a);
            System.out.println("The equation has one real double root: x = " + x1);
            return;
        }

        if (b > 0) {
            x1 = (-b - sqrtDiscriminant) / (2 * a);
            x2 = (2 * c) / (-b - sqrtDiscriminant);
        } else {
            x1 = (-b + sqrtDiscriminant) / (2 * a);
            x2 = (2 * c) / (-b + sqrtDiscriminant);
        }
        // Output both roots
        System.out.println("Root x1 = " + x1);
        System.out.println("Root x2 = " + x2);
    }
}
