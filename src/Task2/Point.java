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

        int a = negative(min);
        int b = positive(max);
        point = Math.round((float)Math.random() * (b - a) + a);
    }

    public Point(int maxStep, int maxDiff){
        this.maxStep = maxStep;
        this.maxDiff = maxDiff;
        this.point = (int) (Math.random()*maxStep);

        this.max = point;
        this.min = point;
    }


    private int positive (int max_f) {
        if (max_f+diff > maxStep) {
            return maxStep;
        }
        else
            return max_f+diff;
    }

    private int negative (int min_f) {
        if (min_f-diff < 0) {
            return 0;
        }
        else
            return min_f-diff;
    }


}
