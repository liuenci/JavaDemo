package liuenci.cn.package_17;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileStreamTest {

	public static void main(String[] args) throws IOException {
		//��ȡ����
		String path = "D:\\yf1701.txt";
		//�����ļ�����
		File file = new File(path);
		//�����ֽ���
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
			System.out.println("�ļ��Ҳ�����");
			e.printStackTrace();
		}
		/**
		 * �ֽ������
		 */
		//�������������
		FileOutputStream output = new FileOutputStream(file);
		//����һ��ɨ���Ƕ���
		Scanner sc = new Scanner(System.in);
		System.out.print("��������Ҫ���������:");
		String str = sc.next();
		byte[] b = str.getBytes();
		output.write(b);
	}

}
