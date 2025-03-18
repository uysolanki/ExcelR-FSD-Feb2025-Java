package day7;

public class IphoneMobile implements Mobile
{

	@Override
	public void call() {
		System.out.println("Calling using Apple technology");
		
	}

	@Override
	public void message() {
		System.out.println("Messaging using Apple technology");
		
	}

	@Override
	public void apps() {
		System.out.println("Install Appp from App-Store");
		
	}

	@Override
	public void multimedia() {
		System.out.println("Multimedia using Apple technology");
		
	}
}
