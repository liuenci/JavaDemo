package liuenci.cn.package_12;

public class Demo {

	public static void main(String[] args) {
		//�����쳣
//		int num = 10;
//		int num2 = 0;
//		System.out.println(num/num2);
//		System.out.println("pp");
		
		//��ָ���쳣
		//����Խ���쳣
//		int[] num = new int[10];
//		System.out.println(num[10]);
		
		//����ת���쳣
//		String num = "123";
//		double num1 = (double)num;
//		System.out.println(num1);
		
		
		int num1 = 10;
		int num2 = 0;
		try{
			int num3 =num1/num2;
			if(num3 == 0){
				throw new ArithmeticException(); 
			}
			System.out.println(num3);
		}catch(ArithmeticException e){
			//��ӡ�쳣��Ϣ
			//e.printStackTrace();
		}finally{
			System.out.println("��������Ϊ��");
		}
//		int sum=0;
//		int[] array = new int[]{1,2,3,4,5};
//		for(int i = 3;i<10;i++){
//			try{
//				sum+=array[i];
//			}catch(ArrayIndexOutOfBoundsException e){
//				e.printStackTrace();
//			}finally{
//				System.out.println("˧");
//			}
//				
//			
//		}
//		System.out.println(sum);
		
	}

}
