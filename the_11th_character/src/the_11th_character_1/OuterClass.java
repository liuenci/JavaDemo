package the_11th_character_1;

public class OuterClass {
	//���ⲿ��ʵ�����ڲ����������
	innerClass in = new innerClass();
	public void ouf(){
		in.inf();
	}
	class innerClass{
		//�ڲ��๹�췽��
		innerClass(){
		}
		//�ڲ����Ա����
		public void inf(){
		}
		//�����ڲ����Ա����
		int y = 0;
	}
	//�ⲿ�෽��������ֵΪ�ڲ�������
	public innerClass doit(){
		//y=4;
		in.y = 4;
		//�����ڲ�������
		return new innerClass();
	}
	public static void main(String[] args) {
		OuterClass out = new OuterClass();
		//�ڲ���Ķ���ʵ���������������ⲿ����ⲿ��ķǾ�̬������ʵ��
		OuterClass.innerClass in = out.doit();
		OuterClass.innerClass in2 = out.new innerClass();
	}

}
