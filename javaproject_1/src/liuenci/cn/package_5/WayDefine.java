package liuenci.cn.package_5;

public class WayDefine {

	/**
	 * @方法定义
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WayDefine input = new WayDefine();
		input.fangFa1();
		System.out.println("=================================");
		System.out.println(input.jianFa(4, 454));
		System.out.println("=================================");
		input.fangFa(5);
		System.out.println("=================================");
		System.out.println(input.fangFa3());
	}
	
	public void fangFa1(){
		for(int i=0;i<=9;i++){
			System.out.println("Hello World");
		}
		for(int i=1;i<=9;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j+"*"+i+"="+(i*j)+" ");
			}
			System.out.println();
		}
	}
	public int jianFa(int num1,int num2){
		return num1-num2;
	}
	public void fangFa(int num){
		for(int i=1;i<num;i++){
			System.out.println("hello world");
		}
	}
	public double fangFa3(){
		double pi=3.14;
		return pi;
	}
}
