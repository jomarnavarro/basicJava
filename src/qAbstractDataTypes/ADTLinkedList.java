package qAbstractDataTypes;

public class ADTLinkedList {
    Node head;
    Node tail;
    int length;

    public ADTLinkedList() {
        head = tail = null;
    }

    public ADTLinkedList(int[] elems) {
        this();
        for (int i = 0; i < elems.length; i++) {
            this.add(elems[i]);
        }
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public int length() {
        return this.length;
    }

    public void add(int n) {
        if(length == 0) {
            this.head = this.tail = new Node(n);
        } else {
            Node newNode = new Node(n);
            this.tail.setNext(newNode);
            tail = newNode;
        }
        length++;
    }

    public void add(int index, int n) {
        if(index >= 0 && index <= length) {
            if(index == 0)
                addHead(n);
            else if(index == length)
                addTail(n);
            else {
                Node temp = get(index - 1);
                Node newNode = new Node(n);
                newNode.setNext(temp.getNext());
                temp.setNext(newNode);
                length++;
            }
        } else throw new IndexOutOfBoundsException("Invalid position " + index);
    }

    public Node get(int index) {
        Node temp = head;
        for(int i = 0; i < index; i++) {
            temp = temp.getNext();
        }
        return temp;
    }

    public void addHead(int n) {
        if(length == 0) {
            this.head = this.tail = new Node(n);
        } else {
            Node newNode = new Node(n);
            newNode.setNext(head);
            head = newNode;
        }
        length++;
    }

    public void addTail(int n) {
        this.add(n);
    }

    public boolean equals(ADTLinkedList l) {
        if(this.length == l.length) {
            Node thisTemp = this.head;
            Node lTemp = l.head;
            for (int i = 0; i < length; i++) {
                if(thisTemp.getValue() != lTemp.getValue())
                    return false;
                thisTemp = thisTemp.getNext();
                lTemp = lTemp.getNext();
            }
            return true;
        }
        return false;
    }
}

