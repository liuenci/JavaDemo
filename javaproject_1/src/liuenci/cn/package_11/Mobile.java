package liuenci.cn.package_11;

public class Mobile implements USB{

	public static void main(String[] args) {
		Mobile mobile = new Mobile();
		mobile.dataReader();
		mobile.dataWriter();
	}

	@Override
	public void dataReader() {
		System.out.println("������");
	}

	@Override
	public void dataWriter() {
		System.out.println("д����");
	}

}
