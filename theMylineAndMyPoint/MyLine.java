package theMylineAndMyPoint;

public class MyLine {
    private mypoint begin;
    private mypoint end;
    public MyLine( int x1, int y1, int x2, int y2 ) {
        begin = new mypoint ( x1, y1 );
        end = new mypoint ( x2, y2 );
    }
    public MyLine( mypoint begin,  mypoint end ) {
        this.begin = begin;
        this.end = end;
    }
    public mypoint getBegin() {
        return begin;
    }
    public void setBegin(mypoint begin) {
        this.begin = begin;
    }
    public mypoint getEnd() {
        return end;
    }
    public void setEnd(mypoint end) {
        this.end = end;
    }
    public int getBeginX(){
        return begin.getX();
    }
    public void setBeginX(int x){
        this.begin.setX(x);
    }
    public int getBeginY(){
        return begin.getY();
    }
    public void setBeginY(int y){
        this.begin.setY(y);
    }
    public int getEndX(){
        return end.getX();
    }
    public void setEndX(int x){
        this.end.setX(x);
    }
    public int getEndY(){
        return end.getY();
    }
    public void setEndY(int y){
        this.end.setY(y);
    }
    public int[] getBeginXY(){
        return new int[]{begin.getX(),begin.getY()};
    }
    public void setBeginXY(int x, int y){
        this.begin.setX(x);
        this.begin.setY(y);
    }
    public int[] getEndXY(){
        return new int[]{end.getX(),end.getY()};
    }
    public void setEndXY(int x, int y){
        this.end.setX(x);
        this.end.setY(y);
    }
    public double getLength(){
        return end.distance();
    }
    public double getGradient(){
        return Math.atan2(end.getY()-begin.getY(),end.getX()-begin.getX());
    }
    public String toString(){
        return  String.format ("MyLine[ begin= (%d,%d), end= (%d,%d)]",begin.getX(),begin.getY(),end.getX(),end.getY());
    }


    


}
