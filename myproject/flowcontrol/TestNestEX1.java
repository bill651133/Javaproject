package tw.billliou.myproject.flowcontrol;

public class TestNestEX1 {

	public static void main(String[] args) {
		int level=15;
		if (level>=5){
			System.out.println("spoon.");
			if(level>=15){
				System.out.println("fork.");
				if(level>=25){
					System.out.println("chopsticks");
				}
			}
			
			
		}
System.out.println("Play game.");
	}

}
