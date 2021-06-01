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
            maxDiff = maxStep;
        }

        route = new int[route_length];
        Point point = new Point(maxStep,maxDiff);

        System.out.println(route[0]);
        route[0] = point.getPoint();

        for (int i = 1; i < route_length; i++) {
            point.setPoint(route[i-1]);
            route[i] = point.getPoint();
            System.out.println(route[i]);
        }

        route = null;
    };


}


