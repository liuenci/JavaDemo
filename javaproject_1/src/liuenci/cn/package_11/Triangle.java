package liuenci.cn.package_11;

public class Triangle extends Figure{
	
	public void showArea() {
		System.out.println("�����ε�����ǵ׳˸߳���0.5");
	}
	
	public void showLength() {
		System.out.println("�����ε��ܳ�������֮�͡�");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle triangle = new Triangle();
		triangle.showArea();
		triangle.showLength();
	}

}
