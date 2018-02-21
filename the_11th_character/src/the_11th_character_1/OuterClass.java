package the_11th_character_1;

public class OuterClass {
	//在外部内实例化内部类对象引用
	innerClass in = new innerClass();
	public void ouf(){
		in.inf();
	}
	class innerClass{
		//内部类构造方法
		innerClass(){
		}
		//内部类成员方法
		public void inf(){
		}
		//定义内部类成员变量
		int y = 0;
	}
	//外部类方法，返回值为内部类引用
	public innerClass doit(){
		//y=4;
		in.y = 4;
		//返回内部类引用
		return new innerClass();
	}
	public static void main(String[] args) {
		OuterClass out = new OuterClass();
		//内部类的对象实例化操作必须在外部类或外部类的非静态方法中实现
		OuterClass.innerClass in = out.doit();
		OuterClass.innerClass in2 = out.new innerClass();
	}

}
