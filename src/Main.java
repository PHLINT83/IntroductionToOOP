
public class Main {
    public static void main(String[] args) {
        //int a;                  //Объявление переменной 'a' типа 'int'
        Point A = new Point();    // Объявление переменной 'A' типа 'Point'
        //Создание объекта (экземпляра) 'A' класса 'Point'
        Point B = new Point();
        A.x = 2;
        A.y = 3;
        B.x = 4;
        B.y = 5;
        System.out.println("X = " + "(" + ((int)A.x + ";" + (int)A.y) + ")");
        System.out.println("Y = " + "(" + ((int)B.x + ";" + (int)B.y) + ")");
        System.out.println("Расстояние между двумя точками: " + Point.distance(A,B));
    }
}
class Point
{
    double x;
    double y;
    static double distance (Point c, Point d) {
        double dx = c.x - d.x;
        double dy = c.y - d.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    //double distance () {}
}