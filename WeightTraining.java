public class WeightTraining implements WorkoutTrackingStrategy{
    @Override
    public void workout(int durationMinutes, int intensity) {
        System.out.println("Weight training tracked:");
        System.out.println("Duration: " + durationMinutes + " minutes");
        System.out.println("Intensity: " + intensity);
    }
}
