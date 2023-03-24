package BaiTap.List;


import java.util.ArrayList;
import java.util.Arrays;

public class MyList<E> {
    private static final int DEFAULT_CAPACITY = 10;
    private int size = 0;
    private Object[] elements;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void add(int index, E e) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = elements[elements.length-1];
        for(int i = elements.length-1; i > index; i--){
            elements[i] = elements[i-1];
        }
        elements[index] = e;
    }

    public int size(){
        return size;
    }

    public E remove(int index){
        while(index >= size){
            System.out.println("Out of range");
        }
        E oldValue = (E) elements[index];

        int numMoved = size - index - 1;
        if (numMoved > 0)
            System.arraycopy(elements, index+1, elements, index,
                    numMoved);
        elements[--size] = null; // clear to let GC do its work
        return oldValue;
    }

    public E clone(){
        MyList<Integer> e = new MyList<Integer>();
        e.elements = Arrays.copyOf(elements, size);
        return (E) e;
    }

    public int indexOf(E o){
        if (o == null) {
            for (int i = 0; i < size; i++)
                if (elements[i]==null)
                    return i;
        } else {
            for (int i = 0; i < size; i++)
                if (o.equals(elements[i]))
                    return i;
        }
        return -1;
    }

    public boolean contains(E o){
        return indexOf(o) >= 0;
    }
    private static final Object[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA = {};
    public void ensureCapacity(int minCapacity){
        int minExpand = (elements != DEFAULTCAPACITY_EMPTY_ELEMENTDATA)
                // any size if not default element table
                ? 0
                // larger than default for default empty table. It's already
                // supposed to be at default size.
                : DEFAULT_CAPACITY;
    }

    public boolean add(E e){
        ensureCapacity(size + 1);  // Increments modCount!!
        elements[size++] = e;
        return true;
    }

    public E get(int i) {
        if (i>= size || i <0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );
        }
        return (E) elements[i];
    }

    public void clear(){
        // clear to let GC do its work
        for (int i = 0; i < size; i++)
            elements[i] = null;

        size = 0;
    }

}
