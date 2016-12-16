package codingWithNumbers;

import java.util.Arrays;

public class DuplicateNumbersArray {
	public static void main (String []args){
		int []numbers = {50, 55, 21, 55, 2, 12, 21, 21, 21, 21};
		Arrays.sort(numbers);
		for (int i = 1; i < numbers.length; i++){
			if (numbers[i] == numbers [i-1]){
				System.out.println ("Duplicate: " + numbers[i]);
			}
		}
	}

}
