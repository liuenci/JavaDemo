package liuenci.cn.package_9;

/**
 * Created by 刘 on 2017/5/28.
 */
public class President {
    private String name;
    private String sex;
    private int age;
    private double value;
    private boolean marketed;

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

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public boolean isMarketed() {
        return marketed;
    }

    public void setMarketed(boolean marketed) {
        this.marketed = marketed;
    }
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getName() {
//        return this.name;
//    }
//
//    public void setSex(String sex) {
//        this.sex = sex;
//    }
//
//    public String getSex() {
//        return this.sex;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public int getAge() {
//        return this.age;
//    }
//
//    public void setValue(double value) {
//        this.value = value;
//    }
//
//    public double getValue() {
//        return this.value;
//    }
//
//    public void setMarketed(boolean marketed) {
//        this.marketed = marketed;
//    }
//
//    public boolean getMarketed() {
//        return this.marketed;
//    }

    public static void main(String[] args) {
        President p = new President();
        p.setName("熊大大");
        System.out.println("公司名称:" + p.getName());
        p.setSex("女");
        System.out.println("性别:" + p.getSex());
        p.setAge(18);
        System.out.println("年龄:" + p.getAge());
        p.setValue(1000000.0);
        System.out.println("身价:" + p.getValue());
        p.setMarketed(true);
        System.out.println("是否上市:" + p.isMarketed());
    }
}
