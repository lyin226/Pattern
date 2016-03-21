package test;

public class Adapter1 implements Target{

	private Adaptee adaptee;

	 public Adapter1 (Adaptee adaptee) {  
	        this.adaptee = adaptee;  
	    }  
	public void request() {
		this.adaptee.specificRequest();
		
	}
}
