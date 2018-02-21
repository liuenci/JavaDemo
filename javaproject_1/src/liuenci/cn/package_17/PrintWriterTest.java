package liuenci.cn.package_17;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class PrintWriterTest {

	public static void main(String[] args) throws Exception {
		//创建路径
		String path = "D:/yf1234.txt";
		//创建文件对象
		File file = new File(path);
		//创建字符输入流
		FileWriter fileWriter = new FileWriter(file,true);
		//创建字符输入缓冲流
		PrintWriter printWriter = new PrintWriter(fileWriter);
		
		System.out.print("请输入内容：");
		Scanner input = new Scanner(System.in);
		String str = input.next();
		printWriter.write(str+"\b");
		//关闭字符数输入流
		fileWriter.close();
		
	}

}
