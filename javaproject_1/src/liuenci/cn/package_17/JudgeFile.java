package liuenci.cn.package_17;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class JudgeFile {

	public static void main(String[] args) {
		String path = "D:/trkj.txt";
		File file = new File(path);
		if(file.isFile()){
			System.out.println("文件名:"+file.getName());
			System.out.println("文件路径:"+file.getPath());
			System.out.println("文件最后修改时间:"+file.lastModified());
			System.out.println("文件大小:"+file.length());
			System.out.print("文件内容:");
			try{
				FileInputStream input = new FileInputStream(file);
				int fileContent = input.read();
				byte[] txt = new byte[input.available()];
				while(fileContent!=-1){
					//输出
					System.out.print((char)fileContent+" ");
					fileContent = input.read();
				}
				input.close();
			}catch(Exception e){
				e.printStackTrace();
			}
			
		}else{
			try{
				boolean b = file.createNewFile();
				System.out.print("请输入内容:");
				Scanner scanner = new Scanner(System.in);
				FileOutputStream fileOutputStream = new FileOutputStream(file);
				String content = scanner.next();
				byte[] newFileContent = content.getBytes();
				fileOutputStream.write(newFileContent);
				char[] c = content.toCharArray();
				for(int i=0;i<c.length;i++){
					System.out.print(c[i]+" ");
				}
			}catch(Exception e){
				e.printStackTrace();
			}
			
		}
		
	}

}
