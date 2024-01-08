package week1.day2;

import java.util.Arrays;

public class PrintDuplicates {

	public void DuplicateFinderMethod1(int num[]) {
		for (int i = 0; i < num.length - 1; i++) {
			if (num[i] == num[i + 1])
				System.out.println("The duplicated number in Method 1 is :" + num[i + 1]);

		}

	}

	public void DuplicateFinderMethod2(int num[]) {
		for (int i = 0; i <= num.length - 1; i++) {
			for (int j = i + 1; j <= num.length - 1; j++) {
				if (num[i] == num[j])
					System.out.println("The Duplicated number in Method 2 is :" + num[j]);

			}
		}

	}

	public static void main(String[] args) {
		int[] num = { 2, 5, 7, 7, 5, 9, 2, 3 };
		Arrays.sort(num);
		PrintDuplicates PD = new PrintDuplicates();
		PD.DuplicateFinderMethod1(num);
		System.out.println("********************************");
		PD.DuplicateFinderMethod2(num);

	}

}
