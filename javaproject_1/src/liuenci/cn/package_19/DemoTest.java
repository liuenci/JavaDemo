package liuenci.cn.package_19;

public class DemoTest {

	public static void main(String[] args) {
		//create a student of Object
		StudentBean stu= new StudentBean(002, "3333","ËÉ¸ç¶þºÅ", 1, "123456", "2017-01-01");
		StudentControl sc = new StudentControl();
		//add a student
		//sc.add(stu);
		//delete a student;
		//sc.delete(stu);
		//sc.recompose(stu);
		// query all students
		//sc.queryAll();
		sc.queryStudentById();
	}
}
