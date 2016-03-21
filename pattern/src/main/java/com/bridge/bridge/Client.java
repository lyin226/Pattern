package test.bridge;


//桥接模式   最重要的也是醉关键是对象之间的组合，灵活运行对象组合，模式中要多用对象组合少用继承
public class Client {
	public static void main(String args[]){
        abstractCar car = new Car();//定义小汽车对象
        car.road=new speedRoad();//定义公路类型
		people ppl = new Man();//定义男人
	    ppl.car=car;//把小汽车实例赋值给男人
		ppl.Run();//具体实现方法
	}
}
