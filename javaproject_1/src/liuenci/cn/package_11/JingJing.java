package liuenci.cn.package_11;

public class JingJing extends Animal{
	private String name;
	
	//���幹�췽��
	public JingJing (String name) {
		setName(name);
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void exercise(){
		System.out.println(getName()+"ѵ����Ŀ����ˮ���Σ�");
	}
	
	public void show(){
		System.out.println(getName()+"������Ŀ��ˮ����Ծ��  ");
	}
}
