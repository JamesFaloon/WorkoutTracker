package src.WorkoutTracker;

import java.util.ArrayList;

public class WorkoutPlan {

    protected ArrayList<workout> workoutPlan;

    WorkoutPlan() {
        this.workoutPlan = new ArrayList<workout>();
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
