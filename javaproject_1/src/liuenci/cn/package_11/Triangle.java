package liuenci.cn.package_11;

public class Triangle extends Figure{
	
	public void showArea() {
		System.out.println("三角形的面积是底乘高乘以0.5");
	}
	
	public void showLength() {
		System.out.println("三角形的周长是三边之和。");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle triangle = new Triangle();
		triangle.showArea();
		triangle.showLength();
	}

}
