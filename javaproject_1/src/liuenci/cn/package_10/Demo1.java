package liuenci.cn.package_10;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建父类对象
		Animal a0 = new Animal();
		a0.walk();
		System.out.println("=========");
		//创建子类对象
		Bird a1 = new Bird();
		a1.walk();
		Snake a2 = new Snake();
		a2.walk();
		Person a3 = new Person();
		a3.walk();
		Dog a4 = new Dog();
		a4.walk();
	}

}
