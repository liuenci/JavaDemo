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
		 * �ֽ������ַ�����ת��
		 */
//		//����·��
//		String path = "D:/yf1234.txt";
//		//�����ļ�����
//		File file = new File(path);
//		//�����ֽ�������
//		FileInputStream fileInputStream = new FileInputStream(file);
//		//�����ַ�������
//		InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
//		//�����ַ�����������
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
//		//�ر������ȹرո߼������ٹرյͼ���
//		bufferedReader.close();
//		inputStreamReader.close();
//		fileInputStream.close();
		
		//�����ļ�·��
		String path = "D:/yf1234.txt";
		//�����ļ�����
		File file = new File(path);
		//�����ֽ������
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		//�����ַ������
		PrintWriter printWriter = new PrintWriter(fileOutputStream);
		//�����ַ�������
		
	}

}
