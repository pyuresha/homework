package Task2;

public class RockExample {
    private int maxStep;
    private int maxDiff;
    private int route_length;

    public int getMaxStep() {
        return maxStep;
    }

    public void setMaxStep(int maxStep) {
        this.maxStep = maxStep;
    }

    public int getMaxDiff() {
        return maxDiff;
    }

    public void setMaxDiff(int maxDiff) {
        this.maxDiff = maxDiff;
    }

    public int getRoute_length() {
        return route_length;
    }

    public void setRoute_length(int route_length) {
        this.route_length = route_length;
    }
    

    public static final int [] example1 = new int[]{0,2,2,4,5,4,3,2,1,1,3,2,1,2,2,2};

    /** out
     *
     *    *
     *    *** *
     *    ******
     *    *******     *
     *    ********   **    *
     *    ********__****__**
     *    655454320012310012
     */
    public static final int [] example2 = new int[]{6,5,5,4,5,4,3,2,0,0,1,2,3,1,0,0,1,2};
}
