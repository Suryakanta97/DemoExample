package com.surya.java.list;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;

import com.surya.java.list.CustomList;

public class CustomListUnitTest {
     @Test
     public void givenEmptyList_whenIsEmpty_thenTrueIsReturned() {
         List<Object> list = new CustomList<>();
    
         assertTrue(list.isEmpty());
     }
     
     @Test
     public void givenNonEmptyList_whenIsEmpty_thenFalseIsReturned() {
         List<Object> list = new CustomList<>();
         list.add(null);
      
         assertFalse(list.isEmpty());
     }
     
     @Test
     public void givenListWithAnElement_whenSize_thenOneIsReturned() {
         List<Object> list = new CustomList<>();
         list.add(null);
      
         assertEquals(1, list.size());
     }
     
     @Test
     public void givenListWithAnElement_whenGet_thenThatElementIsReturned() {
         List<Object> list = new CustomList<>();
         list.add("surya");
         Object element = list.get(0);
      
         assertEquals("surya", element);
     }
     
     @Test
     public void givenEmptyList_whenElementIsAdded_thenGetReturnsThatElement() {
         List<Object> list = new CustomList<>();
         boolean succeeded = list.add(null);
      
         assertTrue(succeeded);
     }
     
     @Test
     public void givenListWithAnElement_whenAnotherIsAdded_thenGetReturnsBoth() {
         List<Object> list = new CustomList<>();
         list.add("surya");
         list.add(".com");
         Object element1 = list.get(0);
         Object element2 = list.get(1);

         assertEquals("surya", element1);
         assertEquals(".com", element2);
     }
    
