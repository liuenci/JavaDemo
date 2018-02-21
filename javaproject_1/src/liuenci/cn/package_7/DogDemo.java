package liuenci.cn.package_7;

public class DogDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//使用狗类
//		Dog dog = new Dog("金毛","公",5);
//		Dog dog ;
		//声明对象，并实例化
		Dog dog = new Dog();
		//给属性赋值
		dog.pingzhong = "金毛";
		dog.age = 3;
		dog.sex = '公';
		
		dog.print("金毛",3,'公');
	}

}
