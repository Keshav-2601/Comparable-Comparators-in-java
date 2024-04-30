import java.util.Comparator;

public class ActivityAddressComparator implements Comparator<Activity> {
    public int compare(Activity a1, Activity a2){
        return a1.getAddress().compareTo(a2.getAddress()); // use to compare only for strings or u can say when u need to compare two strings u used compareTo here not (==). == is used to compare only integers.
        // so basically here compareTo function compare interlnally  like if(getadresss1. is > getadress2)-> then return -1 which means asecending or if it return +1 then it's descending. But this things work internally u don't need to mentions it in code.
    }
}
