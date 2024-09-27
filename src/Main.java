
public class Main {


    public static double calculateTotalLength(Measurable... objects) {
        double totalLength = 0;
        for (Measurable object : objects) {
            totalLength += object.getLength();
        }
        return totalLength;
    }


    public static void main(String[] args) {

        Point point = new Point(2,3);

        PolyLine polyLine = new PolyLine();

    }
}
