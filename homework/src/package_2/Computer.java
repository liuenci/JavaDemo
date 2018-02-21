package package_2;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Date;

/**
 * Created by 刘 on 2017/5/28.
 */
public class Computer {
    //定义品牌
    String type;
    //定义CPU频率
    double rate;
    //定义内存大小
    double size;
    //定义硬盘容量
    double volume;
    //定义是否组装
    boolean install;
    //定义生产日期
    Date date;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        if (type.equals("惠普")) {
            this.type = "联想";
        } else {
            this.type = type;
        }

    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getSize() {
        return size/1024;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public boolean isInstall() {
        return install;
    }

    public void setInstall(boolean install) {
        if (type.equals("apple")) {
            this.install = false;
        } else {
            this.install = true;
        }
        this.install = install;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.setDate(new Date());
        computer.setType("惠普");
        computer.setInstall(false);
        computer.setSize(1024.0);
        computer.setRate(100.0);
        computer.setVolume(50000);
        System.out.println("名字:"+computer.getType());
        System.out.println("生产日期:"+computer.getDate());
        System.out.println("是否组装机:"+computer.isInstall());
        System.out.println("CPU频率:"+computer.getRate()+"HZ");
        System.out.println("内存大小:"+computer.getSize()+"G");
        System.out.println("硬盘容量:"+computer.getVolume()+"M");

    }
}
