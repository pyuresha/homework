package Task2;

public class Point {
    private int maxStep;
    private int maxDiff;

    private int max;
    private int min;
    private int diff;

    private int point;

    public int getPoint() {
        int a = negative(min, maxDiff - diff);
        int b = positive(max, maxDiff - diff);
        point = Math.round((float)Math.random() * (b - a) + a);
        return point;
    }

    public void setPoint(int max, int min, int element) {
        this.max = Math.max(Math.max(max,min),element);
        this.min = Math.min(min,element);
        this.diff = this.max - this.min;
    }

    public Point(int maxStep, int maxDiff){
        this.maxStep = maxStep;
        this.maxDiff = maxDiff;
        int point = (int) (Math.random()*maxStep);
        int max = point;
        int min = point;
    }


    private int positive (int max_f, int diff) {
        if (max_f+diff > maxStep) {
            return maxStep;
        }
        else
            return max_f+diff;
    }

    private int negative (int min_f, int diff) {
        if (min_f-diff < 0) {
            return 0;
        }
        else
            return min_f-diff;
    }
    

}
