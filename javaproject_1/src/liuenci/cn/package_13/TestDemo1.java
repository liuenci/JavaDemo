package liuenci.cn.package_13;

import java.util.Scanner;

public class TestDemo1 {

	public static void main(String[] args)throws Exception {
		String userName="admin";
		String userPassword = "admin";
		try{
			System.out.println("�����������˺�:");
			Scanner input = new Scanner(System.in);
			String inputName = input.next();
			System.out.println("��������������:");
			String inputPassword = input.next();
			if(inputName.equals(userName)&&inputPassword.equals(userPassword)){
				System.out.println("��¼�ɹ�!");
			}else{
				throw new CustomException("�˺Ż��������!");
			}
		}catch(CustomException e){
			e.printStackTrace();
		}
		
	}

}
