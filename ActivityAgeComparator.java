import java.util.Comparator;

public class ActivityAgeComparator implements Comparator<Activity> {

    public int compare(Activity a1,Activity a2){
        if(a1.getAge()>a2.getAge()){
            return -1;
        }
        else if(a1.getAge()<a2.getAge()){
            return 1;
        }
        return 0;
    }
}
