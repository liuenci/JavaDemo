package package_2;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Date;

/**
 * Created by �� on 2017/5/28.
 */
public class Computer {
    //����Ʒ��
    String type;
    //����CPUƵ��
    double rate;
    //�����ڴ��С
    double size;
    //����Ӳ������
    double volume;
    //�����Ƿ���װ
    boolean install;
    //������������
    Date date;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        if (type.equals("����")) {
            this.type = "����";
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
        computer.setType("����");
        computer.setInstall(false);
        computer.setSize(1024.0);
        computer.setRate(100.0);
        computer.setVolume(50000);
        System.out.println("����:"+computer.getType());
        System.out.println("��������:"+computer.getDate());
        System.out.println("�Ƿ���װ��:"+computer.isInstall());
        System.out.println("CPUƵ��:"+computer.getRate()+"HZ");
        System.out.println("�ڴ��С:"+computer.getSize()+"G");
        System.out.println("Ӳ������:"+computer.getVolume()+"M");

    }
}
