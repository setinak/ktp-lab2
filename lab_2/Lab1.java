import java.io.*;
import java.util.*;

/*
    Запрос ввода 3-х трехмерных точек
    и вывод площади треугольника, огранниченного ими
*/
public class Lab1 {
    public static void main (String[] args) {
        List<Point3d> points = new ArrayList<Point3d>();

		try {
			InputStreamReader inputReader = new InputStreamReader(System.in,"utf-8");
			BufferedReader buffReader = new BufferedReader(inputReader);

            for (int i = 0; i < 3; i++) {
                double x, y, z;

                System.out.print("Write new point:\nx: ");
                x = Double.parseDouble(buffReader.readLine());
                System.out.print("y: ");
                y = Double.parseDouble(buffReader.readLine());
                System.out.print("z: ");
                z = Double.parseDouble(buffReader.readLine());

                points.add(new Point3d(x, y, z));
            }

		} catch (IOException e) {
			e.printStackTrace();
        }

        try {
            System.out.println("Triangle area: " + computeArea(points.get(0), points.get(1), points.get(2)));
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
    
    //Вычисление площади области, огранниченной точками
    public static double computeArea (Point3d point1, Point3d point2, Point3d point3) {
        if (point1.equals(point2) || point2.equals(point3) || point3.equals(point1)) {
            throw new IllegalArgumentException("Two points cannot be equals!");
        }

        double a = point1.distanceTo(point2),
            b = point2.distanceTo(point3),
            c = point3.distanceTo(point1);
        
        double p = (a + b + c)/2;
        double S = Math.sqrt(p * (p-a) * (p-b) * (p-c));

        return S;
    }
} 