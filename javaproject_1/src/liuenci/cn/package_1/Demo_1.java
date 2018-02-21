package liuenci.cn.package_1;

public class Demo_1 {

	/**
	 * author：刘恩赐
	 * 课程内容：运算符
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int i = 2;
		boolean x = i ++ > i -- && i ++ > 5;             //短路与
		System.out.println(x + "," + i);
		int j = 2;
		boolean y = j + 1 < 9 || ++ j < j --;                //短路非
		System.out.println(y + "," + j);
		int k = 2;
		boolean z = k ++ < k ++ && k ++ > k ++;  
		System.out.println(z + "," + k);
		*/
		int i=0;
		System.out.println("new i="+(~i));
		int j=5;
		System.out.println("new j="+(~j));
		int k=7;
		System.out.println("new k="+(~k));
		i=4;
		System.out.println("new i="+(i<<2));
	}

}
