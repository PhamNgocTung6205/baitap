public class Circle extends Shape {
    private double r;

    public Circle(Point point, double r) {
        super(point);
        this.r = r;
    }

    @Override
    public String toString() {
        return "Circle [Tâm=" + centerPoint + ", Bán kính=" + r + "]";
    }

}
