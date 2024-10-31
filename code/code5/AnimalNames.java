package code5;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class AnimalNames {
    public static void main(String[] args) {
        // Create a fixed-size list of animal names
        List<String> fixedList = Arrays.asList("elephant", "lion", "leopard", "tiger");

        // Convert the fixed list to a modifiable LinkedList
        List<String> myList = new LinkedList<>(fixedList);

        // Get a ListIterator to navigate through the LinkedList
        ListIterator<String> iter = myList.listIterator();

        // Iterate through the list and convert each name to uppercase
        while (iter.hasNext()) {
            // Get the next element, convert it to uppercase, and replace the original element
            String upperCaseName = iter.next().toUpperCase();
            iter.set(upperCaseName);
        }

        // Print the modified list with uppercase names
        System.out.println(myList);
    }
}
