package day2assignments;

import java.util.Arrays;

public class FindMissingElement {
	public void MissingElement(int MissedVal[]) {
		Arrays.sort(MissedVal);
		for(int i=0;i<MissedVal.length;i++)
		{
			int inc=i+1;
			if(MissedVal[i]!=inc) {
				System.out.println("Missed Number from the given array is : " +inc);
				break;
			}
		}
		
	}

	public static void main(String[] args) {
		int[] MissedVal={1,4,3,5,8,6,7,10};
		FindMissingElement FME=new FindMissingElement();
		FME.MissingElement(MissedVal);

	}

}
