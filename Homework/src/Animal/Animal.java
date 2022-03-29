package Animal;
/*
    请编程实现动物世界的继承关系。动物(Animal)具有行为：吃(eat)、睡觉(sleep)；动物包括：兔子(rabbit)、老虎(tiger)；
这些动物吃的行为各不相同(兔子吃草、老虎吃肉)，但睡觉的行为是一致的。请通过继承实现以上需求，并编写测试类AnimalTest进行测试。
 */
public abstract class Animal {
    public Animal() {
    }

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }

    public abstract void eat();
    public void sleep(){
        System.out.println("晚上睡觉");
    }
}
