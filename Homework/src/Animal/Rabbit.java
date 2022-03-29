package Animal;

public class Rabbit extends Animal{
    private String name;

    public Rabbit() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Rabbit(String name) {
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println(name+"吃草");
    }


    @Override
    public String toString() {
        return "Rabbit{" +
                "name='" + name + '\'' +
                '}';
    }
}
