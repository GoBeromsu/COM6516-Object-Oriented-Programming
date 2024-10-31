package code5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Shakespeare {
	public static void main(String[] args) {
		String line;
		String wd;
		StringTokenizer st;
		List<String> words = new LinkedList<>();

		// Read data from file and split into tokens, i.e., words
		try {
			Scanner file = new Scanner(new File("shakespeare.txt"));

			while (file.hasNext()) {
				line = file.nextLine();
				st = new StringTokenizer(line, " .,:?'");

				while (st.hasMoreTokens()) {
					wd = st.nextToken();
					words.add(wd);
				}
			}
			file.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return;
		}

		// Part a: Display words beginning with 'a' (case-insensitive)
		System.out.println("Words beginning with 'a':");
		Iterator<String> iterator = words.iterator();
		while (iterator.hasNext()) {
			String word = iterator.next();
			if (word.toLowerCase().startsWith("a")) {
				System.out.println(word);
			}
		}

		// Part b: Sort words in a case-insensitive manner
		words.sort(String.CASE_INSENSITIVE_ORDER);
		System.out.println("\nSorted words:");
		System.out.println(words);

		// Part c: Count occurrences of each word (case-insensitive)
		Map<String, Integer> wordCount = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
		for (String word : words) {
			String lowerCaseWord = word.toLowerCase();
			wordCount.put(lowerCaseWord, wordCount.getOrDefault(lowerCaseWord, 0) + 1);
		}

		System.out.println("\nWord count:");
		for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}
}
