package liuenci.cn.package_18;

public class MyThreadDemo {

	public static void main(String[] args) {
		Object o = new Object();
		Thread thread = new Thread(new MyThreadTest("�߳�һ",o));
		Thread thread1 = new Thread(new MyThreadTest("�̶߳�",o));
		thread.start();
		thread1.start();
	}

}
