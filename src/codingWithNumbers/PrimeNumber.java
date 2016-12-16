package codingWithNumbers;

public class PrimeNumber {
	public static boolean isPrime(int prime_number) {
		if (prime_number <= 1)// 1 is not a prime number
			return false;
		if (prime_number == 2)// 2 is only even prime number
			return true;
		if (prime_number % 2 == 0)//excluding all even numbers
			return false;
		for (int i = 2; i < prime_number; i++) {
			if (prime_number % i == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		int max = 100;
		for (int i = 1; i <= max; i++) {
			if (isPrime(i)) {
				System.out.print(i + ", ");
			}

		}
	}
}
