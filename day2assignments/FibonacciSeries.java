package day2assignments;

public class FibonacciSeries {

	public static void main(String[] args) {
		int range = 8;
		int FirstVal=0;
		int SecondVal=1;
		int FibVal=0;

		for (int i = 0; i < range; i++) {
			System.out.print(FirstVal + ","); //initially it prints 0,1
			FibVal=FirstVal+SecondVal; //adding first& second val=0+1, Fibval=1,2
			FirstVal=SecondVal;//Firstval=0,Secondval=1, assing secondval to FirstVal=1,2
			SecondVal=FibVal;//Assinging Fibval to second val=1
			continue;
		}

	}

}
