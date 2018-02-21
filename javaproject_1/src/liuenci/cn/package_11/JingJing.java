package liuenci.cn.package_11;

public class JingJing extends Animal{
	private String name;
	
	//定义构造方法
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
		System.out.println(getName()+"训练项目：在水里游；");
	}
	
	public void show(){
		System.out.println(getName()+"表演项目：水里跳跃；  ");
	}
}
