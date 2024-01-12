package day2assignments;

public class IsPrimeNumber {

	public static void main(String[] args) {
		int[] Number = { 5, 6, 7, 8, 9, 12, 10 };
		boolean isprime = false;

		for (int i = 0; i < Number.length; i++) {
			isprime = true;
			for (int j =2; j < Number[i] / 2; j++) {
				if (Number[i] % j == 0) {
					isprime = false;
					break;
				}
			}
			System.out.println(Number[i] + (isprime == true ? " is Prime" : " is Not Prime"));

		}

	}

}
