package liuenci.cn.package_8;

public class Dog {

	/**
	 * @param args
	 */
	
	String name;
	String sex;
	//����
	public void  show(){
		System.out.println(name);
		System.out.println(sex);
	}
	//���췽��
	public Dog(String name,String sex){
		//ǰһ��name�Ƕ���ĳ�Ա���ԣ���һ��name���βΣ�������ʵ��
		this.name = name;
		this.sex = sex;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog("�骸�","��");
		dog.show();
		
	}

}
