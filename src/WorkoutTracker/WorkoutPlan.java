package src.WorkoutTracker;

import java.util.ArrayList;

public class WorkoutPlan {

    protected ArrayList<Workout> workoutPlan;

    WorkoutPlan() {
        this.workoutPlan = new ArrayList<Workout>();
    }

    WorkoutPlan(ArrayList<Workout> workoutPlan) {
        this.workoutPlan = workoutPlan;
    }

    public ArrayList<Workout> getWorkoutPlan() {
        return this.workoutPlan;
    }

    public void setWorkoutPlan(ArrayList<Workout> workoutPlan) {
        this.workoutPlan = workoutPlan;
    }

    public void addWorkout(Workout workout) {
        this.workoutPlan.add(workout);
    }

    public void addWorkout(Workout workout, int day) {
        this.workoutPlan.add(day, workout);
    }

    @Override
    public String toString() {
        String value = new String();
        for (int i = 0; i < this.workoutPlan.size(); i++) {
            value += "- Day" + i + 1 + " " + this.workoutPlan.get(i) + "\n";
        }

        return value;
    }

}
