package Animal;
/*
    请编程实现动物世界的继承关系。动物(Animal)具有行为：吃(eat)、睡觉(sleep)；动物包括：兔子(rabbit)、老虎(tiger)；
这些动物吃的行为各不相同(兔子吃草、老虎吃肉)，但睡觉的行为是一致的。请通过继承实现以上需求，并编写测试类AnimalTest进行测试。
 */
public class AnimalTest {
    public static void main(String[] args) {
        Animal rabbit1 =new Rabbit("兔子1号");
        Animal rabbit2 =new Rabbit("兔子2号");
        Animal tigger1=new Tigger("老虎");
        System.out.println(rabbit1);
        rabbit1.sleep();
        rabbit2.eat();
        rabbit2.sleep();
        tigger1.eat();
        tigger1.sleep();
    }
}
