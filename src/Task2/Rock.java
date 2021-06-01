package Task2;

public class Rock {
    private int maxStep;
    private int maxDiff;
    private int route_length;
    private int[] route = null;

    public int getMaxStep() {
        return maxStep;
    }


    public int getMaxDiff() {
        return maxDiff;
    }


    public int getRoute_length() {
        return route_length;
    }



    public Rock(int maxStep, int maxDiff, int route_length){

        if (route_length > 3 && maxStep > 1 && maxDiff > 0) {
            this.maxStep = maxStep;
            this.maxDiff = maxDiff;
            this.route_length = route_length;
        } else {
            throw new IllegalArgumentException("invalid type");
        }

        int max = -1;
        int min = maxStep + 1;
        int diff = 0;

        for (int i = 0; i < route_length; i++) {

        }

        route = null;
    }
}
