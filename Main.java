public class Main {
    public static void main(String[] args){
        FitnessTracker tracker = new FitnessTracker();
        tracker.setTrackingStrategy(new Running());
        tracker.workout(30, 7);

        tracker.setTrackingStrategy(new WeightTraining());
        tracker.workout(50, 6);

        tracker.setTrackingStrategy(new Stretching());
        tracker.workout(45, 8);
    }
}