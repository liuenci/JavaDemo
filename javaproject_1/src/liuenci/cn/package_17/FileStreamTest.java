package liuenci.cn.package_17;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileStreamTest {

	public static void main(String[] args) throws IOException {
		//读取内容
		String path = "D:\\yf1701.txt";
		//创建文件对象
		File file = new File(path);
		//创建字节流
		FileInputStream input; 
		try{
			input = new FileInputStream(file);
			int r = input.read();
			byte[] byte1 = new byte[input.available()];
			System.out.println(input.available());
			int i = 0;
			while(r!=-1){
				System.out.print((char)r);
				r = input.read();
				byte1[i]=(byte)r;
				i++;
				if(i==10){
					break;
				}
			}
			System.out.println();
			System.out.println("==============================");
			for(int j =0;j<byte1.length;j++){
				System.out.print((char)byte1[j]+" ");
			}
			input.close();
		}catch(FileNotFoundException e){
			System.out.println("文件找不到。");
			e.printStackTrace();
		}
		/**
		 * 字节输出流
		 */
		//创建输出流对象
		FileOutputStream output = new FileOutputStream(file);
		//创建一个扫描仪对象
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入你要输入的内容:");
		String str = sc.next();
		byte[] b = str.getBytes();
		output.write(b);
	}

}
