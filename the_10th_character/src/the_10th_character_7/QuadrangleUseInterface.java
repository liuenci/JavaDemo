package the_10th_character_7;
//����ӿ�
interface drawTest{
	//���巽��
	public void draw();
}
//����ƽ���ı����࣬����̳����ı�����
//��ʵ����drawTest�ӿ�
class ParallelogramgleUseInterface extends QuadrangleUseInterface implements drawTest{

	@Override
	//��Ϊ����ʵ���˽ӿڣ�������Ҫ����draw()����
	public void draw() {
		System.out.println("ƽ���ı���.draw()");
	}
	//���Ǹ��෽��
	void doAnything(){
		System.out.println("���Ǹ��෽��");
	}
}
//�����������࣬����̳����ı�����
//��ʵ����drawTest�ӿ�
class SquareUseInterface extends QuadrangleUseInterface implements drawTest{

	@Override
	public void draw() {
		System.out.println("������.draw()");
	}
	//���Ǹ��෽��
	public void doAnyThing(){
		System.out.println("���Ǹ��෽��");
	}
}
public class QuadrangleUseInterface {
	public void doAnyThing(){
		
	}
	public static void main(String[] args) {
		//�ӿ�Ҳ���Խ�������ת�Ͳ���
		drawTest[] d = {
				new SquareUseInterface(),new ParallelogramgleUseInterface()
		};
		for(int i = 0;i<d.length;i++){
			d[i].draw();
		}
	}
}
