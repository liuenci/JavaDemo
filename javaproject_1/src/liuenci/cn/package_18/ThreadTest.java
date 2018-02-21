package liuenci.cn.package_18;

public class ThreadTest{

	public static void main(String[] args) throws InterruptedException {
		MyThread myThread = new MyThread("ÄÏÄÏ¸ç");
		MyThread myThread2 = new MyThread("ËÉ´óË§");
		Thread thread = new Thread(new MyThread("ËÉË§"));
		myThread.start();
		myThread2.start();
		thread.start();
		RunableTest runableTest = new RunableTest();
		runableTest.run();
	}

}
