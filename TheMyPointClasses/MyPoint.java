package TheMyPointClasses;

public class MyPoint {
    private int x;
    private int y;
    public MyPoint() {
        x = 0;
        y = 0;
    }
    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public int getY(){
        return y;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public int[] getXY(){
        return new int[] {x, y}; //////
    }
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public String toString() {
        return String.format("(%d, %d)", x, y);
    }
    public double distance( int x, int y){
        return Math.sqrt((this.y - y)+(this.x - x));
    }
    public double distance( MyPoint another){
        return Math.sqrt((this.y - another.getY())+(this.x - another.getX()));
    }
    public double distance( ){
        return Math.sqrt((this.x -0)+(this.y -0));
    }

}
