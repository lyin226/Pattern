package test;


public class Test {
	public static void main(String[] args) {
		System.out.println("��һ�����Ӳ���");
		System.out.println("������������-----");
		Target adapter = new Adapter();
		adapter.request();
		System.out.println("��������������------");
		Target adapter1 = new Adapter1(new Adaptee());
		adapter1.request();
		System.out.println("�ڶ������Ӳ���");
		Target1 adapter2 = new Adapter2();
		System.out.println("������������-----");
		adapter2.add();
		System.out.println("��������������------");
		Target1 adapter3 = new Adapter3(new Adaptee1());
		adapter3.add();
	}
}
