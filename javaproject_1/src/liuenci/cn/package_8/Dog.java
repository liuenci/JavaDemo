package liuenci.cn.package_8;

public class Dog {

	/**
	 * @param args
	 */
	
	String name;
	String sex;
	//方法
	public void  show(){
		System.out.println(name);
		System.out.println(sex);
	}
	//构造方法
	public Dog(String name,String sex){
		//前一个name是定义的成员属性，后一个name是形参，或者是实参
		this.name = name;
		this.sex = sex;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog("楠楠哥","雄");
		dog.show();
		
	}

}
