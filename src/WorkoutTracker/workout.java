package src.WorkoutTracker;
import java.util.ArrayList;

public class Workout extends WorkoutPlan {

    protected String name;
    protected ArrayList<Exersice> exersicePlan;

    Workout() {
        super();
        this.name = "";
        this.exersicePlan = new ArrayList<Exersice>();
    }


    public ArrayList<Exersice> getExersicePlan() {
        return exersicePlan;
    }

    public void setExersicePlan(ArrayList<Exersice> exersicePlan) {
        this.exersicePlan = exersicePlan;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        String output = "";
        output += "Workout name is " + this.name + "can contains these exersices";
        for (int i = 0; i < exersicePlan.size(); i++) {
            output += exersicePlan.get(i) + " ";
        }

        return output;
    }







}
