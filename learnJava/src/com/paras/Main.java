package com.paras;

public class Main {
    static void main() {
        LL list = new LL();
        list.insertFirst(5);
        list.insertFirst(42);
        list.insertFirst(3);
        list.insertEnd(45);
        list.insert(66, 1);
        list.display();
        System.out.println(list.deleteFirst() + " is deleted");
        list.display();
    }
}
