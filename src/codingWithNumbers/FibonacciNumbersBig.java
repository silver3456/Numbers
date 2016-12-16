package codingWithNumbers;

import java.math.BigInteger;

public class FibonacciNumbersBig {
	public static void main(String[] args) {
		int max = 1000;
		BigInteger[] fibonacci = new BigInteger[max];
		fibonacci[0] = BigInteger.ZERO;
		fibonacci[1] = BigInteger.ONE;
		for (int i = 2; i < max; i++) {
			fibonacci[i] = fibonacci[i - 1].add(fibonacci[i - 2]);
		}
		for (int i = 0; i < max; i++) {
			// Reverse: for (int i = fibonacci.length -1; i >=0; i--){
			System.out.println((i + 1) + ":" + fibonacci[i]);
		}
	}
}
