package liuenci.cn.package_2;

public class Homework {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(4 + 8 / 3 < 7 / 6 );
		//4+8/3>7/6,��������Ϊfalse
		
		int i = 10;
		System.out.println(i ++ <= ++ i);
		//i�ĺ��ԼӴ�ʱ��ֵ��10��++i��ֵ��12�����Բ���������true
		
		System.out.println(8.1F / 2 == 8.1 / 2);
		//8.1F�ǵ����ȣ�8.1��˫���ȣ����Ͳ�һ�����Բ����
		
		i = 3;
		int x = i ++ + i ++ + i ++;
		System.out.println(x); 
		//��һ��i��ֵ��3���ڶ���i��ֵ��4��������i��ֵ��5������x��ֵ��12
		
		int j = 3;
		int y = ++ j + ++ j + ++ j;
		System.out.println(y); 
		//��һ��j��ֵ��4���ڶ���j��ֵ��5��������j��ֵ��6������y��ֵ��15
		
		int k = 3;
		int z = k ++ + ++ k + k ++;
		System.out.println(z); 
		//��һ��k��ֵ��3���ڶ���k��ֵ��5��������k��ֵ��5������z��ֵ��13
		
		j = -5;
		int m = j ++ - j -- + ++j - --j; 
		System.out.println(m);
		//��һ��j��ֵ��-5���ڶ���j��ֵ��-4��������j��ֵ��-4�����ĸ�j��ֵ��-5
		//���Խ����0
	}

}
