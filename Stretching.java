public class Stretching implements WorkoutTrackingStrategy{
    @Override
    public void workout(int durationMinutes, int intensity) {
        System.out.println("Stretching workout tracked:");
        System.out.println("Duration: " + durationMinutes + " minutes");
        System.out.println("Intensity: " + intensity);
    }
}
