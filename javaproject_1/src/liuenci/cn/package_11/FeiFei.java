package liuenci.cn.package_11;

public class FeiFei extends Animal{
	private String name;
	
	//���幹�췽��
	public FeiFei(String name){
		setName(name);
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void exercise(){
		System.out.println(getName()+"ѵ����Ŀ�������Ϸɣ�");
	}
	
	public void show(){
		System.out.println(getName()+"������Ŀ����շ�ת���裻 ");
	}
}
