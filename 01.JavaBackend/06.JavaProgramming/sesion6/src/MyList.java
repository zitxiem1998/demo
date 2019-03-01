
import java.util.Arrays;


public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object element[];

    public MyList() {
        element = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        element = new Object[capacity];
    }

    public void ensureCapa() {
        if (size >= DEFAULT_CAPACITY) {
            int newSize = element.length * 2;
            element = Arrays.copyOf(element, newSize);
        }
    }

    public void add(int index, E e) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index);
        } else if (index == size) {
            ensureCapa();
            element[index] = e;
            size++;
        } else {
            for (int i = size; i >= index; i--) {
                element[i + 1] = element[i];
            }
            size++;
            element[index] = e;
        }
    }

    public Object remove(int index) {
        Object e;
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index);
        } else {
            e = element[index];
            for (int i = index + 1; i < size; i++) {
                element[i - 1] = element[i];
            }
            this.size--;
            return e;
        }
    }

    public int size() {
        return this.size;
    }

    public Object[] clone() {
        Object[] clone = new Object[size];
        for (int i = 0; i < this.size; i++) {
            clone[i] = element[i];
        }
        return clone;
    }

    public boolean contains(E e) {
        for (int i = 0; i < this.size; i++) {
            if (element[i] == e) {
                return true;
            }
        }
        return false;
    }


    public Object get(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index);
        }
        return element[index];
    }

    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<Integer>();
        myList.add(0, 1);
        myList.add(1, 2);
        myList.add(2, 3);
        myList.add(3, 4);
        myList.add(4, 10);

        for (int i = 0; i < myList.size; i++) {
            System.out.println("MyList[" + i + "] = " + myList.get(i));
        }
        myList.add(5, 6);
        System.out.println("Remove = " + myList.remove(2));
        for (int i = 0; i < myList.size; i++) {
            System.out.println("MyList[" + i + "] = " + myList.get(i));
        }
        System.out.println("size:" + myList.size());
    }
}
