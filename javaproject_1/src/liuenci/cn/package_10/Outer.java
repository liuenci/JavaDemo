package liuenci.cn.package_10;

public class Outer {
	public class Inter{
		public void print(){
			System.out.println("�ڲ���");
		}
		
	}
	
	public void s(){
		Inter inner = new Inter();
		inner.print();
	}
}
