package com.inguarus;

import java.util.Arrays;

public class GenericsListInteger<T> implements GenericsInteger<T> {

    private int INIT_SIZE = 10;
    private Object[] array = new Object[INIT_SIZE];
    private int size = 0;


    @Override
    public void add(T element) {
        if (size >= array.length) {
            resize();
        }
        array[size] = element;
        size++;
    }

    @Override
    public void add(int index, T element) {

        if (index < 0 || index > size - 1) {
            throw new IndexOutOfBoundsException();
        }
        if (size >= array.length) {
            resize();
        }
        System.arraycopy(array, index, array, index + 1, size - index);
        array[index] = element;
        size++;

    }

    @Override
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException();
        }
        return (T) array[index];
    }

    @Override
    public void clear() {
        for (int i = 0; i < array.length; i++) {
            array[i] = null;
        }
        size = 0;
    }

    @Override
    public boolean contains(T element) {
        for (int i = 0; i < size; i++) {
            if (element.equals(array[i])) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean removeIndex(int index) {
        if (index < 0 || index > size - 1) {
            throw new IndexOutOfBoundsException();
        }
        System.arraycopy(array, index + 1, array, index, size - index - 1);
        size--;
        return true;
    }

    @Override
    public boolean removeElement(T element) {
        for (int i = 0; i < size; i++) {
            if (element.equals(array[i])) {
                System.arraycopy(array, i + 1, array, i, size - i - 1);
                size--;
                return true;
            }
        }
        return false;
    }

    @Override
    public void set(int index, T element) {
        if (index < 0 || index > size - 1) {
            throw new IndexOutOfBoundsException();
        }
        array[index] = element;
    }

    private void resize() {
        int newSize = array.length * 3 / 2 + 1;
        Object[] newArray = new Object[newSize];
        System.arraycopy(array, 0, newArray, 0, array.length);
        array = newArray;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return "GenericsListInteger: " +
                Arrays.toString(array) +
                ".";
    }
}
