public class FitnessTracker {
    private WorkoutTrackingStrategy trackingStrategy;

    public void setTrackingStrategy(WorkoutTrackingStrategy trackingStrategy) {
        this.trackingStrategy = trackingStrategy;
    }
    public void workout(int durationMinutes, int intensity){
        if (trackingStrategy != null){
            trackingStrategy.workout(durationMinutes, intensity);
        }
        else{
            System.out.println("No tracking strategy selected.");
        }
    }
}
