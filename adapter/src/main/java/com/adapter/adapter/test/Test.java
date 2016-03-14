package test;


public class Test {
	public static void main(String[] args) {
		System.out.println("µÚÒ»¸öÀı×Ó²âÊÔ");
		System.out.println("ÀàÊÊÅäÆ÷²âÊÔ-----");
		Target adapter = new Adapter();
		adapter.request();
		System.out.println("¶ÔÏóÊÊÅäÆ÷²âÊÔ------");
		Target adapter1 = new Adapter1(new Adaptee());
		adapter1.request();
		System.out.println("µÚ¶ş¸öÀı×Ó²âÊÔ");
		Target1 adapter2 = new Adapter2();
		System.out.println("ÀàÊÊÅäÆ÷²âÊÔ-----");
		adapter2.add();
		System.out.println("¶ÔÏóÊÊÅäÆ÷²âÊÔ------");
		Target1 adapter3 = new Adapter3(new Adaptee1());
		adapter3.add();
	}
}
