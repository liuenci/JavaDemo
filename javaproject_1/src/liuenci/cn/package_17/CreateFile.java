package liuenci.cn.package_17;

import java.io.File;
import java.io.IOException;
import java.sql.Date;

public class CreateFile {

	public static void main(String[] args){
		//�����ļ�·��
		String path  = "D:/yf1701.txt";
		//�����ļ�����
		File file = new File(path);
		//����createNewFile()����
		try{
			if(file.createNewFile()){
				System.out.println("�����ɹ�");
			}else{
				System.out.println("����ʧ��");
			}
		}catch(Exception e){
			System.out.println("�ļ�·�������ڡ�");
		}
		//�鿴�ļ���
		System.out.println("�ļ���:"+file.getName());
		//�鿴�ļ�·��
		System.out.println("�ļ�·��:"+file.getPath());
		//�鿴�ļ���С
		System.out.println("�ļ���С:"+file.length());
		//�鿴�ļ�����޸�ʱ��
		System.out.println("�޸�ʱ��:"+file.lastModified());
		if(file.exists()){
			//file.delete();
			System.out.println("ɾ���ļ��ɹ���");
		}else{
			System.out.println("ɾ���ļ�ʧ�ܡ�");
		}
//		//�����ļ�·��
//		String path = "D://yf12";
//		//�����ļ�����
//		File  file = new File(path);
//		if(file.getParentFile().exists()){
//			System.out.println("���ļ��д��ڡ�");
//		}else{
//			System.out.println("���ļ��в����ڣ������ļ���");
//			file.getParentFile().mkdirs();
//		}
//		//����CreateNewFlie()�����ļ�
//		if(file.mkdirs()){
//			System.out.println("�����ɹ�");
//		}else{
//			System.out.println("����ʧ��");
//		}
//		//��ȡ�ļ������ļ�������չ����
//		System.out.println(file.getName());
//		//��ȡ�ļ�·�����̷�:/�ļ���/�ļ���.��չ����
//		System.out.println(file.getPath());
//		System.out.println(file.lastModified());
//		Date date = new Date(file.lastModified());
//		System.out.println(date);
		
	}

}
