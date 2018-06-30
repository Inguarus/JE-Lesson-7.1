package com.inguarus;

public interface GenericsInteger<T> {


    void add(T element);

    void add(int index, T element);

    T get(int index);

    void clear();

    boolean contains(T element);

    boolean isEmpty();

    boolean removeIndex(int index);

    boolean removeElement(T element);

    void set(int index, T element);

    int size();

}


