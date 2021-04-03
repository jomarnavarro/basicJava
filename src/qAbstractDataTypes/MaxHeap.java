package qAbstractDataTypes;

public class MaxHeap extends Heap {

    @Override
    public int poll() {
        if(size == 0) throw new IllegalStateException();
        int item = items[0];
        items[0] = items[size - 1];
        size--;
        heapifyDown();
        return item;
    }


    @Override
    public void add(int item) {
        ensureCapacity();
        items[size] = item;
        size++;
        heapifyUp();
    }

    @Override
    public void heapifyUp() {
        int index = size - 1;
        while(hasParent(index) && parent(index) < items[index]) {
            swap(getParentIndex(index), index);
            index = getParentIndex(index);
        }
    }

    @Override
    public void heapifyDown() {
        int index = 0;
        while(hasLeftChild(index)) {
            //chooses the child index with smaller value
            int greaterChildIndex = getLeftChildIndex(index);
            if(hasRightChild(index) && rightChild(index) > leftChild(index)) {
                greaterChildIndex = getRightChildIndex(index);
            }
            //swaps if necessary or ends the loop
            if( items[index] > items[greaterChildIndex]) {
                break;
            } else {
                //do the swap
                swap(index, greaterChildIndex);
            }
            index = greaterChildIndex;
        }
    }
}
