package liuenci.cn.package_10;

public class Animal {

	//�������ߵķ�ʽ
	public void walk(){
		System.out.println("�������ߵķ�ʽ!");
	}
}
class Bird extends Animal {
	//�����ߵķ�ʽ
	public void walk() {
		System.out.println("�����ߵķ�ʽ�Ƿ�!");
	}
}
class Snake extends Animal {
	//�����ߵķ�ʽ
	public void walk() {
		
		System.out.println("�����ߵķ�ʽ����!");
	}
}
class Person extends Animal {
	//�����ߵķ�ʽ
	public void walk() {
		System.out.println("�����ߵķ�ʽ��������!");
	}
}
class Dog extends Animal {
	//�����ߵķ�ʽ
	public void walk() {
		System.out.println("�����ߵķ�ʽ����!");
	}
}