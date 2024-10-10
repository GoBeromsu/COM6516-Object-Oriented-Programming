package code2;

public class ItemWithEquals {

    // Fields to store the price and name of the item
    private final double price;
    private final String name;

    // Constructor to initialize an ItemWithEquals object with name and price
    public ItemWithEquals(String n, double p) {
        name = n;
        price = p;
    }

    public static void main(String[] args) {
        // Test values for creating an ItemWithEquals object
        String TESTNAME = "testObject";
        double TESTPRICE = 10.0;

        // Create a new ItemWithEquals object for testing
        ItemWithEquals testObject = new ItemWithEquals(TESTNAME, TESTPRICE);

        // Print the name field and check against expected value
        System.out.println("Name:");
        System.out.println("Actual field " + testObject.getName());
        System.out.println("Expected " + TESTNAME);

        System.out.println("\n");

        // Print the price field and check against expected value
        System.out.println("Price:");
        System.out.println("Actual field " + testObject.getPrice());
        System.out.println("Expected " + TESTPRICE);
    }
    
    // Todo: This is key point
    // Override equals method to check for equality based on name and price
    @Override
    public boolean equals(Object obj) {
        // Check if the two objects are the same reference
        if (this == obj) {
            return true;
        }
        // Check if the other object is null or of a different class
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        // Cast to ItemWithEquals and compare fields
        ItemWithEquals item = (ItemWithEquals) obj;
        return (name.equals(item.getName())) && price == item.getPrice();
    }

    // Getter for the name field
    public String getName() {
        return name;
    }

    // Getter for the price field
    public double getPrice() {
        return price;
    }

    // Override toString method to provide a readable representation of the object
    public String toString() {
        return ("object type = " + getClass() + "; " + name + " = ukp" + price);
    }
}
