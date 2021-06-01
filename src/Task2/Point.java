package Task2;

public class Point {
    private int maxStep;
    private int maxDiff;

    private int max;
    private int min;
    private int diff;

    private int point;

    public int getPoint() {
        return point;
    }

    public void setPoint(int element) {
        max = Math.max(Math.max(max,min),element);
        //System.out.println("max " + max);
        min = Math.min(min,element);
        System.out.println("min" + min);
        diff = max - min;

        int a = negative(min);
        int b = positive(max);
        point = Math.round((float)Math.random() * (b - a) + a);
    }

    public Point(int maxStep, int maxDiff){
        this.maxStep = maxStep;
        this.maxDiff = maxDiff;
        point = (int) (Math.random()*maxStep);

        this.max = point;
        this.min = point;

        System.out.println(point);
    }


    private int positive (int max_f) {
        if (max_f+(maxStep-diff) > maxStep) {
            return maxStep;
        }
        else
            return max_f+(maxStep-diff);
    }

    private int negative (int min_f) {
        if (min_f-(maxStep-diff) < 0) {
            return 0;
        }
        else
            return min_f-(maxStep-diff);
    }


}
