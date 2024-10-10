package code2;

public class TestBasket {


    public static void main(String[] args) {
        Item[] shopping = {
                new Item("baked beans", 0.3),
                new Item("tomato soup", 0.4)
        };
        Basket basket = new Basket(shopping);

        for (Item item : shopping) {
            System.out.println(item.toString());
        }
        System.out.println("Basket total : " + basket.total());
    }
}
