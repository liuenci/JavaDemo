package liuenci.cn.package_6;

import java.util.Date;

public class BubbleSort {

	/**
	 * @ð������
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = new int[10000];
		
		for(int i=0;i<num.length;i++){//�������10000������Ԫ��
			num[i] = (int)(Math.random()*10000);
		}
		
		long first = new Date().getTime();
		for(int i=0;i<num.length;i++){//���ѭ�����ڶ���ѭ������
			for(int j=0;j<num.length-1;j++){
				//num[0]��num[1]�Ƚ�
				int temp;
				if(num[j]>num[j+1]){
					temp = num[j];
					num[j] = num[j+1];
					num[j+1] = temp;
				}
			}
		}
		for(int i=0;i<num.length;i++){
			System.out.println(num[i]);
		}
		long last = new Date().getTime();
		
		System.out.println(last - first);
		
	}

}
