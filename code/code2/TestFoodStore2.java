package code2;

import sheffield.*;

public class TestFoodStore2 {
    public static void main(String[] args) {

        EasyReader keyboard = new EasyReader();

        // Prompt user for the initial amount of food and create a FoodStore object
        int amount = keyboard.readInt("Input the initial amount of food: ");
        FoodStore myFoodStore = new FoodStore(amount);

        boolean simulate = true;

        // Loop to handle user transactions
        while (simulate) {
            int transaction = keyboard.readInt("Choose 1, 2, or 3. 1: deposit, 2: withdraw, 3: exit");

            switch (transaction) {
                case 1:
                    // Deposit food into the store
                    int deposit = keyboard.readInt("Enter the amount to deposit: ");
                    myFoodStore.processTransaction(deposit);
                    break;
                case 2:
                    // Withdraw food from the store
                    int withdraw = keyboard.readInt("Enter the amount to withdraw: ");
                    myFoodStore.processTransaction(-withdraw);
                    break;
                case 3: // Exit the loop
                    simulate = false;
                    break;
                default:
                    // Handle invalid input
                    System.out.println("Invalid option. Try again.");
            }
        }

        // Display the final status of the FoodStore
        System.out.println(myFoodStore.toString());

        // Run automated tests after user input
        runAutomatedTests();
    }

    // Method to run automated tests on FoodStore class functionality
    private static void runAutomatedTests() {
        System.out.println("\nRunning automated tests...");

        // Create two identical FoodStore objects for testing
        FoodStore testStore1 = new FoodStore(100);
        FoodStore testStore2 = new FoodStore(100);

        // Perform the same transactions on both test stores
        testStore1.processTransaction(50);
        testStore2.processTransaction(50);
        testStore1.processTransaction(-20);
        testStore2.processTransaction(-20);

        // Check if both test stores are in the same state
        if (testStore1.equals(testStore2)) {
            System.out.println("Test Passed: Both FoodStore objects are equal.");
        } else {
            System.out.println("Test Failed: FoodStore objects are not equal.");
        }

        // Perform a different transaction on testStore1
        testStore1.processTransaction(30);
        // Check if the stores are now unequal
        if (!testStore1.equals(testStore2)) {
            System.out.println("Test Passed: FoodStore objects are not equal after different transactions.");
        } else {
            System.out.println("Test Failed: FoodStore objects should not be equal.");
        }
    }
}
