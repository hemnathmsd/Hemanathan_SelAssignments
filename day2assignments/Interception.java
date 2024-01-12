package day2assignments;

public class Interception {

	public void InterceptionFinder(int a[], int b[]) {
		for (int i = 0; i <= a.length - 1; i++) {
			for (int j = 0; j <= b.length - 1; j++) {
				if (a[i] == b[j])
					System.out.println("The Match Number is :" + a[i]);

			}
		}

	}

	public static void main(String[] args) {
		int a[] = { 3, 2, 11, 4, 6, 7 };
		int b[] = { 1, 2, 8, 4, 9, 7 };
		Interception PD = new Interception();
		PD.InterceptionFinder(a, b);

	}

}
