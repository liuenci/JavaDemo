package the_11th_character_1;
import static java.lang.System.out;
import java.util.Random;
class Test{
	int i = 0;
}
public class FinalData {
	static Random rand = new Random();
	//����һ��final����
	private final int VALUE_1 = 9;
	//����һ��final,static����
	private static final int VALUE_2 = 10;
	//����һ��final����
	private Test test = new Test();
	//����һ������final������
	private Test test_2 = new Test();
	//����һ������Ϊfinal������
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
