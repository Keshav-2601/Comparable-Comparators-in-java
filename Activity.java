
public class Activity implements Comparable<Activity>  {
    public
    String name;
    int age;
    String Address;

    public Activity(String n,int age,String address){
        this.name=n;
        this.age=age;
        this.Address=address;
    }
    public String getName(){
        return this.name;
    }
    public String getAddress(){
        return this.Address;
    }
    public int getAge(){
        return this.age;
    }
    @Override
    public String toString(){
        return "NAME: "+this.name+
               "AGE: "+this.age+
               "Addess: "+this.Address;
    }

    /**
     * This is natural sorting property to class Activity. when u will write Collections.sort(Arr); it will sort according to internal function compareTo.
     *  also I can only have one time compareTo function per each class if i want to do  Multiple natural sorting then i have to give inside one compareTo only.
     * @param other the object to be compared.
     * @return
     */
    @Override
    public int compareTo(Activity other){
        return this.getName().compareTo(other.getAddress());
//        if(this.getAddress()==" "){  if u want to have multiple  natural sorting then use like this. otherwise use different comparators.
//
//        }
    }



}

