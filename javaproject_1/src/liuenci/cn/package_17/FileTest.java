package liuenci.cn.package_17;

import java.io.File;
import java.io.FileReader;

public class FileTest {

	public static void main(String[] args) {
		/*String path = "D:/yf/yf/yf/yf.txt";
		File file = new File(path);
		try{
			if(!file.getParentFile().exists()){
				file.getParentFile().mkdirs();
			}
			
			boolean b = file.createNewFile();
			
			if(b){
				System.out.println("创建成功!");
			}else{
				System.out.println("创建失败!");
			}
			if(file.getParentFile().exists()){
				file.getParentFile().delete();
			}
		}catch(Exception e){
			
		}*/
		String path = "D:/yf1234.txt";
		File file = new File(path);
		try{
//			boolean b = file.createNewFile();
			FileReader fileReader = new FileReader(file);
			int r = fileReader.read();
			while(r!=-1){
				//r本身声明的是整形，如果不转成char类型就会显示的数字。
				System.out.print((char)r);
				r = fileReader.read();
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
