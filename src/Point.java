public class Point {
    private int x;
    private int y;

    public Point() {

    }

    public Point(int x, int y) {
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
    public double calculateDistance(Point point){

        return Math.sqrt(Math.pow((getX()- point.x),2)+Math.pow((getY()- point.y),2));
    }
    public double calculateDistance(int x ,int y){
      return  Math.sqrt(Math.pow((getX()-x),2)+Math.pow((getY()-y),2));
    }

    @Override
    public String toString() {
        return String.format("x:%d  y:%d",x,y);

    }
}
