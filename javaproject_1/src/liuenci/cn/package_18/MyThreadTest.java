package liuenci.cn.package_18;

public class MyThreadTest implements Runnable{
	String name;
	Object o;
	public MyThreadTest(String name,Object o) {
		this.name = name;
		this.o = o;
	}


	@Override
	public  void run() {
		synchronized(this.o){
			for(int i=0;i<10;i++){
//				o.notify();
				System.out.println(this.name+":"+(i+1));
//				try {
//					o.wait();
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
			}
		}
		
	}
	
}
