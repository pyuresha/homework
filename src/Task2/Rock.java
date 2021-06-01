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

        if (route_length > 2 && maxStep > 1 && maxDiff > 0) {
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

        route[0] = 0;
        route[1] = 1;

        System.out.print(route[0] + " " + route[1] + " ");
        for (int i = 2; i < route_length; i++) {
            route[i] = point.getPoint(route[i-2],route[i-1]);
            System.out.print(route[i] + " ");

        }

        route = null;
    };


}


