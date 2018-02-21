package the_10th_character_7;

public class Quadrangle {
	//实例化保存四边形对象的数组对象
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
		//实例化两个四边形对象，用于调用draw()方法
		Quadrangle q = new Quadrangle();
		q.draw(new Square());
		q.draw(new Parallelogramgle());
	}

}
class Square extends Quadrangle{
	public Square(){
		System.out.println("正方形！");
	}
}
class Parallelogramgle extends Quadrangle{
	public Parallelogramgle(){
		System.out.println("平行四边形");
	}
}