package liuenci.cn.package_13;

public class Cast {
	int cast1;
	static String cast2 = "liuenci";
	static String cast3 = "123";
	public void castWay1(String cast){
		try{
//			castName = Integer.parseInt(name);
			cast1 = Integer.valueOf(cast);
			System.out.println(cast1);
			
		}catch(Exception e){
			System.out.println("���쳣");
		}
	}
	public void castWay2(String cast){
		try{
			cast1 = Integer.valueOf(cast);
			System.out.println(cast1);
		}catch(Exception e){
			System.out.println("���쳣!");
		}
	}
	public static void main(String[] args) {
		Cast cast = new Cast();
		cast.castWay1(cast2);
		cast.castWay2(cast3);
	}
}
