package liuenci.cn.package_14;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//输入姓名
		System.out.print("请输入你的姓名：");
		String name = input.next();
		//输入密码
		System.out.print("请输入密码：");
		String password = input.next();
		if(password.length()<6){
			System.out.println("用户密码错误");
		}
		//输入日期
		System.out.print("请输入你的出生日期：");
		String data = input.next();
		boolean dataformat = data.charAt(4)=='-'&&data.charAt(7)=='-';
	    //DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd"); 
		//输入邮箱
		System.out.print("请输入你的邮箱：");
		String emile = input.next();
		String regex = "[a-zA-Z0-9_]{6,12}+@[a-zA-Z]+(\\.[a-zA-Z]+){1,3}";
		if(emile.matches(regex)){
			System.out.println("邮箱正确");
		}else{
			System.out.println("邮箱错误");
		}
		//输入手机号
		System.out.print("请输入你的手机号：");
		String phone = input.next();
		if(phone.length()!=11){
	    	   System.out.println("电话号码有错");
	    }

	}

}
