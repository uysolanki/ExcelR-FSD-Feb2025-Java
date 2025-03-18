package day7;

public class InterfaceDriver {

	public static void main(String[] args) {
		IphoneMobile iphone16=new IphoneMobile();
		iphone16.call();
		iphone16.message();
		iphone16.multimedia();
		iphone16.apps();
		
		AndroidMobile onePlus=new AndroidMobile();
		onePlus.call();
		onePlus.message();
		onePlus.multimedia();
		onePlus.apps();

	}

}
