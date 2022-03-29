package Animal;

public class Tigger extends Animal{
    private String name;

    public Tigger(String name) {
        this.name = name;
    }

    public Tigger() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Tigger{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void eat() {
        System.out.println(name+"吃肉");
    }
}
