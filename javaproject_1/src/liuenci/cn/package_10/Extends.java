package liuenci.cn.package_10;

/**
 * Created by �� on 2017/6/2.
 */
public class Extends {
    //����
    private String name;
    //�Ա�
    private String sex;
    //�޲ι��캯��
    public Extends() {
    }
    //�вι��캯��


    public Extends(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //����
    private int age;

    /**
     * ����Է�����
     */
    public void eat() {
        System.out.println("�Է�");
    }

    /**
     * ����˯������
     */
    public void sleep() {
        System.out.println("˯��");
    }

    /**
     * �����ˮ����
     */
    public void drink() {
        System.out.println("��ˮ");
    }
}
