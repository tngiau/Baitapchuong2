package TheMyPointClasses;

public class Test {
    public static void main(String[] args) {
        MyPoint v3 = new MyPoint();
        System.out.println(v3);
        v3.setX(8);
        v3.setY(6);
        System.out.println(v3);
        System.out.println(" x is : " + v3.getX());
        System.out.println(" y is : " + v3.getY());
        v3.setXY(3,0);// Test setXY

        System.out.println(v3.getXY()[0]); // Test getXY
        System.out.println(v3.getXY()[1]);
        System.out.println(v3);

        MyPoint v4 = new MyPoint(0,4);
        System.out.println(v4);

        System.out.println(v3.distance(v4));
        System.out.println(v4.distance(v3));
        System.out.println(v3.distance(5,6));
        System.out.println(v3.distance());

        MyPoint[] points = new MyPoint[10];
        for(int i = 0; i < points.length; i++){
            points[i] = new MyPoint(5,7);
            System.out.println();
        }

    }
}

