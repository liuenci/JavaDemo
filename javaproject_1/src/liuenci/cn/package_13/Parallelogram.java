package liuenci.cn.package_13;

public class Parallelogram extends Quadrangle{

	public static void main(String[] args) {
		//实例化父类对象
		Quadrangle quadrangle = new Quadrangle();
		//判断父类对象是否是子类的一个实例
		System.out.println("------");
		if(quadrangle instanceof Parallelogram){
			Parallelogram parallelogram = (Parallelogram)quadrangle;
			System.out.println("_"+parallelogram);
		}
		//判断父类对象是否为Square
		if(quadrangle instanceof Square){
			Square square = (Square)quadrangle;
			System.out.println(square);
		}
	}

}
class Quadrangle{
	public static void draw(Quadrangle q){
		
	}
}
class Square extends Quadrangle{
	
}
class Anything{
	
}