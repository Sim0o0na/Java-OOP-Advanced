package database;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.naming.OperationNotSupportedException;
import java.lang.reflect.Field;

/**
 * Created by Sim0o on 3/31/2017.
 */
public class DatabaseTests {
    private static final Integer TEST_ELEMENT = 5;
    private static final String ITEMS_FIELD_NAME = "items";
    private static final int ITEMS_CAPACITY = 16;

    private Database db;
    private Integer[] dbItems;
    private Field itemsField;

    @Before
    public void initDb() throws OperationNotSupportedException, NoSuchFieldException, IllegalAccessException {
        db = new Database(TEST_ELEMENT);
        this.itemsField = Database.class.getDeclaredField(ITEMS_FIELD_NAME);
        this.itemsField.setAccessible(true);
        this.dbItems = (Integer[])this.itemsField.get(this.db);
    }

    @Test
    public void capacityShouldBe16() throws OperationNotSupportedException  {
        Assert.assertEquals(ITEMS_CAPACITY, this.dbItems.length);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void passNullToConstructorShouldThrowExc() throws OperationNotSupportedException {
        Database db = new Database(null, TEST_ELEMENT);
    }

    @Test
    public void passingEmptyArgsToConstructorShouldNotThrowException() throws OperationNotSupportedException {
        Database db = new Database();
    }
    @Test(expected = OperationNotSupportedException.class)
    public void passNullElementToAddMethodShouldThrowExc() throws OperationNotSupportedException {
        db.addItem(null);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void passTooMuchElementsToAddMethod() throws OperationNotSupportedException {
        Integer[] elementsToAdd = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17};
        Database newDB = new Database(elementsToAdd);
    }

    @Test
    public void removeItemShoudReturnSameItemAddedPreviously() throws OperationNotSupportedException {
       db.addItem(TEST_ELEMENT);
       Integer lastItem = db.removeItem();
       Assert.assertEquals(lastItem, TEST_ELEMENT);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void removingFromEmptyDatabaseShouldThrowException() throws ArrayIndexOutOfBoundsException, OperationNotSupportedException {
        Integer lastItem = db.removeItem();
        Integer testLastItem = db.removeItem();
    }

    @Test
    public void fetchMethodShouldReturnAllDBItems(){
        Integer[] fetch = db.fetch();
        Assert.assertArrayEquals(fetch, this.dbItems);
    }
}
