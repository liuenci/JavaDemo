package the_10th_character_7;

public class Quadrangle {
	//ʵ���������ı��ζ�����������
	private Quadrangle[] qtest = new Quadrangle[6];
	private int nextIndex  = 0;
	public void draw(Quadrangle q){
		if(nextIndex<qtest.length){
			qtest[nextIndex]=q;
			System.out.println(nextIndex);
			nextIndex++;
		}
	}
	public static void main(String[] args) {
		//ʵ���������ı��ζ������ڵ���draw()����
		Quadrangle q = new Quadrangle();
		q.draw(new Square());
		q.draw(new Parallelogramgle());
	}

}
class Square extends Quadrangle{
	public Square(){
		System.out.println("�����Σ�");
	}
}
class Parallelogramgle extends Quadrangle{
	public Parallelogramgle(){
		System.out.println("ƽ���ı���");
	}
}