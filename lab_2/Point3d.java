/*
    Описание трехмерной точки
*/
public class Point3d {
    private double x, y, z;

    public Point3d(double x1, double y1, double z1) {
        x = x1;
        y = y1;
        z = z1;
    }

    public Point3d() {
        this(0., 0., 0.);
    }

    public void setX(double x1) {
        x = x1;
    }

    public void setY(double y1) {
        y = y1;
    }

    public void setZ(double z1) {
        z = z1;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    //Проверка равенства 2-х точек
    public boolean equals(Point3d point) {
        return this.getX() == point.getX() && 
            this.getY() == point.getY() && 
            this.getZ() == point.getZ();
    }

    //Вычисление расстояния между точками
    public double distanceTo(Point3d point) {
        return Math.sqrt(Math.pow(point.getX() - this.getX(), 2) + 
            Math.pow(point.getY() - this.getY(), 2));
    }
}