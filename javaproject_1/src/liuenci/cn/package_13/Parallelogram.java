package liuenci.cn.package_13;

public class Parallelogram extends Quadrangle{

	public static void main(String[] args) {
		//ʵ�����������
		Quadrangle quadrangle = new Quadrangle();
		//�жϸ�������Ƿ��������һ��ʵ��
		System.out.println("------");
		if(quadrangle instanceof Parallelogram){
			Parallelogram parallelogram = (Parallelogram)quadrangle;
			System.out.println("_"+parallelogram);
		}
		//�жϸ�������Ƿ�ΪSquare
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