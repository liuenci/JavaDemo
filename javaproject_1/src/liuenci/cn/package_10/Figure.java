package liuenci.cn.package_10;

public class Figure {
	//��������������
	public void area() {
		
	}
	//��������ܳ�����
	public void length() {
		
	}
}

//���������
class Rectangle extends Figure {

	@Override
	public void area() {
		// TODO Auto-generated method stub
		System.out.println("���ε�������ڳ����Կ�");
	}

	@Override
	public void length() {
		// TODO Auto-generated method stub
		System.out.println("���ε��ܳ�����((��+��)*2)");
	}
	
}

//����Բ����
class Circle extends Figure {

	@Override
	public void area() {
		// TODO Auto-generated method stub
		System.out.println("Բ�ε��������(Բ���ʳ��԰뾶��ƽ��)");
	}

	@Override
	public void length() {
		// TODO Auto-generated method stub
		System.out.println("Բ�ε��ܳ�����(Բ���ʳ���ֱ��)");
	}
	
}
//������������
class Triangle extends Figure {

	@Override
	public void area() {
		// TODO Auto-generated method stub
		System.out.println("�����ε��������(1/2*�ױ�*��)");
	}

	@Override
	public void length() {
		// TODO Auto-generated method stub
		System.out.println("�����ε��ܳ���������֮��");
	}
	
}