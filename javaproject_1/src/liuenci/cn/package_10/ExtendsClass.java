package liuenci.cn.package_10;

/**
 * Created by �� on 2017/6/2.
 */
public class ExtendsClass extends Extends {
    //���弶��
    private String grade;

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    /**
     * ����Ӱ���Ϊ
     */
    public void overWork() {
        System.out.println("�Ӱ�");
    }

    /**
     * ��д����Է�����
     */
    public void eat(ExtendsClass person, String name) {
        person.setName(name);
        System.out.println("�����" + person.getName() + "�ؼҳԷ���");
    }
    public void drink(ExtendsClass person, String name) {
        person.setName(name);
        System.out.println("�����" + person.getName() + "�ؼҺ�ˮ��");
    }
}
