package liuenci.cn.package_10;

public class Figure {
	//定义计算面积方法
	public void area() {
		
	}
	//定义计算周长方法
	public void length() {
		
	}
}

//定义矩形类
class Rectangle extends Figure {

	@Override
	public void area() {
		// TODO Auto-generated method stub
		System.out.println("矩形的面积等于长乘以宽");
	}

	@Override
	public void length() {
		// TODO Auto-generated method stub
		System.out.println("矩形的周长等于((长+宽)*2)");
	}
	
}

//定义圆形类
class Circle extends Figure {

	@Override
	public void area() {
		// TODO Auto-generated method stub
		System.out.println("圆形的面积等于(圆周率乘以半径的平方)");
	}

	@Override
	public void length() {
		// TODO Auto-generated method stub
		System.out.println("圆形的周长等于(圆周率乘以直径)");
	}
	
}
//定义三角形类
class Triangle extends Figure {

	@Override
	public void area() {
		// TODO Auto-generated method stub
		System.out.println("三角形的面积等于(1/2*底边*高)");
	}

	@Override
	public void length() {
		// TODO Auto-generated method stub
		System.out.println("三角形的周长等于三边之和");
	}
	
}