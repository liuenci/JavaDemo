package the_10th_character_7;
//定义接口
interface drawTest{
	//定义方法
	public void draw();
}
//定义平行四边形类，该类继承了四边形类
//并实现了drawTest接口
class ParallelogramgleUseInterface extends QuadrangleUseInterface implements drawTest{

	@Override
	//因为该类实现了接口，所以需要覆盖draw()方法
	public void draw() {
		System.out.println("平行四边形.draw()");
	}
	//覆盖父类方法
	void doAnything(){
		System.out.println("覆盖父类方法");
	}
}
//定义正方形类，该类继承了四边形类
//并实现了drawTest接口
class SquareUseInterface extends QuadrangleUseInterface implements drawTest{

	@Override
	public void draw() {
		System.out.println("正方形.draw()");
	}
	//覆盖父类方法
	public void doAnyThing(){
		System.out.println("覆盖父类方法");
	}
}
public class QuadrangleUseInterface {
	public void doAnyThing(){
		
	}
	public static void main(String[] args) {
		//接口也可以进行向上转型操作
		drawTest[] d = {
				new SquareUseInterface(),new ParallelogramgleUseInterface()
		};
		for(int i = 0;i<d.length;i++){
			d[i].draw();
		}
	}
}
