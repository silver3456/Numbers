package codingWithNumbers;

import java.util.Set;
import java.util.HashSet;

public class DuplicateNumbersHashSet {
	public static void main(String[] args) {
int []numbers = {50, 55, 21, 55, 2, 12, 21, 21, 21, 21};

Set<Integer> set = new HashSet<Integer>();
for (int n : numbers){
	boolean unique = set.add(n);
	if (!unique)
		System.out.println("Duplicate: " + n);
}
	}
}
