package Area;

public class Square implements Shape{
    private double width;

    public Square(double width) {
        this.width = width;
    }

    public Square() {
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double showArea() {
        System.out.print("正方形面积:");
        return width*width;
    }

    @Override
    public String toString() {
        return "Square{" +
                "width=" + width +
                '}';
    }
}

