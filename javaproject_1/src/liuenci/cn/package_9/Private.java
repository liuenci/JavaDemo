package liuenci.cn.package_9;

/**
 * Created by 刘 on 2017/5/28.
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
        if (sex.equals("男")) {
            this.sex = sex;
        } else if (sex.equals("女")){
            this.sex = sex;
        } else {
            System.out.println("你这是在乱来");
        }

    }
    public String getSex () {
        return this.sex;
    }
    public static void main(String[] args) {
        Private p = new Private();
        p.setName("熊大大");
        System.out.println(p.getName());
        p.setSex("10");
        System.out.println(p.getSex());
    }
}
