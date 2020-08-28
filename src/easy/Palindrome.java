package easy;

/*
 * A palindrome number is a number that is same after reverse. 
 * For example 545, 151, 34543, 343, 171, 48984 are the palindrome numbers. It can also be a string like LOL, MADAM etc
 */
public class Palindrome {
	public static boolean isPalindrome(int x) {
//		int reversedInteger = 0, remainder;
//		int originalInteger = x;
//		if (x < 0 || (x % 10 == 0 && x != 0)) {
//			System.out.println("Number is not Plaindrone");
//			return false;
//		}
//		for (; x != 0; x /= 10) {
//			remainder = x % 10;
//			reversedInteger = reversedInteger * 10 + remainder;
//		}
//
//		if (originalInteger == reversedInteger) {
//			System.out.println("Number is Palindrome");
//			return true;
//		} else {
//			System.out.println("Number is not Plaindrone");
//		}
//		return false;
//------------------------------------------------------------------------------
		// Special cases:
		// As discussed above, when x < 0, x is not a palindrome.
		// Also if the last digit of the number is 0, in order to be a palindrome,
		// the first digit of the number also needs to be 0.
		// Only 0 satisfy this property.
		if (x < 0 || (x % 10 == 0 && x != 0)) {
			return false;
		}

		int revertedNumber = 0;
		while (x > revertedNumber) {
			revertedNumber = revertedNumber * 10 + x % 10;
			x /= 10;
		}

		// When the length is an odd number, we can get rid of the middle digit by
		// revertedNumber/10
		// For example when the input is 12321, at the end of the while loop we get x =
		// 12, revertedNumber = 123,
		// since the middle digit doesn't matter in palidrome(it will always equal to
		// itself), we can simply get rid of it.
		return x == revertedNumber || x == revertedNumber / 10;

	}

	public static void main(String[] args) {

		// boolean flag = isPalindrome(151);
		System.out.println(isPalindrome(151));
	}
}

/*
 * Time complexity : O(log 10(n)) We divided the input by 10 for every
 * iteration, so the time complexity is O(log 10(n)) Space complexity :
 * O(1)O(1).
 *
 * STRING SOLUTION
 *
 * public boolean isPalindrome(int x) { String str = String.valueOf(x); int
 * start = 0; int end = str.length() - 1; while(start < end){
 * if(str.charAt(start++) != str.charAt(end--)) return false; } return true; }
 * 
 * INTEGER SOLUTION RUN: x= 151 now we will check condition x<0 = false 151%10
 * == 0
 */
