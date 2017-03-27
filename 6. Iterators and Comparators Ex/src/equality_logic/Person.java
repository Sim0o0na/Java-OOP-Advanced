package equality_logic;

/**
 * Created by Sim0o on 3/22/2017.
 */
public class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    @Override
    public boolean equals(Object p){
        if(this.compareTo(Class.cast(p))==0){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public int hashCode(){
        return this.name.length()+this.getAge()*15;
    }

    @Override
    public int compareTo(Person o) {
        if(this.getName().equals(o.getName()) && this.getAge()==o.getAge()){
            return 0;
        }
        else{
            return -1;
        }
    }
}

