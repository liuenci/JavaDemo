package liuenci.cn.package_17;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class TransformType {

	public static void main(String[] args) throws Exception {
		/**
		 * 字节流和字符流的转换
		 */
//		//创建路径
//		String path = "D:/yf1234.txt";
//		//创建文件对象
//		File file = new File(path);
//		//创建字节输入流
//		FileInputStream fileInputStream = new FileInputStream(file);
//		//创建字符输入流
//		InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
//		//创建字符缓冲输入流
//		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
//		/*int r = inputStreamReader.read();
//		while(r!=-1){
//			System.out.print((char)r);
//			r = inputStreamReader.read();
//		}*/
//		String str = bufferedReader.readLine();
//		while(str!=null){
//			System.out.println(str);
//			str = bufferedReader.readLine();
//		}
//		//关闭流，先关闭高级流，再关闭低级流
//		bufferedReader.close();
//		inputStreamReader.close();
//		fileInputStream.close();
		
		//创建文件路径
		String path = "D:/yf1234.txt";
		//创建文件对象
		File file = new File(path);
		//创建字节输出流
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		//创建字符输出流
		PrintWriter printWriter = new PrintWriter(fileOutputStream);
		//创建字符缓冲流
		
	}

}
