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
				System.out.println("�����ɹ�!");
			}else{
				System.out.println("����ʧ��!");
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
				//r���������������Σ������ת��char���;ͻ���ʾ�����֡�
				System.out.print((char)r);
				r = fileReader.read();
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
