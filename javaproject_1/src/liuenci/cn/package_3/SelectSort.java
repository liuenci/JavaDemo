package liuenci.cn.package_3;

public class SelectSort {

	/**
	 * ֱ��ѡ������
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����һ�����������
		int[] array={2,55,62,44,25,16};
		//����ֱ������Ķ���
		SelectSort sorter=new SelectSort();
		//����ֱ��ѡ���㷨����������
		sorter.sort(array);
	}
	public void sort(int[] array){
		int index;
		for(int i=1;i<array.length;i++){
			index=0;
			for(int j=1;j<=array.length-i;j++){
				if(array[j]>array[index]){
					index=j;
				}
				//������λ��array.length-i��index(���ֵ)�ϵ�������
				int temp=array[array.length-i];
				array[array.length-i]=array[index];
				array[index]=temp;
			}
			
		}
		showArray(array);
	}
	public void showArray(int[] array) {
		// TODO Auto-generated method stub
		for(int i=0;i<array.length;i++){
			int num=array[i];
			System.out.print(num+" ");
		}
		System.out.println();
	}

}
