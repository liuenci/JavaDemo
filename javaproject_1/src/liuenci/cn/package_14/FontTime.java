package liuenci.cn.package_14;

public class FontTime {

	public static void main(String[] args) {
		//ͳ��ÿ���ֳ��ֵĴ���
		int sum=1;
		String str="�Ϸ����Żƻ��ӣ�"
				+ "�ϻƿ��ŷ����ӡ�"
				+ "�Ϸ�Ҫ���ϻƵķ����ӣ�"
				+ "�ϻ�Ҫ���Ϸ��Ļƻ��ӣ�"
				+ "ĩ�˶������������˻ƻ��ӣ�"
				+ "�ƻ��������˷����ӡ�";
		//��String����ת�ɵ������ַ���
		char[] singleChar=str.toCharArray();
		for(int i=0;i<singleChar.length;i++){
			if(singleChar[i]!=' '){
				for(int j=i+1;j<singleChar.length;j++){
					//�����������ͬ���ֵ�ʱ�򣬰Ѻ�����ֱ�ɿո񣬷�ֹ�ظ�������
					if(singleChar[i]==singleChar[j]){
						singleChar[j]=' ';
						sum++;
					}
				}
				//��ӡ
				System.out.println("��"+str.valueOf(singleChar[i])+"���ĸ�����"+(sum)+"��");
				//����sum
				sum=1;
			}
		}
	}

}
