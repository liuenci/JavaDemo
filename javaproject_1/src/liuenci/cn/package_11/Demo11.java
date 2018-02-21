package liuenci.cn.package_11;

public abstract class Demo11 {
	private String name;
	
	//有参构造方法
	public Demo11(String name) {
		this.name = name;
	}
	
	//普通成员方法（无参无返回）
	public void showName() {
		System.out.println("name:"+name);
	}
	
	/**
	 * 抽象方法没有方法体
	 */
	public abstract void print();
	
	/*定义了抽象类之后不能出现普通的同名类
	public void print(){
		
	}
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * 抽象类不能被实例化
		 */
		
		//Demo11 demo11 = new Demo11("张三");
	}
	
}
