package code2;

import sheffield.*;

public class TestFoodStore2 {
    public static void main(String[] args) {

        EasyReader keyboard = new EasyReader();

        // Initial food amount
        int amount = keyboard.readInt("Input the initial amount of food: ");
        FoodStore myFoodStore = new FoodStore(amount);

        boolean simulate = true;

        while (simulate) {
            int transaction = keyboard.readInt("Choose 1, 2, or 3. 1: deposit, 2: withdraw, 3: exit");

            switch (transaction) {
                case 1:
                    int deposit = keyboard.readInt("Enter the amount to deposit: ");
                    myFoodStore.processTransaction(deposit);
                    break;
                case 2:
                    int withdraw = keyboard.readInt("Enter the amount to withdraw: ");
                    myFoodStore.processTransaction(-withdraw);
                    break;
                case 3: // 종료
                    simulate = false;
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }

        // 결과 출력
        System.out.println(myFoodStore.toString());

        // 자동 테스트 실행
        runAutomatedTests();
    }

    private static void runAutomatedTests() {
        System.out.println("\nRunning automated tests...");

        FoodStore testStore1 = new FoodStore(100);
        FoodStore testStore2 = new FoodStore(100);

        // 동일한 트랜잭션을 수행합니다.
        testStore1.processTransaction(50);
        testStore2.processTransaction(50);
        testStore1.processTransaction(-20);
        testStore2.processTransaction(-20);

        // 두 객체가 동일한 상태인지 테스트합니다.
        if (testStore1.equals(testStore2)) {
            System.out.println("Test Passed: Both FoodStore objects are equal.");
        } else {
            System.out.println("Test Failed: FoodStore objects are not equal.");
        }

        // 다른 상태의 테스트
        testStore1.processTransaction(30);
        if (!testStore1.equals(testStore2)) {
            System.out.println("Test Passed: FoodStore objects are not equal after different transactions.");
        } else {
            System.out.println("Test Failed: FoodStore objects should not be equal.");
        }
    }
}
