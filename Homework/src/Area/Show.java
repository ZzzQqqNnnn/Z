package Area;
/*
定义接口Shape，方法为showArea()，求出面积并显示，定义实现类矩形类Rectangle,
正方形类Square,圆类 Circle，根据各自的属性，用showArea方法求出各自的面积，在main方法中构造3个对象，调用showArea方法。
 */
public class Show {
    public static void main(String[] args) {
        Rectangle rectangle=new Rectangle(2.0,3.0);
        System.out.println(rectangle);
        System.out.println(rectangle.showArea());
        Square square=new Square();
        square.setWidth(5.0);
        System.out.println(square);
        System.out.println(square.showArea());
        Circle circle=new Circle(4.0);
        System.out.println(circle);
        System.out.println(circle.showArea());

    }
}
