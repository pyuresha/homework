package Task2;

public class Rock {
    private int maxStep;
    private int maxDiff;
    private int route_length;
    private int[] route;

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

        if(maxDiff > maxStep) {
            maxStep = maxDiff;
        }

        route = new int[route_length];
        route[0] = (int) (Math.random()*maxStep);
        int max = route[0];
        int min = route[0];
        int diff = 0;

        for (int i = 0; i < route_length; i++) {

        }

        route = null;
    };


}


