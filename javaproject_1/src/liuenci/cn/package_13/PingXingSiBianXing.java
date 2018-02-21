package liuenci.cn.package_13;

public class PingXingSiBianXing extends SiBianXing{

	public static void main(String[] args) {
		//将平行四边形类对象看作是四边形对象，称为向上转型
		draw(new PingXingSiBianXing());
		SiBianXing siBianXing = new SiBianXing();
		//将父类对象赋予子类对象，并强制转换为子类型。
		PingXingSiBianXing pingXingSiBianXing = (PingXingSiBianXing) siBianXing;
		
	}

}
