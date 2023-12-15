import javax.lang.model.type.ArrayType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Collection;
import java.util.Comparator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Activity a1=new Activity("Keshav",21,"wyw11gyw");
        Activity a2=new Activity("James",41,"wy35yw");
        Activity a3=new Activity("Tiger",16,"wyw234yw");
        Activity a4=new Activity("Helen",21,"wywduy178dbw");
        Activity a5=new Activity("Kesh",24,"wywu2732nj");
        ArrayList<Activity> ar=new ArrayList<>();
         ar.add(a1);
         ar.add(a2);
         ar.add(a3);
         ar.add(a4);
        /**
         * Anonmyous comparator giving
         */
         Comparator<Activity> com = new Comparator<Activity>() {
            @Override
            public int compare(Activity o1, Activity o2) {
               return o1.getName().compareTo(o2.getAddress());
            }

        };

        /**
         * calling all Comparators for checking .
         */
        Collections.sort(ar);
        for(int i=0;i<ar.size();i++){
            System.out.println(ar.get(i));
        }
         Collections.sort(ar,com);
        for(int i=0;i<ar.size();i++){
            System.out.println(ar.get(i));
        }
         Collections.sort(ar,new ActivityAgeComparator());
        for(int i=0;i<ar.size();i++){
            System.out.println(ar.get(i));
        }
        Collections.sort(ar,new ActivityNameComparator());
        for(int i=0;i<ar.size();i++){
            System.out.println(ar.get(i));
        }
        Collections.sort(ar,new ActivityAddressComparator());
        for(int i=0;i<ar.size();i++){
            System.out.println(ar.get(i));
        }

    }
}