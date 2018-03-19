/*
    Описание трехмерной точки
*/
public class Point3d {
    private double xCoord, yCoord, zCoord;

    public Point3d(double x, double y, double z) {
        xCoord = x;
        yCoord = y;
        zCoord = z;
    }

    public Point3d() {
        this(0., 0., 0.);
    }

    public void setX(double val) {
        xCoord = val;
    }

    public void setY(double val) {
        yCoord = val;
    }

    public void setZ(double val) {
        zCoord = val;
    }

    public double getX() {
        return xCoord;
    }

    public double getY() {
        return yCoord;
    }

    public double getZ() {
        return zCoord;
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