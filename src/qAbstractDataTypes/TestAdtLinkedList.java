package qAbstractDataTypes;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class TestAdtLinkedList {

    @Test
    public void canCreateAnEmptyLL() {
        ADTLinkedList ll = new ADTLinkedList();
        assertTrue(ll.isEmpty());
    }

    @Test(dataProvider = "canAddElements")
    public void canAddArrayOfElements(int[] initialList, int[] finalList) {
        ADTLinkedList ll = new ADTLinkedList(initialList);

        assertTrue(ll.equals(new ADTLinkedList(finalList)));

    }

    @DataProvider(name = "canAddElements")
    public Object[][] canAddElementsDP() {
        return new Object[][] {
                { new int[] {1, 2, 3}, new int[] {1, 2, 3}}
        };
    }

    @Test(dataProvider =  "addElementsBack")
    public void elementsCanBeAddedAtTheBack(int[] originalElem, int[] addedElem, int[] finalArray) {
        ADTLinkedList ll = new ADTLinkedList(originalElem);
        for (int i = 0; i < addedElem.length; i++) {
            ll.addTail(addedElem[i]);
        }
        assertTrue(ll.equals(new ADTLinkedList(finalArray)));
    }

    @DataProvider(name = "addElementsBack")
    public Object[][] addElementsBack() {
        return new Object[][] {
                {new int[]{1, 2, 3}, new int[]{4, 5}, new int[]{1, 2, 3, 4, 5}},
                {new int[]{}, new int[]{4, 5}, new int[]{4, 5}},
                {new int[]{}, new int[]{}, new int[]{}}
        };
    }

    @Test(dataProvider =  "addElementsFront")
    public void elementsCanBeAddedAtTheFront(int[] originalElem, int[] addedElem, int[] finalArray) {
        ADTLinkedList ll = new ADTLinkedList(originalElem);
        for (int i = 0; i < addedElem.length; i++) {
            ll.addHead(addedElem[i]);
        }
        assertTrue(ll.equals(new ADTLinkedList(finalArray)));
    }

    @DataProvider(name = "addElementsFront")
    public Object[][] addElementsFrontDP() {
        return new Object[][] {
                {new int[]{1, 2, 3}, new int[]{4, 5}, new int[]{5, 4, 1, 2, 3}},
                {new int[]{}, new int[]{4, 5}, new int[]{5, 4}},
                {new int[]{}, new int[]{}, new int[]{}}
        };
    }

    @Test(dataProvider =  "addElementsMiddle")
    public void canAddMiddleElements(int[] originalElem, int[] addedElem, int[] finalArray) {
        ADTLinkedList ll = new ADTLinkedList(originalElem);
        ll.add(addedElem[0], addedElem[1]);
        ll.equals(new ADTLinkedList(finalArray));
        assertTrue(ll.equals(new ADTLinkedList(finalArray)));
    }

    @DataProvider(name = "addElementsMiddle")
    public Object[][] addElementsMiddleDP() {
        return new Object[][] {
                {new int[]{1, 2, 3}, new int[]{1, 5}, new int[]{1, 5, 2, 3}},
                {new int[]{1, 2, 3}, new int[]{2, 5}, new int[]{1, 2, 5, 3}},
                {new int[]{1, 2, 3}, new int[]{0, 5}, new int[]{5, 1, 2, 3}},
                {new int[]{1, 2, 3}, new int[]{3, 5}, new int[]{1, 2, 3, 5}},
                {new int[]{}, new int[]{0, 5}, new int[]{5}}
        };
    }

    @Test(dataProvider = "cantAddInvalidIndex", expectedExceptions = {IndexOutOfBoundsException.class})
    public void cantAddInvalidIndex(int[] initialList, int invalidIndex) {
        ADTLinkedList ll = new ADTLinkedList(initialList);
        ll.add(invalidIndex, 0);

    }

    @DataProvider(name = "cantAddInvalidIndex")
    public Object[][] cantAddInvalidIndexDP() {
        return new Object[][] {
                {new int[]{1, 2, 3}, -1},
                {new int[]{1, 2, 3}, 4}
        };
    }

}
