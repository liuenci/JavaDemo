package liuenci.cn.package_14;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//��������
		System.out.print("���������������");
		String name = input.next();
		//��������
		System.out.print("���������룺");
		String password = input.next();
		if(password.length()<6){
			System.out.println("�û��������");
		}
		//��������
		System.out.print("��������ĳ������ڣ�");
		String data = input.next();
		boolean dataformat = data.charAt(4)=='-'&&data.charAt(7)=='-';
	    //DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd"); 
		//��������
		System.out.print("������������䣺");
		String emile = input.next();
		String regex = "[a-zA-Z0-9_]{6,12}+@[a-zA-Z]+(\\.[a-zA-Z]+){1,3}";
		if(emile.matches(regex)){
			System.out.println("������ȷ");
		}else{
			System.out.println("�������");
		}
		//�����ֻ���
		System.out.print("����������ֻ��ţ�");
		String phone = input.next();
		if(phone.length()!=11){
	    	   System.out.println("�绰�����д�");
	    }

	}

}
