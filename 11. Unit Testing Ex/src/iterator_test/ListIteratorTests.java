package iterator_test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.naming.OperationNotSupportedException;
import java.lang.reflect.Field;

/**
 * Created by Sim0o on 4/3/2017.
 */
public class ListIteratorTests<T extends String> {

    private static final String[] TEST_ELEMENTS = {"Simona", "Simeonova", "Hristova"};
    private ListIterator<String> listIterator;
    private T[] elements;
    private Field elementsField;


    @Before
    public void InitListIterator() throws NoSuchFieldException, IllegalAccessException, OperationNotSupportedException {
        listIterator = new ListIterator<>(TEST_ELEMENTS);
        elementsField = ListIterator.class.getDeclaredField("elements");
        elementsField.setAccessible(true);
        elements = (T[]) this.elementsField.get(this.listIterator);
    }

    @Test(expected = OperationNotSupportedException.class)
    @SuppressWarnings("unchecked")
    public void passingNullToConstructorShouldThrowExc() throws OperationNotSupportedException {
        String[] elements = null;
        ListIterator listIterator = new ListIterator(elements);
    }

    @Test
    public void hasNextShouldReturnTrue() throws OperationNotSupportedException {
        Assert.assertEquals(true, this.listIterator.iterator().hasNext());
    }

    @Test
    public void nextShouldReturnCorrectValue() throws OperationNotSupportedException {
        String next = this.listIterator.iterator().next();
        String valueThatShouldBeReturned = this.elements[this.listIterator.getInternalIndex()];
        Assert.assertEquals(valueThatShouldBeReturned, next);
    }

    @Test
    public void printShouldReturnElementAtCurrentInternalIndex() throws OperationNotSupportedException {
        String next = this.listIterator.print();
        String valueThatShouldBeReturned = this.elements[this.listIterator.getInternalIndex()];
        Assert.assertEquals(valueThatShouldBeReturned, next);
    }

    @Test
    public void moveShouldMoveIndexSuccessfully() throws OperationNotSupportedException {
       boolean moved = this.listIterator.move();
       Assert.assertEquals(true, moved);
    }
    @Test
    public void moveShouldNotMoveIndexSuccessfully4times() throws OperationNotSupportedException {
        this.listIterator.move();
        this.listIterator.move();
        this.listIterator.move();
        Assert.assertEquals(false,  this.listIterator.move());
    }
}
