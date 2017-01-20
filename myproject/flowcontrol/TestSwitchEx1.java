package tw.billliou.myproject.flowcontrol;

public class TestSwitchEx1 {

	public static void main(String[] args) {
int favoritefoods=500;
		switch(favoritefoods){
		case 1:
			System.out.println("fried chicken");
		    break;
		case 2:
			System.out.println("pasta");
		    break;
		case 3:
			System.out.println("steak");
		    break;
		default:
		    System.out.println("rice");
		    break;
		}
	System.out.println("great meal.");
	}

}
