package com.inguarus;

public class Main {

    public static void main(String[] args) {

        GenericsInteger<Integer> myGenericList = new GenericsListInteger<>();
        myGenericList.add(7);
        myGenericList.add(3);
        myGenericList.add(5);
        myGenericList.add(145);
        myGenericList.add(11);
        myGenericList.add(75);
        myGenericList.add(16);
        myGenericList.add(38);
        myGenericList.add(92);
        myGenericList.add(9);
        myGenericList.add(100);
        myGenericList.add(200);
        myGenericList.add(300);
        myGenericList.add(600);
        myGenericList.add(780);
        myGenericList.add(999);

        System.out.println("Number of items in the list: " + myGenericList.size() + " elements");
        System.out.println(myGenericList);
        System.out.println("Add an element to any position in the index: ");
        myGenericList.add(9, 10000);
        System.out.println(myGenericList);
        System.out.println(myGenericList.get(13));
        System.out.println(myGenericList.contains(999));
        System.out.println(myGenericList.contains(78954));
        System.out.println(myGenericList.isEmpty());
        myGenericList.removeIndex(0);
        System.out.println("Deleting an item by index: ");
        System.out.println(myGenericList);
        myGenericList.removeElement(10000);
        System.out.println("Deleting an element by value: ");
        System.out.println(myGenericList);
        myGenericList.set(2, 9999);
        System.out.println("To replace an item in the list: ");
        System.out.println(myGenericList);
        myGenericList.clear();
        System.out.println("Deleting all items in the list: ");
        System.out.println(myGenericList);

    }
}
