package easy;
/*
 * 
 */

public class ReverseInteger {
	public static int reverse(int x) {

		long result = 0;
		if (x == 0) {
			return x;
		}

		while (x != 0) {
			result = result * 10 + x % 10;
			x = x / 10;
		}
		if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
			return 0;
		} else
			return (int) result;
	}

	public static void main(String[] args) {
		System.out.println("Reverse Integer = " + reverse(-123));

	}

}
