package test.bridge;


//�Ž�ģʽ   ����Ҫ��Ҳ����ؼ��Ƕ���֮�����ϣ�������ж�����ϣ�ģʽ��Ҫ���ö���������ü̳�
public class Client {
	public static void main(String args[]){
        abstractCar car = new Car();//����С��������
        car.road=new speedRoad();//���幫·����
		people ppl = new Man();//��������
	    ppl.car=car;//��С����ʵ����ֵ������
		ppl.Run();//����ʵ�ַ���
	}
}
