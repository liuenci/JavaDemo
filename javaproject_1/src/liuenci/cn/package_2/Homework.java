package liuenci.cn.package_2;

public class Homework {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(4 + 8 / 3 < 7 / 6 );
		//4+8/3>7/6,布尔类型为false
		
		int i = 10;
		System.out.println(i ++ <= ++ i);
		//i的后自加此时的值是10，++i的值是12，所以布尔类型是true
		
		System.out.println(8.1F / 2 == 8.1 / 2);
		//8.1F是单精度，8.1是双精度，类型不一样所以不相等
		
		i = 3;
		int x = i ++ + i ++ + i ++;
		System.out.println(x); 
		//第一个i的值是3，第二个i的值是4，第三个i的值是5，所以x的值是12
		
		int j = 3;
		int y = ++ j + ++ j + ++ j;
		System.out.println(y); 
		//第一个j的值是4，第二个j的值是5，第三个j的值是6，所以y的值是15
		
		int k = 3;
		int z = k ++ + ++ k + k ++;
		System.out.println(z); 
		//第一个k的值是3，第二个k的值是5，第三个k的值是5，所以z的值是13
		
		j = -5;
		int m = j ++ - j -- + ++j - --j; 
		System.out.println(m);
		//第一个j的值是-5，第二个j的值是-4，第三个j的值是-4，第四个j的值是-5
		//所以结果是0
	}

}
