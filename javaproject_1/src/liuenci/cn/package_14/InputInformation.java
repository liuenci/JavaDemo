package liuenci.cn.package_14;

import java.util.Scanner;

public class InputInformation {

	public static void main(String[] args) {
		System.out.println("����������ע����Ϣ:");
		Scanner input = new Scanner(System.in);
		System.out.print("��������������:");
		String name = input.next();
		System.out.print("��������������:");
		String password = input.next();
		System.out.print("���������ĳ�������:");
		String data = input.next();
		System.out.print("���������������:");
		String email = input.next();
		System.out.print("�����������ֻ���:");
		String phone = input.next();
		int passwordLength = password.length();
		boolean dataformat = data.charAt(4)=='-'&&data.charAt(7)=='-';
		int phoneLength = phone.length();
		String regex = "[a-zA-Z0-9_]{6,12}+@[a-zA-Z]+(\\.[a-zA-Z]+){1,3}";
		if(passwordLength>=6&&dataformat&&phoneLength==11&&email.matches(regex)){
			System.out.println("ע��ɹ�!");
		}else{
			System.out.println("�������!");
		}
	}

}
