package test;

public class Adapter extends Adaptee implements Target{
	public void request() {
		super.specificRequest();
	}
}
