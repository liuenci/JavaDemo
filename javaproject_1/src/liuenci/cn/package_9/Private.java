package liuenci.cn.package_9;

/**
 * Created by �� on 2017/5/28.
 */
public class Private {
    private String name;
    private String sex;
    private int age;
    private double height;

    public void setName (String name) {
        this.name = name;
    }
    public String getName () {
        return this.name;
    }
    public void setSex (String sex) {
        if (sex.equals("��")) {
            this.sex = sex;
        } else if (sex.equals("Ů")){
            this.sex = sex;
        } else {
            System.out.println("������������");
        }

    }
    public String getSex () {
        return this.sex;
    }
    public static void main(String[] args) {
        Private p = new Private();
        p.setName("�ܴ��");
        System.out.println(p.getName());
        p.setSex("10");
        System.out.println(p.getSex());
    }
}
