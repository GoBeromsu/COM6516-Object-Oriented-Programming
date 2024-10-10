package code2;

public class TestFoodStore {
    public static void main(String[] args) {
        // create a new FoodStore object called myFoodStore
        // by invoking the constructor
        FoodStore myFoodStore = new FoodStore(10);
        // display the amount stored by calling the getAmountStored
        // method associated with the myFoodStore object
        System.out.println("Contains " + myFoodStore.getAmountStored());

        myFoodStore.depositFood(1);
        System.out.println(myFoodStore.toString());

        myFoodStore.withdrawFood(1);
        System.out.println(myFoodStore.toString());

    }

}
