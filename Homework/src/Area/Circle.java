package Area;

public class Circle implements Shape{
    private final double Pi=3.14;
    private double r;

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public Circle() {
    }

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double showArea() {
        System.out.print("圆形面积:");
        return r*r*Pi;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "Pi=" + Pi +
                ", r=" + r +
                '}';
    }
}
