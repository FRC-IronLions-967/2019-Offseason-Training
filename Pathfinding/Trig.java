public class Trig {
    public static void main(String args[]) {
        double x = 2.0;
        double y = -2.0;
        double angle = Math.atan(x/y) * 180/Math.PI;
        angle -= (x < 0 && y < 0) ? 180 : 0;
        angle += (x > 0 && y < 0) ? 180 : 0;
        System.out.println(angle);
    }
}