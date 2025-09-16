public class AList<Anything> {
    private Anything[] items;
    private int size;

    public AList() {
        size = 0;
        items = (Anything[]) new Object[100];
    }

    public void resize(int capacity) {
        Anything[] newItems = (Anything[]) new Object[capacity];
        System.arraycopy(items, 0, newItems, 0, size);
        items = newItems;
    }

    public void addLast(Anything x) {
        if (size == items.length) {
            // resize(size + 1);
            resize(size * 2);

        }

        items[size] = x;
        size++;
    }

    public Anything getLast() {
        return items[size - 1];
    }

    public Anything removeLast() {
        Anything removed = getLast();
        //items[size - 1] = 0;
        // Why do we not need it? --Sep 16 5:33PM 2025
        // Because we add the error checking code later.
        // When you want to get the item already deleted,
        // it will throw an exception.
//        public int get(int i){
//            if(i >= items.length){
//                throw new IllegalArgumentException();
//            }
//            return items[i];
//        }
        items[size - 1] = null; // When the arrayList is generic, we null out the removed item to save memory.

        size--;
        return removed;
    }
}
