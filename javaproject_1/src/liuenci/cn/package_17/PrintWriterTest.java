package liuenci.cn.package_17;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class PrintWriterTest {

	public static void main(String[] args) throws Exception {
		//����·��
		String path = "D:/yf1234.txt";
		//�����ļ�����
		File file = new File(path);
		//�����ַ�������
		FileWriter fileWriter = new FileWriter(file,true);
		//�����ַ����뻺����
		PrintWriter printWriter = new PrintWriter(fileWriter);
		
		System.out.print("���������ݣ�");
		Scanner input = new Scanner(System.in);
		String str = input.next();
		printWriter.write(str+"\b");
		//�ر��ַ���������
		fileWriter.close();
		
	}

}
