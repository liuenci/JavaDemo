package liuenci.cn.package_18;

public class DemoTest {

	public static void main(String[] args) {
		OutputNum num = new OutputNum();
		OutputTime outputTime = new OutputTime();
		Thread thread = new Thread(outputTime);
		thread.start();
		num.start();
		
	}

}
