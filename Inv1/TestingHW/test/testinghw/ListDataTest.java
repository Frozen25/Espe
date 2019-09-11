package testinghw;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alexis
 */
public class ListDataTest {
    
    public ListDataTest() {
        
    }
    // Creating a new object to be used on all tests
    ListData list = new ListData();  
    @Test
    public void testAdd() {
        System.err.println("Add"); //test name
        Integer value = 3;
        list.append(value);  //appends 3 in the list
        boolean inserted = list.inlist(value);  //checks if 3 was inserted
        assertEquals(true,inserted);  
    }
    @Test
    public void testRemove() {
        System.err.println("Remove"); //test name
        //appends 3, 2, 4, 6 in the list
        list.append(3);  
        list.append(2);  
        list.append(4);
        list.append(6);
        Integer index = 3;    //select the index of the element to delete
        boolean removed = list.remove(index); //deletes the third element
        assertEquals(true,removed);  //checks if it was deleted
    }
    @Test
    public void testGetIndex() {
        System.err.println("getIndex"); //test name
        //inserts 3, 2, 4 in the list
        list.append(3);
        list.append(2);
        list.append(4);
        // gets the index of the value  4
        Integer index = list.getIndex(4);
        // since 4 was appended third, it index is 2 (count starts at 0)
        Integer expected = 2;
        //checks the index of the value 4, thus confirms that appends are done at the end of the list
        assertEquals(expected,index);
    }
    
}
