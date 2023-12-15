import java.util.Comparator;
public class ActivityNameComparator implements Comparator<Activity> {
    @Override
    public int compare(Activity o1, Activity o2) {
       return o1.getName().compareTo(o2.getName());
    }
}
