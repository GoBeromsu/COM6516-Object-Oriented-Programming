package code5;

import java.util.ArrayList;
import java.util.List;

public class EvenMoreList {
    public static void main(String[] args) {
        // Create lists a and b with at least three elements each
        List<String> a = new ArrayList<>(List.of("x", "y", "z"));
        List<String> b = new ArrayList<>(List.of("p", "q", "r", "s"));

        // Part a: Merge list b into a in an interleaved fashion
        List<String> mergedList = new ArrayList<>();
        int i = 0, j = 0;
        while (i < a.size() || j < b.size()) {
            if (i < a.size()) mergedList.add(a.get(i++));
            if (j < b.size()) mergedList.add(b.get(j++));
        }
        a = mergedList;

        System.out.println("After interleaving b into a:");
        System.out.println("a: " + a);
        System.out.println("b: " + b);

        // Part b: Remove every second element from b
        List<String> tempB = new ArrayList<>();
        for (int k = 0; k < b.size(); k += 2) {
            tempB.add(b.get(k));
        }
        b = tempB;

        System.out.println("\nAfter removing every second element from b:");
        System.out.println("a: " + a);
        System.out.println("b: " + b);

        // Part c: Remove all elements in b from a
        a.removeAll(b);

        System.out.println("\nAfter removing all elements of b from a:");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }
}
