package coding_ninjas.data_structures_in_java.oops.oops_part_one;

public class DynamicArray {
    private int[] data;
    private int nextElementIndex;

    public DynamicArray() {
        this.data = new int[5];
        nextElementIndex = 0;
    }

    public DynamicArray(int length) {
        this.data = new int[length];
        nextElementIndex = 0;
    }

    public int size() {
        return nextElementIndex;
    }

    public boolean isEmpty() {
        return nextElementIndex == 0;
    }

    public int get(int index) {
        if (nextElementIndex <= index) {
            // Throw Error
            return -1;
        }
        return data[index];
    }

    public void add(int element) {
        if (nextElementIndex == data.length)
            increaseCapacity();
        data[nextElementIndex++] = element;
    }

    public void set(int index, int element) {
        if (index >= nextElementIndex) {
            // Throw Error
            return;
        }
        data[index] = element;
    }

    private void increaseCapacity() {
        int[] temp = data;
        data = new int[temp.length + 1];
        System.arraycopy(temp, 0, data, 0, temp.length); // coping the array
        /* copy all the data temp to data
        for (int i = 0; i < temp.length; i++) {
            data[i] = temp[i];
        }
        */
    }

    public int removeLast() {
        if (nextElementIndex == 0)
            return -1;
        return data[nextElementIndex-- - 1];
    }
}


class DynamicArrayMain {
    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray();
        for (int i = 1; i < 100; i++)
            dynamicArray.add(100 + i);

        System.out.println("dynamic Array size: " + dynamicArray.size());
        System.out.println("dynamic Array get(98): " + dynamicArray.get(98));

        dynamicArray.set(3, 170);
        System.out.println("dynamic Array get(3): " + dynamicArray.get(3));

        while(!dynamicArray.isEmpty()) {
            System.out.println(dynamicArray.removeLast());
            System.out.println("size - " + dynamicArray.size());
        }
    }
}