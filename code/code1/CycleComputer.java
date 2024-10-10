package code1;

import sheffield.EasyReader;

public class CycleComputer {

    // Constant for the wheel diameter
    public static final double WHEEL_DIAMETER = 0.665; // meters
    public static final double PI = 3.1415927;

    public static void main(String[] args) {
        // Step 1: Read data from the file
        EasyReader inputFile = new EasyReader("code1/timings.txt");
        int numTimes = inputFile.readInt();  // The number of timing values
        double[] timings = new double[numTimes];  // Array to store the timings

        // Step 2: Read the timings from the file
        for (int i = 0; i < numTimes; i++) {
            timings[i] = inputFile.readDouble();
        }

        // Step 3: Calculate instantaneous speeds for each rotation (in km/h)
        double[] speeds = new double[numTimes];  // Array to store speeds
        for (int i = 0; i < numTimes; i++) {
            speeds[i] = calculateSpeed(timings[i]);  // m/s to km/h conversion done in method
            System.out.println("Speed for rotation " + (i + 1) + ": " + speeds[i] + " km/h");
        }

        // Step 4: Calculate the maximum speed
        double maxSpeed = findMaxSpeed(speeds);
        System.out.println("Maximum speed: " + maxSpeed + " km/h");

        // Step 5: Calculate the total distance traveled
        double totalDistance = calculateTotalDistance(numTimes); // In km
        System.out.println("Total distance traveled: " + totalDistance + " km");

        // Step 6: Calculate the total time taken for the journey (in minutes)
        double totalTime = calculateTotalTime(timings);  // In minutes
        System.out.println("Total time taken: " + totalTime + " minutes");
    }

    // Method to calculate the instantaneous speed in km/h
    public static double calculateSpeed(double time) {
        double circumference = PI * WHEEL_DIAMETER;  // Circumference in meters
        double speed = (circumference / time) * 3.6; // Speed in m/s converted to km/h
        return speed;
    }

    // Method to find the maximum speed
    public static double findMaxSpeed(double[] speeds) {
        double maxSpeed = speeds[0];
        for (double speed : speeds) {
            if (speed > maxSpeed) {
                maxSpeed = speed;
            }
        }
        return maxSpeed;
    }

    // Method to calculate the total distance traveled (in km)
    public static double calculateTotalDistance(int rotations) {
        double circumference = PI * WHEEL_DIAMETER;  // In meters
        double totalDistance = (circumference * rotations) / 1000;  // Convert to kilometers
        return totalDistance;
    }

    // Method to calculate the total time taken (in minutes)
    public static double calculateTotalTime(double[] timings) {
        double totalTime = 0.0;
        for (double time : timings) {
            totalTime += time;
        }
        return totalTime / 60;  // Convert seconds to minutes
    }
}
