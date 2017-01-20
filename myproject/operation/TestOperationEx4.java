package tw.billliou.myproject.operation;

public class TestOperationEx4 {

	public static void main(String[] args) {
		int number1 = 1234;
		int number2 = -1234;
		// >> and the number shrink
		// << and number grow
		// >>>positive number shrink while negative number grow
		System.out.println(number1 + ">>2=" + (number1 >> 2));
		System.out.println(number2 + ">>2=" + (number2 >> 2));

		System.out.println(number1 + ">>>2=" + (number1 >>> 2));
		System.out.println(number2 + ">>>2=" + (number2 >>> 2));

		System.out.println(number1 + "<<2=" + (number1 << 2));
		System.out.println(number2 + "<<2=" + (number2 << 2));
		// Java only calculate those written in (),when "" has been added.
	}
}
