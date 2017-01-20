package tw.billliou.myproject.flowcontrol;

public class TestElseEx1 {

	public static void main(String[] args) {
		int degree = 18;
		degree = 25;
		if (degree <= 20) {
			System.out.println("It's cold.");
		} 
		else {
			System.out.println("It's not cold.");
		}
		System.out.println("keep Coding!");
	}

}
