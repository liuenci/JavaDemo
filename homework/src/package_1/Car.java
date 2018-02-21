package package_1;

/**
 * Created by 刘 on 2017/5/28.
 */
public class Car {
    //定义车名
    private String carName;
    //定义编号
    private int coding;

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public int getCoding() {
        return coding;
    }

    public void setCoding(int coding) {
        this.coding = coding;
    }

    public Car(String carName, int coding) {
        this.carName = carName;
        this.coding = coding;
    }

    public Car(int coding, String carName) {
        this.carName = carName;
        this.coding = coding;
    }
}
