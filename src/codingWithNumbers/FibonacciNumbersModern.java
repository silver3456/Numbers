package codingWithNumbers;

public class FibonacciNumbersModern {
	public static void main(String[] args) {
		int max = 93;
		long fibonacci = 0; // BigInteger fibonacci = BigInteger.ZERO;
		long fibonacci2 = 1; // BigInteger fibonacci2 = BigInteger.ONE;
		System.out.println(1 + ": " + fibonacci);

		for (int i = 2; i <= max; i++) {
			fibonacci = fibonacci + fibonacci2;// f =f.add(f2);
			fibonacci2 = fibonacci - fibonacci2;// f=f.subtract)(f2);
			System.out.println(i + ": " + fibonacci);
		}
	}
}
