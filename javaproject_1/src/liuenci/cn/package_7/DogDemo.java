package liuenci.cn.package_7;

public class DogDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//ʹ�ù���
//		Dog dog = new Dog("��ë","��",5);
//		Dog dog ;
		//�������󣬲�ʵ����
		Dog dog = new Dog();
		//�����Ը�ֵ
		dog.pingzhong = "��ë";
		dog.age = 3;
		dog.sex = '��';
		
		dog.print("��ë",3,'��');
	}

}
