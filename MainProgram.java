import java.util.ArrayList;

public class MainProgram {
    public static void main(String[] args) {
        ArrayList<Shape> shapeList = new ArrayList<>();
        shapeList.add(new Circle(new Point(1, 2), 5.0));
        shapeList.add(new Rectangle(new Point(10, 8), 20, 15));
        shapeList.add(new Square(new Point(-3, 4), 7));
        shapeList.add(new Circle(new Point(0, 0), 10));

        // đếm số lượng hình.
        System.out.println(Shape.getCount());

        // thông tin hình.
        for (Shape shape : shapeList) {
            System.out.println(shape);
        }

        // các tâm điểm
        for (Shape shape : shapeList) {
            System.out.println(shape.getCenterPoint());
        }

    }
}
