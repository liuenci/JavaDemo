package the_11th_character_1;
import static java.lang.System.out;
import java.util.Random;
class Test{
	int i = 0;
}
public class FinalData {
	static Random rand = new Random();
	//声明一个final常量
	private final int VALUE_1 = 9;
	//声明一个final,static常量
	private static final int VALUE_2 = 10;
	//声明一个final引用
	private Test test = new Test();
	//声明一个不是final的引用
	private Test test_2 = new Test();
	//声明一个定义为final的数组
	private final int[] a = {1,2,3,4,5,6};
	private final int i4 = rand.nextInt(20);
	private static final int i5 = rand.nextInt(20);
	public String toString(){
		return i4+" "+i5+" ";
	}
	public static void main(String[] args) {
		FinalData data = new FinalData();
		data.test = new Test();
		//data.VALUE_2++;
		data.test_2 = new Test();
		for(int i = 0;i<data.a.length;i++){
			//a[i]=9;
			
		}
	}

}
