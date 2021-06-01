package Task2;

public class Point {

    private int max;
    private int min;
    private int diff;
    private int point;

    public int getMax() {
        return max;
    }

    public int getMin() {
        return min;
    }

    public int getDiff() {
        return diff;
    }

    public void setPoint(int max, int min, int element) {
        this.max = Math.max(Math.max(max,min),element);
        this.min = Math.min(min,element);
        this.diff = this.max - this.min;
    }

    public Point(int maxStep){
        int point = (int) (Math.random()*maxStep);
        int max = point;
        int min = point;
    }
}
