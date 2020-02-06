package club.banyuan.Demo02.sendRed;

public class User {

    //定义成员变量，姓名，余额
    private String name;
    private int money;

    public User(String name, int money) {
        this.name = name;
        this.money = money;
    }
    //定义展示的方法，可以用toString


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", money=" + money +
                '}';
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
