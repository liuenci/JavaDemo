package liuenci.cn.package_18;

public class ThreadTest{

	public static void main(String[] args) throws InterruptedException {
		MyThread myThread = new MyThread("���ϸ�");
		MyThread myThread2 = new MyThread("�ɴ�˧");
		Thread thread = new Thread(new MyThread("��˧"));
		myThread.start();
		myThread2.start();
		thread.start();
		RunableTest runableTest = new RunableTest();
		runableTest.run();
	}

}
