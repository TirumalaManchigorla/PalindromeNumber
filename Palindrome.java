// What is Palindrome Number?

//  A Number is a Palindrome if its original number and reverse number is same.

import java.util.Scanner;
class Palindrome 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any Number");
		int n = sc.nextInt();
		int lastnumber =0;
		int temp = n;
		int reverse =0;
		while (n!=0)
		{
			lastnumber = n%10;
			reverse = reverse*10+lastnumber;
			n=n/10;
		}
		if (reverse == temp)
		{
			System.out.println("It is a Palindrome");
		}
		else
		{
			System.out.println("It is Not a Palindrome");
		}
	}
}
