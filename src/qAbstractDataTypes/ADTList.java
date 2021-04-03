package qAbstractDataTypes;

public class ADTList {

    private static final int DEFAULT_VALUE = -1;
    private int[] data;
    private int currentPosition;
    private int currentCapacity;
    private static final int DEFAULT_CAPACITY = 100;

    public ADTList(int initialCapacity) {
        data = new int[initialCapacity];
        currentPosition = 0;
        this.currentCapacity = initialCapacity;

    }

    public ADTList(int[] initialElems) {
        if(initialElems.length == 0) {
            this.currentCapacity = DEFAULT_CAPACITY;
        } else {
            this.currentCapacity = initialElems.length * 2;
        }

        this.data = new int[this.currentCapacity];
        for (int i = 0; i < initialElems.length; i++) {
            this.insertElement(initialElems[i]);
        }
    }
    public ADTList() {
        this.data = new int[DEFAULT_CAPACITY];
        this.currentPosition = 0;
        this.currentCapacity = DEFAULT_CAPACITY;
    }

    public boolean isEmpty() {
        return this.currentPosition == 0;
    }

    public int size() {
        return this.currentPosition;
    }

    public int capacity() {
        return this.currentCapacity;
    }

    public boolean insertElement(int o) {
        //check whether size == capacity
        if(currentPosition == currentCapacity) {
            //create another array twice the current capacity
            int[] newData = new int[2 * currentCapacity];
            //copy all elements in old array to new one
            for(int i = 0; i < currentPosition; i++) {
               newData[i] = data[i];
            }
            //reasign data
            data = newData;
            //change current Capacity to twice the original one.
            currentCapacity *= 2;
        }
        this.data[currentPosition++] = o;
        return true;
    }

    public void insertElement(int position, int elem) {
        //makes sure there is an extra element and list grows if necessary
        if(position >=0 && position <= currentPosition) {
            this.insertElement(DEFAULT_VALUE);
            for(int i = this.currentPosition - 1; i > position; i--) {
                this.data[i] = this.data[i - 1];
            }
            this.data[position] = elem;
        } else throw new ArrayIndexOutOfBoundsException("Invalid Position " + position);
    }

    public void addElements(int[] addElems) {
        for (int i = 0; i < addElems.length; i++) {
            this.insertElement(addElems[i]);
        }
    }

    public boolean removeLastElement() {
        return this.removeElement(this.currentPosition - 1);
    }

    public boolean removeElement(int position) {
        try {
            int ret = this.get(position);
            if(this.currentPosition == this.currentCapacity) {
                currentPosition--;
                return true;
            }
            for (int i = position; i < currentPosition; i++) {
                this.data[i] = this.data[i + 1];
            }
            currentPosition--;
        }catch(IndexOutOfBoundsException e) {
            return false;
        }
        return true;
    }

    public int get(int position) {
        if(position >= 0 && position < this.currentPosition)
            return this.data[position];
        else throw new ArrayIndexOutOfBoundsException("Invalid position " + position);
    }

    public boolean isElementPresent(int elem) {
        return indexOf(elem) != -1;
    }

    public int indexOf(int elem) {
        for (int i = 0; i < currentPosition; i++) {
            if(get(i) == elem) {
                return i;
            }
        }
        return -1;
    }


    public boolean equals(ADTList n) {
        if(this.size() != n.size())
            return false;
        for (int i = 0; i < this.size() ; i++) {
            if(this.get(i) != n.get(i))
                return false;
        }
        return true;
    }



}
