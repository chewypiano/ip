import java.util.ArrayList;
import java.util.List;

/**
 * This class keeps track of, and manages the User's current list
 */
public class Planner {

    private List<Task> lst;

    public Planner () {
        this.lst = new ArrayList<>();
    }

    // This method is responsible for inserting text into list, and updating current index
    public void addTask (Task t) {
        this.lst.add(t);
    }

    public void completeTask (int i) {
        this.lst.get(i-1).markAsDone();
    }

    public Task getTask (int i) {
        return this.lst.get(i-1);
    }

    public int getNumTasks () {
        return this.lst.size();
    }

    public void del (int i) {
        this.lst.remove(i-1);
    }

    // Overrides toString() method of Object Class to display contents of list neatly
    @Override
    public String toString() {
        String msg = ". . . list is currently empty . . .";  // Default message given empty list
        if (!this.lst.isEmpty()) {
            msg = "";
            int i = 1;
            for (Task t: this.lst) {
                // Task t = this.list[i];
                msg += String.format("\t" + (i++) + ". " + t + "\n");
            }
        }
        return msg;
    }
}