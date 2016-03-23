package test;

public class Adapter3 implements Target1{
    private Adaptee1 adaptee1;
	public Adapter3(Adaptee1 adaptee1){
		this.adaptee1=adaptee1;
	}
	public void add() {
		this.adaptee1.Existingadd();
		
	}
}
