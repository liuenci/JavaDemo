package liuenci.cn.package_11;

public abstract class Demo11 {
	private String name;
	
	//�вι��췽��
	public Demo11(String name) {
		this.name = name;
	}
	
	//��ͨ��Ա�������޲��޷��أ�
	public void showName() {
		System.out.println("name:"+name);
	}
	
	/**
	 * ���󷽷�û�з�����
	 */
	public abstract void print();
	
	/*�����˳�����֮���ܳ�����ͨ��ͬ����
	public void print(){
		
	}
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * �����಻�ܱ�ʵ����
		 */
		
		//Demo11 demo11 = new Demo11("����");
	}
	
}
