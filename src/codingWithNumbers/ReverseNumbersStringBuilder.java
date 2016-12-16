package codingWithNumbers;

public class ReverseNumbersStringBuilder {

	public static void main(String[] args) {
		int number = 12345;
		String number_string = String.valueOf(number);
		StringBuffer string_buffer = new StringBuffer(number_string);
		string_buffer.reverse();
		String reversed_string = string_buffer.toString();
		int reverse = Integer.parseInt(reversed_string);
		System.out.println("Reverse: " + reverse);
	}

}
