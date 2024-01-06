package week1.day1;

public class FindNumber {

	public static void main(String[] args) {
		
		//conditional statements (if)
		
		int a=45;
		String Name="Hem";
		
		//check the number is greater than or less than
		System.out.println("*****To check the given number " + a +" is positive*****"+"\n");
		
		if(a>0)
		{
			System.out.println("The Number is positive"+"\n");
		}
		else if(a==0)
		{
			System.out.println("The Number is equal to zero"+"\n");
		}
		else
		{
			System.out.println("The Number is negative" +"\n");
		}
		
		//to check the given string is matches
		System.out.println("*****To check the given string"+Name+"Matches*****");
		if(Name.toString()=="Hem") {
			System.out.println("\n"+"Name Matches");
		}
		else
		{
			System.out.println("Name not matched");
		}

	}

}
