package Area;
/*
定义接口Shape，方法为showArea()，求出面积并显示，定义实现类矩形类Rectangle,
正方形类Square,圆类 Circle，根据各自的属性，用showArea方法求出各自的面积，在main方法中构造3个对象，调用showArea方法。
 */
public class Rectangle implements Shape{
    private double line;
    private double width;

    public Rectangle() {
    }

    public Rectangle(double line, double width) {
        this.line = line;
        this.width = width;
    }

    public double getLine() {
        return line;
    }

    public void setLine(double line) {
        this.line = line;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double showArea() {
        System.out.print("矩形面积:");
        return line*width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "line=" + line +
                ", width=" + width +
                '}';
    }
}
