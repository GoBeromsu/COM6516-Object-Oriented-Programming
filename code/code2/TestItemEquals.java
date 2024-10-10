package code2;

import code2.Item;

public class TestItemEquals {
    public static void main(String[] args) {
        System.out.println("----------------------");
        System.out.println("Test Item objects using the generic equals() method from the Object class");
        System.out.println("----------------------");

        Item item1 = new Item("baked beans", 0.3);
        Item item2 = new Item("tomato soup", 0.4);
        Item item3 = new Item("baked beans", 0.3);
        Item item4 = item1;
        String testObject = "Hello World";

        System.out.println("Testing whether [" + item1 + "] equals [" + item2 + "]");
        System.out.println("Result is " + item1.equals(item2));

        System.out.println("Testing whether [" + item1 + "] equals [" + item3 + "]");
        System.out.println("Result is " + item1.equals(item3));

        System.out.println("Testing whether [" + item1 + "] equals [" + item4 + "]");
        System.out.println("Result is " + item1.equals(item4));

        System.out.println("Testing whether [" + item1 + "] equals [" + testObject + "]");
        System.out.println("Result is " + item1.equals(testObject));

        System.out.println("\n----------------------");
        System.out.println("Test Item objects using the equals() method from the ItemWithEquals class");
        System.out.println("Notice the difference");
        System.out.println("----------------------");

        ItemWithEquals itemA = new ItemWithEquals("baked beans",0.3);
        ItemWithEquals itemB = new ItemWithEquals("tomato soup",0.4);
        ItemWithEquals itemC = new ItemWithEquals("baked beans",0.3);
        ItemWithEquals itemD = itemA;

        System.out.println("Testing whether [" + itemA + "] equals [" + itemB + "]");
        System.out.println("Result is " + itemA.equals(itemB));

        System.out.println("Testing whether [" + itemA + "] equals [" + itemC + "]");
        System.out.println("Result is " + itemA.equals(itemC));

        System.out.println("Testing whether [" + itemA + "] equals [" + itemD + "]");
        System.out.println("Result is " + itemA.equals(itemD));

        System.out.println("Testing whether [" + itemA + "] equals [" + testObject + "]");
        System.out.println("Result is " + itemA.equals(testObject));
    }
}
