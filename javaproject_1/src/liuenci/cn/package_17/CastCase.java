package liuenci.cn.package_17;

import java.io.File;
import java.io.FileInputStream;

public class CastCase {

	public static void main(String[] args) {
		String path = "D:/trkj1.txt";
		File file = new File(path);
		try{
			FileInputStream input = new FileInputStream(file);
			int fileContent = input.read();
			byte[] txt = new byte[input.available()];
			txt[0] = (byte)fileContent;
			for(int i=0;i<txt.length;i++){
				fileContent = input.read();
				txt[i]=(byte)fileContent;
			}
			String str = new String(txt);
			System.out.println(str);
			for(int i=0;i<txt.length;i++){
				if(txt[i]>='a'&&txt[i]<='z'){
					System.out.print(String.valueOf((char)txt[i]).toUpperCase().charAt(0));
				}else{
					System.out.print(String.valueOf((char)txt[i]).toLowerCase().charAt(0));
				}
			}
			input.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
