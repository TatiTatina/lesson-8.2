public class Point {
    int x,y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Point3D extends Point {


    int z;

    public Point3D(int x, int y, int z) {

        super(x, y);

        this.z = z;
    }
}


class PolyLine {

    Point[] points;

    public  PolyLine(Point... points) {
        this.points = points;
    }

    public double length(){
        double sum = 0 , len1, len2;

        for (int i = 0; i < points.length - 1; i++){

            len1 = points[i].x - points[i+1].x;

            len2 = points[i].y - points[i+1].y;

            sum += Math.sqrt(len1 * len1 + len2 * len2);
        }
        return sum;
    }
}

class ClosedPolyLine extends PolyLine {

    public ClosedPolyLine(Point... points) {
        super(points);
    }

    @Override
    public double length() {

        double length = super.length();


        double len1 = points[points.length - 1].x - points[0].x;
        double len2 = points[points.length - 1].y - points[0].y;
        double additionalLength = Math.sqrt(len1 * len1 + len2 * len2);


        length += additionalLength;

        return length;
    }
}



