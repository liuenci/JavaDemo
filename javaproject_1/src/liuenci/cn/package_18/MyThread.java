package liuenci.cn.package_18;

public class MyThread extends Thread{
	String name;

	public MyThread() {
	}
	
	public MyThread(String name) {
		this.name = name;
	}

	/**
	 * 重写run方法
	 */

	@Override
	public void run() {
		for(int i=0;i<10;i++){
			System.out.println(this.name+":线程"+i);
		}
	}
	
	
	
}
