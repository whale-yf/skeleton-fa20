public interface Deque<T> {
    void addFirst(T item);

    void addLast(T item);

    default boolean isEmpty() {
        return size == 0;
    }

    int size();

    void printDeque();

    T removeLast();

    T removeFirst();

    T get(int index);
}