    @Test(expected = UnsupportedOperationException.class)
    public void whenAddToSpecifiedIndex_thenExceptionIsThrown() {
        new CustomList<>().add(0, null);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void whenAddAllToTheEnd_thenExceptionIsThrown() {
        Collection<Object> collection = new ArrayList<>();
        List<Object> list = new CustomList<>();
        list.addAll(collection);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void whenAddAllToSpecifiedIndex_thenExceptionIsThrown() {
        Collection<Object> collection = new ArrayList<>();
        List<Object> list = new CustomList<>();
        list.addAll(0, collection);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void whenRemoveAtSpecifiedIndex_thenExceptionIsThrown() {
        List<Object> list = new CustomList<>();
        list.add("surya");
        list.remove(0);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void whenRemoveSpecifiedElement_thenExceptionIsThrown() {
        List<Object> list = new CustomList<>();
        list.add("surya");
        list.remove("surya");
    }

    @Test(expected = UnsupportedOperationException.class)
    public void whenRemoveAll_thenExceptionIsThrown() {
        Collection<Object> collection = new ArrayList<>();
        collection.add("surya");
        List<Object> list = new CustomList<>();
        list.removeAll(collection);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void whenRetainAll_thenExceptionIsThrown() {
        Collection<Object> collection = new ArrayList<>();
        collection.add("surya");
        List<Object> list = new CustomList<>();
        list.add("surya");
        list.retainAll(collection);
    }

    @Test
    public void givenEmptyList_whenContains_thenFalseIsReturned() {
        List<Object> list = new CustomList<>();

        assertFalse(list.contains(null));
    }

    @Test
    public void givenListWithAnElement_whenContains_thenTrueIsReturned() {
        List<Object> list = new CustomList<>();
        list.add("surya");

        assertTrue(list.contains("surya"));
    }

    @Test
    public void givenListWithAnElement_whenContainsAll_thenTrueIsReturned() {
        Collection<Object> collection = new ArrayList<>();
        collection.add("surya");
        List<Object> list = new CustomList<>();
        list.add("surya");

        assertTrue(list.containsAll(collection));
    }

    @Test
    public void givenList_whenContainsAll_thenEitherTrueOrFalseIsReturned() {
        Collection<Object> collection1 = new ArrayList<>();
        collection1.add("surya");
        collection1.add(".com");
        Collection<Object> collection2 = new ArrayList<>();
        collection2.add("surya");

        List<Object> list = new CustomList<>();
        list.add("surya");

        assertFalse(list.containsAll(collection1));
        assertTrue(list.containsAll(collection2));
    }

    @Test
    public void givenList_whenSet_thenOldElementIsReturned() {
        List<Object> list = new CustomList<>();
        list.add("surya");
        Object element = list.set(0, null);

        assertEquals("surya", element);
        assertNull(list.get(0));
    }

    @Test
    public void givenList_whenClear_thenAllElementsAreRemoved() {
        List<Object> list = new CustomList<>();
        list.add("surya");
        list.clear();

        assertTrue(list.isEmpty());
    }

    @Test
    public void givenList_whenIndexOf_thenIndexZeroIsReturned() {
        List<Object> list = new CustomList<>();
        list.add("surya");

        assertEquals(0, list.indexOf("surya"));
    }

    @Test
    public void givenList_whenIndexOf_thenPositiveIndexOrMinusOneIsReturned() {
        List<Object> list = new CustomList<>();
        list.add("surya");
        list.add(".com");
        list.add(".com");

        assertEquals(1, list.indexOf(".com"));
        assertEquals(-1, list.indexOf("com"));
    }

    @Test
    public void whenLastIndexOf_thenIndexZeroIsReturned() {
        List<Object> list = new CustomList<>();
        list.add("surya");

        assertEquals(0, list.lastIndexOf("surya"));
    }

    @Test
    public void whenLastIndexOf_thenPositiveIndexOrMinusOneIsReturned() {
        List<Object> list = new CustomList<>();
        list.add("surya");
        list.add("surya");
        list.add(".com");

        assertEquals(1, list.lastIndexOf("surya"));
        assertEquals(-1, list.indexOf("com"));
    }

    @Test
    public void whenSubListZeroToOne_thenListContainingFirstElementIsReturned() {
        List<Object> list = new CustomList<>();
        list.add("surya");
        List<Object> subList = list.subList(0, 1);

        assertEquals("surya", subList.get(0));
    }

    @Test
    public void whenSubListOneToTwo_thenListContainingSecondElementIsReturned() {
        List<Object> list = new CustomList<>();
        list.add("surya");
        list.add(".");
        list.add("com");
        List<Object> subList = list.subList(1, 2);

        assertEquals(1, subList.size());
        assertEquals(".", subList.get(0));
    }

    @Test
    public void givenListWithElements_whenToArray_thenArrayContainsThose() {
        List<Object> list = new CustomList<>();
        list.add("surya");
        list.add(".com");
        Object[] array = list.toArray();

        assertArrayEquals(new Object[] { "surya", ".com" }, array);
    }

    @Test
    public void givenListWithAnElement_whenToArray_thenInputArrayIsReturned() {
        List<Object> list = new CustomList<>();
        list.add("surya");
        String[] input = new String[1];
        String[] output = list.toArray(input);

        assertArrayEquals(new String[] { "surya" }, input);
    }

    @Test
    public void whenToArrayIsCalledWithEmptyInputArray_thenNewArrayIsReturned() {
        List<Object> list = new CustomList<>();
        list.add("surya");
        String[] input = {};
        String[] output = list.toArray(input);

        assertArrayEquals(new String[] { "surya" }, output);
    }

    @Test
    public void whenToArrayIsCalledWithLargerInput_thenOutputHasTrailingNull() {
        List<Object> list = new CustomList<>();
        list.add("surya");
        String[] input = new String[2];
        String[] output = list.toArray(input);

        assertArrayEquals(new String[] { "surya", null }, output);
    }

    @Test
    public void givenListWithOneElement_whenIterator_thenThisElementIsNext() {
        List<Object> list = new CustomList<>();
        list.add("surya");
        Iterator<Object> iterator = list.iterator();

        assertTrue(iterator.hasNext());
        assertEquals("surya", iterator.next());
    }

    @Test
    public void whenIteratorHasNextIsCalledTwice_thenTheSecondReturnsFalse() {
        List<Object> list = new CustomList<>();
        list.add("surya");
        Iterator<Object> iterator = list.iterator();

        iterator.next();
        assertFalse(iterator.hasNext());
    }
}
