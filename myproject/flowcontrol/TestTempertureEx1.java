package tw.billliou.myproject.flowcontrol;

public class TestTempertureEx1 {

	public static void main(String[] args) {
	double CelToFehren=0;
	if(CelToFehren>=-274){
		System.out.println("Fehrenheit="+(CelToFehren*9/5+32));
	}
	else{
		System.out.println("temperture blow absolute zero.");
	}
    double FehrenToCel=0;
    if(FehrenToCel>=-460){
    	System.out.println("celsious="+((FehrenToCel-32)*5/9));
    }
    else{
    	System.out.println("temperture blow absolute zero.");
    }
    //why didn't I use Switch?
	}

}
