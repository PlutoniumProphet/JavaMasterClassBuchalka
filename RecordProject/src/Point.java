public class Point {

    private int x, y;

    public Point(){}

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public double distance() {


        return distance(0, 0);
    }

    public double distance(int x, int y) {
        //  needs to return the distance between this Point and Point x,y as double
        /* needs to return the distance between this Point and Point 0,0 as double
        d(A,B)=√ (xB − xA) * (xB - xA) + (yB − yA) * (yB - yA) where √ represents square root. */

        return Math.sqrt( (getX() - x) * ( getX() - x)  + (getY() - y ) * (getY() - y));
    }

    public double distance(Point point) {

        return Math.sqrt( (getX() - point.getX()) * ( getX() - point.getX())
                + (getY() - point.getY() ) * (getY() - point.getY()));
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

}


