package liuenci.cn.package_10;

/**
 * Created by 刘 on 2017/6/2.
 */
public class Extends {
    //名字
    private String name;
    //性别
    private String sex;
    //无参构造函数
    public Extends() {
    }
    //有参构造函数


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

    //年龄
    private int age;

    /**
     * 定义吃饭方法
     */
    public void eat() {
        System.out.println("吃饭");
    }

    /**
     * 定义睡觉方法
     */
    public void sleep() {
        System.out.println("睡觉");
    }

    /**
     * 定义喝水方法
     */
    public void drink() {
        System.out.println("喝水");
    }
}
