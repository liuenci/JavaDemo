package liuenci.cn.package_10;

public class Animal {

	//定义行走的方式
	public void walk(){
		System.out.println("动物行走的方式!");
	}
}
class Bird extends Animal {
	//鸟行走的方式
	public void walk() {
		System.out.println("鸟行走的方式是飞!");
	}
}
class Snake extends Animal {
	//蛇行走的方式
	public void walk() {
		
		System.out.println("蛇行走的方式是爬!");
	}
}
class Person extends Animal {
	//人行走的方式
	public void walk() {
		System.out.println("人行走的方式开法拉利!");
	}
}
class Dog extends Animal {
	//狗行走的方式
	public void walk() {
		System.out.println("狗行走的方式是跑!");
	}
}