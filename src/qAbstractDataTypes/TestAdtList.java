package qAbstractDataTypes;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.Random;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class TestAdtList {
    @Test
    public void newListShouldHaveSize0() {
        assertTrue(new ADTList().isEmpty());
    }

    @Test(dataProvider = "listInitialCapacity")
    public void listWithElementsShouldNotBeEmpty(int initCapacity) {
        ADTList l1 = new ADTList(initCapacity);
        for(int i = 0, max = new Random().nextInt(initCapacity) + 1; i < max; i++) {
            l1.insertElement(new Random().nextInt(initCapacity));
        }
        System.out.println(l1.size());
        assertTrue(!l1.isEmpty());
    }

    @Test(dataProvider = "listInitialCapacity")
    public void listWithAllElementsRemovedShouldBeEmpty(int initialCapacity) {
        ADTList l1 = new ADTList(initialCapacity);
        for (int i = 0; i < initialCapacity; i++) {
            l1.insertElement(new Random().nextInt(2 * initialCapacity));
        }
        assertTrue(!l1.isEmpty());
        for(int i = 0, s = l1.size(); i < s; i++) {
            l1.removeLastElement();
        }
        assertTrue(l1.isEmpty());
    }

    @Test(dataProvider =  "addElementsBack")
    public void elementsCanBeAddedAtTheBack(int[] originalElem, int[] addedElem, int[] finalArray) {
        ADTList l = new ADTList(originalElem);
        l.addElements(addedElem);

        assertTrue(l.equals(new ADTList(finalArray)));
    }

    @Test(dataProvider = "addElementsBack")
    public void canAddArrayOfElements(int[] originalElem, int[] addElem, int[] finalArray) {
        ADTList l = new ADTList(originalElem);
        l.addElements(addElem);
        assertTrue(l.equals(new ADTList(finalArray)));
    }

    @DataProvider(name = "addElementsBack")
    public Object[][] addElementsBack() {
        return new Object[][] {
                {new int[]{1, 2, 3}, new int[]{4, 5}, new int[]{1, 2, 3, 4, 5}},
                {new int[]{}, new int[]{4, 5}, new int[]{4, 5}},
                {new int[]{}, new int[]{}, new int[]{}}
        };
    }

    @Test(dataProvider = "addElementsMiddle")
    public void canAddElementsMiddle(int[] originalElem, int[] elemPosition, int[] finalArray) {
        ADTList l1 = new ADTList(originalElem);
        l1.insertElement(elemPosition[0], elemPosition[1]);
        assertTrue(l1.equals(new ADTList(finalArray)));
    }

    @DataProvider(name = "addElementsMiddle")
    public Object[][] addElementsMiddle() {
        return new Object[][] {
                {new int[]{1, 2, 3}, new int[]{1, 5}, new int[]{1, 5, 2, 3}},
                {new int[]{1, 2, 3}, new int[]{2, 5}, new int[]{1, 2, 5, 3}},
                {new int[]{}, new int[]{0, 5}, new int[]{5}},
                {new int[]{1, 2, 3}, new int[]{0, 5}, new int[]{5, 1, 2, 3}},
                {new int[]{1, 2, 3}, new int[]{3, 5}, new int[]{1, 2, 3, 5}}
        };
    }

    @Test(dataProvider = "cantAddElementInvalidPosition", expectedExceptions = {ArrayIndexOutOfBoundsException.class})
    public void cantAddElementInvalidPosition(int[] originalElem, int[] elemPosition, int[] finalArray) {
        ADTList l1 = new ADTList(originalElem);
        l1.insertElement(elemPosition[0], elemPosition[1]);
        System.out.println("Hola!");
        assertTrue(l1.equals(new ADTList(finalArray)));
    }

    @DataProvider(name = "cantAddElementInvalidPosition")
    public Object[][] cantAddElementsMiddle() {
        return new Object[][] {
                {new int[]{1, 2, 3}, new int[]{-1, 5}, new int[]{1, 2, 3}},
                {new int[]{1, 2, 3}, new int[]{4, 5}, new int[]{1, 2, 3}},
                {new int[]{}, new int[]{2, 5}, new int[]{}}
        };
    }

    @Test(dataProvider = "removeElementsList")
    public void canRemoveElementsFromList(int[] initialList, int position, int[] finalArray) {
        ADTList l = new ADTList(initialList);
        assertTrue(l.removeElement(position));
        assertTrue(l.equals(new ADTList(finalArray)));
    }

    @DataProvider(name = "removeElementsList")
    public Object[][] removeElementsListDP() {
        return new Object[][] {
                {new int[]{1, 2, 3}, 0, new int[]{2, 3}},
                {new int[]{1, 2, 3}, 1, new int[]{1, 3}},
                {new int[]{1, 2, 3}, 2, new int[]{1, 2}},
                {new int[]{1}, 0, new int[]{}}
        };
    }

    @Test(dataProvider = "cantRemoveElementsList")
    public void cantRemoveElementsFromList(int[] initialList, int position, int[] finalArray) {
        ADTList l = new ADTList(initialList);
        assertFalse(l.removeElement(position));
        assertTrue(l.equals(new ADTList(finalArray)));
    }

    @DataProvider(name = "cantRemoveElementsList")
    public Object[][] cantRemoveElementsListDP() {
        return new Object[][] {
                {new int[]{1, 2, 3}, -1, new int[]{1, 2, 3}},
                {new int[]{1, 2, 3}, 3, new int[]{1, 2, 3}},
                {new int[]{}, 2, new int[]{}}
        };
    }

    @Test(dataProvider = "getElems")
    public void canReadElementsFromList(int[] initialList, int position, int number) {
        ADTList l = new ADTList(initialList);
        assertTrue(l.get(position) == number);
    }

    @DataProvider(name = "getElems")
    public Object[][] getElemsDP() {
        return new Object[][] {
                {new int[]{1, 2, 3}, 0,  1},
                {new int[]{1, 2, 3}, 2, 3},
                {new int[]{1, 2, 3}, 1, 2}
        };
    }

    @Test(dataProvider = "getInvalidElems", expectedExceptions = {ArrayIndexOutOfBoundsException.class})
    public void cantReadElementsFromInvalidPositions(int[] initialList, int invalidPosition) {
        ADTList l = new ADTList(initialList);
        l.get(invalidPosition);
    }

    @DataProvider(name = "getInvalidElems")
    public Object[][] getInvalidElemsDP() {
        return new Object[][] {
                {new int[]{1, 2, 3}, -1},
                {new int[]{1, 2, 3}, 3},
                {new int[]{}, 2}
        };
    }


    @DataProvider(name = "listInitialCapacity")
    public Object[][] listInitialCapacity() {
        return new Object[][] {{2}, {10}};
    }
    @Test(dataProvider = "listInitialCapacity")
    public void listShouldHaveInitialCapacity(int initCapacity) {
        ADTList l1 = new ADTList(initCapacity);
        assertTrue(l1.size() == 0);
        assertTrue(l1.capacity() == initCapacity);
    }

    @Test(dataProvider = "isPresent")
    public void canFindElement(int[] initialList, int elem, boolean isPresent) {
        ADTList l = new ADTList(initialList);
        assertTrue(l.isElementPresent(elem) == isPresent);
    }

    @DataProvider(name = "isPresent")
    public Object[][] isPresentDP() {
        return new Object[][] {
                {new int[]{1, 2, 3}, -1, false},
                {new int[]{1, 2, 3}, 3, true},
                {new int[]{}, 2, false}
        };
    }

    @Test(dataProvider = "indexOfElement")
    public void canFindElementIndex(int[] initialList, int elem, int index) {
        ADTList l = new ADTList(initialList);
        assertTrue(l.indexOf(elem) == index);
    }

    @DataProvider(name = "indexOfElement")
    public Object[][] indexOfElementDP() {
        return new Object[][] {
                {new int[]{1, 2, 3}, 0, -1},
                {new int[]{1, 2, 3}, 3, 2},
                {new int[]{}, 2, -1}
        };
    }
}
