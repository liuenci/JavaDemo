package liuenci.cn.package_14;

import java.util.Scanner;

public class InputInformation {

	public static void main(String[] args) {
		System.out.println("请输入您的注册信息:");
		Scanner input = new Scanner(System.in);
		System.out.print("请输入您的姓名:");
		String name = input.next();
		System.out.print("请输入您的密码:");
		String password = input.next();
		System.out.print("请输入您的出生日期:");
		String data = input.next();
		System.out.print("请输入您的邮箱号:");
		String email = input.next();
		System.out.print("请输入您的手机号:");
		String phone = input.next();
		int passwordLength = password.length();
		boolean dataformat = data.charAt(4)=='-'&&data.charAt(7)=='-';
		int phoneLength = phone.length();
		String regex = "[a-zA-Z0-9_]{6,12}+@[a-zA-Z]+(\\.[a-zA-Z]+){1,3}";
		if(passwordLength>=6&&dataformat&&phoneLength==11&&email.matches(regex)){
			System.out.println("注册成功!");
		}else{
			System.out.println("输入错误!");
		}
	}

}
