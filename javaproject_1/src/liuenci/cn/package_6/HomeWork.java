package liuenci.cn.package_6;

public class HomeWork {

	/**
	 * @��һ��������ַ���a��c��u��b��e��p��f��z��
	 * ���򲢰���Ӣ����ĸ����������������� 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char  grapheme[] = {'a','c','u','b','e','p','f','z'};
		
		//ѡ������
		for(int i = 0;i<grapheme.length;i++){  //���ѭ��
			int min =i;
			for(int j = i+1;j<grapheme.length;j++){   //�ڲ�ѭ��
				//��������ֵС������ֵ�����ֵ��ֵ��min
				if(grapheme[j]<grapheme[min]){
					min = j;
				}
			}
			if(min!=i){
				char temp = grapheme[min];
				grapheme[min] = grapheme[i];
				grapheme[i] = temp;
				
			}
		}
		//��������ַ�����
		System.out.print("�������:");
		for(int i=0;i<grapheme.length;i++){
			System.out.print(grapheme[i]+" ");
		}
		//����
		System.out.println();
		//��������ַ�����
		System.out.print("�������:");
		for(int i=grapheme.length-1;i>=0;i--){
			System.out.print(grapheme[i]+" ");
		}
	}

}
