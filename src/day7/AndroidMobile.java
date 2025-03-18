package day7;

public class AndroidMobile implements Mobile
{

	@Override
	public void call() {
		System.out.println("Calling using Android Technology");	
	}

	@Override
	public void message() {
		System.out.println("Messaging using Android Technology");	
	}

	@Override
	public void apps() {
		System.out.println("Install Apps from PlayStore");	
		}

	@Override
	public void multimedia() {
		System.out.println("Multimedia using Android Technology");	
	}

}
