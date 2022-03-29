package School;
/*
定义一个研究生类 Graduate，实现 StudentInterface 接口和 TeacherInterface接口，
它定义的成员变量有 name(姓名)、sex(性别)、age(年龄)、fee(每学期学费)、pay(月工资)。
 */
public class Graduate implements StudentInterface,TeacherInterface{
    private String name;
    private String sex;
    private int age;
    private int fee;
    private int pay;

    public Graduate() {
    }

    public Graduate(String name, String sex, int age, int fee, int pay) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.fee = fee;
        this.pay = pay;
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

    @Override
    public void setFee(int fee) {
        this.fee=fee;
    }

    @Override
    public int getFee() {
        return fee;
    }

    @Override
    public void setPay(int pay) {
        this.pay=pay;
    }

    @Override
    public int getPay() {
        return pay;
    }

    @Override
    public String toString() {
        return "Graduate{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", fee=" + fee +
                ", pay=" + pay +
                '}';
    }
}
