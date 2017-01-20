package tw.billliou.myproject.flowcontrol;

public class LabTestEx1 {

	public static void main(String[] args) {
		int a;
		//could not test "a" without valuing it.
		//a=-3;
		//a=-2;
		//a=0;
		a=3;
		if(a>=0){
			System.out.println("+");
			if(a%2==0){
				//"="means value(取值) while "==" as equal value(等於)
				System.out.println("even number");
			}
			else{
				System.out.println("odd number");
			}
		}
		else{
			System.out.println("-");
			if(a%2==0){
				System.out.println("even number");
			}
			else{
				System.out.println("odd number");
			}
		}
	}

}
