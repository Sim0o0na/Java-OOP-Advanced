package db_extended;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.naming.OperationNotSupportedException;
import java.lang.reflect.Field;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * Created by Sim0o on 4/3/2017.
 */
public class DatabaseExtendedTests<T extends Person> {
    private DatabaseExtended<T> extendedDb;
    private List<T> people;
    private Field peopleField;

    @Before
    @SuppressWarnings("unchecked")
    public void initExtendedDatabase() throws NoSuchFieldException, IllegalAccessException, OperationNotSupportedException {
        extendedDb = new DatabaseExtended<>();
        peopleField = DatabaseExtended.class.getDeclaredField("people");
        peopleField.setAccessible(true);
        people = (List<T>) this.peopleField.get(this.extendedDb);
    }

    @Test
    public void constructorShouldNotThrowExceptionForEmptyArgs() throws OperationNotSupportedException {
        DatabaseExtended<T> newDb = new DatabaseExtended<>();
    }

    //Testing add method
    @Test
    public void addPersonShouldAddPerson() throws OperationNotSupportedException {
        Person person1 = new Person(Long.parseLong("12121212121"), "Sim0o0na");
        Person person2 = new Person(Long.parseLong("5656"), "Pe6o");

        extendedDb.addPerson((T) person1);
        extendedDb.addPerson((T) person2);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void addPersonShouldNotAddTheSamePerson() throws OperationNotSupportedException {
        Person person1 = new Person(Long.parseLong("12121212121"), "Sim0o0na");
        Person person2 = new Person(Long.parseLong("5656"), "Sim0o0na");

        extendedDb.addPerson((T) person1);
        extendedDb.addPerson((T) person2);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void addPersonShouldThrowExceptionForEmptyUsername() throws OperationNotSupportedException {
        Person person1 = new Person(Long.parseLong("12121212121"), " ");
        extendedDb.addPerson((T) person1);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void addPersonShouldThrowExceptionForNullUsername() throws OperationNotSupportedException {
        Person person1 = new Person(Long.parseLong("12121212121"), null);
        extendedDb.addPerson((T) person1);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void addPersonShouldThrowExceptionForNullID() throws OperationNotSupportedException {
        Person person1 = new Person(null, null);
        extendedDb.addPerson((T) person1);
    }

    //TestingRemoveMethod
    @Test
    public void removePersonShouldReturnLastPerson() throws OperationNotSupportedException {
        Person person1 = new Person(Long.parseLong("12121212121"), "Simona");
        Person person2 = new Person(Long.parseLong("5656"), "Pe6o");
        extendedDb.addPerson((T) person1);
        extendedDb.addPerson((T) person2);
        Person removed = extendedDb.remove();
        Assert.assertEquals(person2, removed);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void removePersonShouldThrowExceptionForEmptyDb() throws OperationNotSupportedException {
        extendedDb.remove();
    }

    //Testing find method

    @Test
    public void findByIdShouldReturnTheSamePersonAsPreviouslyAdded() throws OperationNotSupportedException {
        Person person1 = new Person(Long.parseLong("12121212121"), "Simona");
        extendedDb.addPerson((T) person1);
        T foundById = extendedDb.findById(Long.parseLong("12121212121"));
        Assert.assertEquals(person1,foundById);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void findByIdShouldThrowExcForUnexistingPerson() throws OperationNotSupportedException {
        T foundById = extendedDb.findById(Long.parseLong("12121212121"));
    }
}
