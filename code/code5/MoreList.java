package code5;

import java.util.*;

public class MoreList {

    /**
     * Takes two lists and returns a new list with elements that occur in either input list but not in both.
     * @param list1 The first input list
     * @param list2 The second input list
     * @return A new list with elements that are in either list1 or list2, but not in both
     */
    public static List<String> eitherNotBoth(List<String> list1, List<String> list2) {
        // Convert lists to sets to remove duplicates and enable set operations
        Set<String> set1 = new HashSet<>(list1);
        Set<String> set2 = new HashSet<>(list2);

        // Create a new set to store the result
        Set<String> result = new HashSet<>(set1);

        // Find elements that are only in one of the sets (symmetric difference)
        result.addAll(set2); // Add all elements from set2
        Set<String> intersection = new HashSet<>(set1); // Create a set for the intersection
        intersection.retainAll(set2); // Retain only elements present in both sets
        result.removeAll(intersection); // Remove the intersection from the result

        // Convert the result set back to a list
        return new ArrayList<>(result);
    }

    // Test the eitherNotBoth method
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("apple", "banana", "cherry", "date");
        List<String> list2 = Arrays.asList("banana", "date", "fig", "grape");

        List<String> result = eitherNotBoth(list1, list2);
        System.out.println("Elements in either list1 or list2, but not in both:");
        System.out.println(result); // Expected output: [apple, cherry, fig, grape]
    }
}
