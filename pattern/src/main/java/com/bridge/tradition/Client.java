package test.tradition;

public class Client {
	
	//��ͳ��ά�ȱ仯��ʵ�ַ�ʽ
	public static void main(String args[]){
		//С�����ڸ��ٹ�·��ʻ
		carOnSpeedRoad car = new carOnSpeedRoad();
		car.Run();
		
		//���������������ֵ���ʻ
		busOnStreetRoad bus = new busOnStreetRoad();
		bus.Run();
	}

}
