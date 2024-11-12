package theMylineAndMyPoint;

public class mypoint {
    private int x;
    private int y;
    public mypoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    public int[] getXY(){
        return new int[] {this.x, this.y};
    }
    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }
    public String toString(){
        return String.format(" (%d,%d) ", x, y);
    }
    public double distance( int x, int y){
        return Math.sqrt(this.y - y)+Math.sqrt(this.x - x);
    }
    public double distance( mypoint another){
        return Math.sqrt((this.y- another.getY())+(this.x- another.getX()));
    }
    public double distance(){
        return Math.sqrt((this.x -0) + (this.y -0));
    }

}
