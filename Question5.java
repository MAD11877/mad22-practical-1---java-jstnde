import java.util.ArrayList;
import java.util.Scanner;

public class Question5 {
	public static void main(String[] args) {
		/**
		 * Prompt the user for number. This input indicates the number of integers the user will be entering next.
		 * Print out the mode (highest occurrence) from the set of integers.
		 *    e.g.
		 *     > 5
		 *     > 2
		 *     > 4
		 *     > 1
		 *     > 3
		 *     > 4
		 *     4
		 *
		 *    e.g.
		 *     > 4
		 *     > 2
		 *     > 2
		 *     > 3
		 *     > 3
		 *     2
		 * Hint: Use a loop to get input. Use another 2 loops to find the mode
		 */

		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		ArrayList<Integer> arr = new ArrayList<>();
		for (int i = 0; i < x; i++) {
			arr.add(in.nextInt());
		}
		ArrayList<Integer> counts = new ArrayList<>();

		for (int i = 0; i < arr.size(); i++) {
			int count = 1;
			for (int j = i + 1; j < arr.size(); j++) {
				if (arr.get(i) == arr.get(j)) {
					count++;
					arr.remove(j);
					j--;
				}
			}
			counts.add(count);
		}

		int max = 0;
		for (int i = 0; i < arr.size(); i++) {
			if (max < counts.get(i)) {
				max = counts.get(i);
			}
		}

		for (int i = 0; i < arr.size(); i++) {
			if (max == counts.get(i)) {
				System.out.println(arr.get(i));
			}
		}
	}
}
