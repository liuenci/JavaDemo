package liuenci.cn.package_6;

import java.util.Date;

public class SelectSort {

	/**
	 * @ѡ������
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int num[] = {5,6,7,1,4,6,2};
		int[] num = new int[10000];
		
		for(int i=0;i<num.length;i++){//�������10000������Ԫ��
			num[i] = (int)(Math.random()*10000);
		}
		
		long first = new Date().getTime();
		for(int i=0;i<num.length;i++){
			int min=i;//����������С���������±�
	        for(int j=i+1;j<num.length;j++)
	        {
	            //�����������ҵ���С���ݲ������������±�
	            if(num[j]<num[min])
	            {
	                min=j;
	            }
	        }
	        if(min!=i)
	        {
	            //�����������������Сֵλ�ò���Ĭ�ϵĵ�һ�����ݣ��򽻻�֮��
	            int temp=num[i];
	            num[i]=num[min];
	            num[min]=temp;
	        }
		}
		for(int i=0;i<num.length;i++){
			System.out.println(num[i]);
		}
		long last = new Date().getTime();
		
		System.out.println(last - first);
			
	}

}
