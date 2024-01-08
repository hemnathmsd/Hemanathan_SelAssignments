package week1.day2;

public class FindoddNumbers {

	public static void main(String[] args) {
		
		int maxrange=10;
		System.out.println("List of odd and even numbers within number" + maxrange);
		
		for(int i=0 ;i<=maxrange ;i++) {
			if(i%2==1)
			{
				System.out.println("The Odd number is :" +i);
			}
			else {
				System.out.println("The even number is :" +i);
			}
		}
		System.out.println("\n" +"***Loop to check continue***"+"\n");
		
		for(int i=0 ;i<=maxrange ;i++) {
			if(i%2==1)
			{
				if(i==5)
					continue;
				System.out.println("Print after continue " +i);
				
				if(i==7)
					break;
				System.out.println("Print after break " +i);
			}
		}

	}

}
