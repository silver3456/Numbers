package codingWithNumbers;

public class PalindromeNumbers {
	public static void main (String []args){
		int number = 454;;
		int reverse = 0;
		int origin = number;
		
		while (number > 0){
			reverse = reverse * 10 + number %10;
			number = number / 10; }
		if (origin == reverse) System.out.println(origin + " is palindrome number");
		
		else System.out.println (origin + "is not palindrome number");
			
			
		}
		
	}


