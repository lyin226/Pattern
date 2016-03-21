package test.tradition;

public class Client {
	
	//传统多维度变化的实现方式
	public static void main(String args[]){
		//小汽车在高速公路行驶
		carOnSpeedRoad car = new carOnSpeedRoad();
		car.Run();
		
		//公共汽车在市区街道行驶
		busOnStreetRoad bus = new busOnStreetRoad();
		bus.Run();
	}

}
