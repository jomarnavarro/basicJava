package qAbstractDataTypes;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HeapSort {

    @Test(dataProvider = "arr")
    public void sortArray(int[] arr) {
        MinHeap mh = new MinHeap();
        for (int i = 0; i < arr.length; i++) {
            mh.add(arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(mh.poll() + " ");
        }
        System.out.println();

        MaxHeap mmh = new MaxHeap();
        for (int i = 0; i < arr.length; i++) {
            mmh.add(arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(mmh.poll() + " ");
        }



    }

    @DataProvider(name = "arr")
    public Object[][] arrDP() {
        return new Object[][] {
                {new int[] {0, 2, 4, 6, 8, 10, 9, 7, 5, 3, 1}}
        };
    }
}
