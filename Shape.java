public abstract class Shape {
    protected Point centerPoint;
    private static int count;

    public Shape(Point centerPoint) {
        this.centerPoint = centerPoint;
        count++;
    }

    public void setCenterPoint(Point centerPoint) {
        this.centerPoint = centerPoint;
    }

    public Point getCenterPoint() {
        return centerPoint;
    }

    public static int getCount() {
        return count;
    }
}
