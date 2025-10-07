public class Square extends Rectangle{
    public Square(Point centerPoint, double side) {
        super(centerPoint, side, side);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setHeight(side);
    }

    @Override
    public String toString() {
        return "Square [Tâm=" + centerPoint + ", Cạnh=" + getWidth() + "]";
    }

}
