package easy;

public class PalindromePractice {

	public static boolean isPalindrome(int x) {

		if (x < 0 || x % 10 == 0 && x != 0) {
			System.out.println("Number is not Palindrome");
			return false;
		}
		int revertedNumber = 0;
		while (x > revertedNumber) {

			revertedNumber = revertedNumber * 10 + x % 10;
			x /= 10;
		}
		return x == revertedNumber || x == revertedNumber / 10;

	}

	public static void main(String[] args) {
		System.out.println("Check Whether -121 is Palindrome or not");
		System.out.println(isPalindrome(-121));
		System.out.println("Check Whether 151 is Palindrome or not");
		System.out.println(isPalindrome(151));
	}

}

/*
 * What is Palindrome Number : A number which on reverse remains same as input
 * value. means your output generates same as input after reversing the number.
 */