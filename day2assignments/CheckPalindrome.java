package day2assignments;

import java.util.Iterator;
import java.util.Scanner;

public class CheckPalindrome {

	public static void main(String[] args) {
		int input, t, s, rem;
		input = 955;
		t = input;
		for (s = 0; input > 0; input /= 10) {
			rem = input % 10;
			s = (s * 10) + rem;
		}
		if (s == t)
			System.out.println(t + " : palindrome number ");
		else
			System.out.println(t + " : non palindrome number ");

	}

}
