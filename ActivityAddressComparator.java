import java.util.Comparator;

public class ActivityAddressComparator implements Comparator<Activity> {
    public int compare(Activity a1, Activity a2){
        return a1.getAddress().compareTo(a2.getAddress());
    }
}
