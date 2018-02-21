package liuenci.cn.package_6;

import java.util.Date;

public class BubbleSort {

	/**
	 * @冒泡排序
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = new int[10000];
		
		for(int i=0;i<num.length;i++){//随机生成10000个数组元素
			num[i] = (int)(Math.random()*10000);
		}
		
		long first = new Date().getTime();
		for(int i=0;i<num.length;i++){//外层循环用于定义循环次数
			for(int j=0;j<num.length-1;j++){
				//num[0]和num[1]比较
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
