package code2;

public class ItemWithEquals {

    private final double price;
    private final String name;

    public ItemWithEquals(String n, double p) {
        name = n;
        price = p;
    }

    public static void main(String[] args) {
        String TESTNAME = "testObject";
        double TESTPRICE = 10.0;
        Item testObject = new Item(TESTNAME, TESTPRICE);
        System.out.println("Name:");
        System.out.println("Actual field " + testObject.getName());
        System.out.println("Expected " + TESTNAME);

        System.out.println("\n");
        System.out.println("Price:");
        System.out.println("Actual field " + testObject.getPrice());
        System.out.println("Expected " + TESTPRICE);
    }


    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        // now we can cast and do something specific for Item
        ItemWithEquals item = (ItemWithEquals) obj;
        return (name.equals(item.getName())) && price == item.getPrice();
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String toString() {
        return ("object type = " + getClass() + "; " + name + " = ukp" + price);
    }

}
