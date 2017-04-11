package db_extended;
import javax.naming.OperationNotSupportedException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Sim0o on 4/3/2017.
 */
public class DatabaseExtended<T extends Person> {
    private List<T> people;

    public DatabaseExtended(){
        this.people = new ArrayList<T>();
    }

    public void addPerson(T person) throws OperationNotSupportedException {

        if (people.stream().anyMatch(t -> t.getId().equals(person.getId())) ||
                people.stream().anyMatch(t -> t.getUsername().equals(person.getUsername()))) {
            throw new OperationNotSupportedException("Person already exists in database");
        }

        this.people.add(person);
    }

    public T findById(Long id) throws OperationNotSupportedException {
        if(!people.stream().anyMatch(t->t.getId().equals(id))){
            throw new OperationNotSupportedException("No user with this id is present!");
        }
        else if(id==null){
            throw new OperationNotSupportedException("Id cannot be null");
        }
        T toReturn = people.stream().filter(t -> t.getId().equals(id)).findFirst().get();
        return toReturn;
    }

    public T findByUsername(String username) throws OperationNotSupportedException {
        if(!people.stream().allMatch(t -> t.getUsername().equals(username))){
            throw new OperationNotSupportedException("No user with this username is present!");
        }
        else if(username==null){
            throw new OperationNotSupportedException("Username cannot be null");
        }
        T toReturn = people.stream().filter(t -> t.getUsername().equals(username)).findFirst().get();
        return toReturn;
    }

    public T remove() throws OperationNotSupportedException {
        if(this.people.isEmpty()){
            throw new OperationNotSupportedException("Database is empty!");
        }
        T removed = people.get(people.size()-1);
        people.remove(people.size()-1);
        return removed;
    }
}
