package week1.day1;

public class FindNumber {

	public static void main(String[] args) {
		
		//conditional statements (if)
		
		int a=45;
		String Name="Hem";
		
		//check the number is greater than or less than
		if(a>0)
		{
			System.out.println("The Number is positive");
		}
		else if(a==0)
		{
			System.out.println("The Number is equal to zero");
		}
		else
		{
			System.out.println("The Number is negative");
		}
		
		//to check the given string is matches
		
		if(Name.toString()=="Hem") {
			System.out.println("Name Matches");
		}
		else
		{
			System.out.println("Name not matched");
		}

	}

}
