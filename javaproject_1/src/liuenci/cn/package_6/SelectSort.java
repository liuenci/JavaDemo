package liuenci.cn.package_6;

import java.util.Date;

public class SelectSort {

	/**
	 * @选择排序
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int num[] = {5,6,7,1,4,6,2};
		int[] num = new int[10000];
		
		for(int i=0;i<num.length;i++){//随机生成10000个数组元素
			num[i] = (int)(Math.random()*10000);
		}
		
		long first = new Date().getTime();
		for(int i=0;i<num.length;i++){
			int min=i;//无序区的最小数据数组下标
	        for(int j=i+1;j<num.length;j++)
	        {
	            //在无序区中找到最小数据并保存其数组下标
	            if(num[j]<num[min])
	            {
	                min=j;
	            }
	        }
	        if(min!=i)
	        {
	            //如果不是无序区的最小值位置不是默认的第一个数据，则交换之。
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
