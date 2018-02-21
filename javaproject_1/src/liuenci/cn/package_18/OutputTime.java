package liuenci.cn.package_18;

import java.util.Date;

public class OutputTime implements Runnable{

	@Override
	public void run() {
		Date date = new Date();
		for(int i=0;i<100;i++){
			System.out.println("µÚ"+i+"´Î:"+date.toLocaleString());
		}
	}

}
