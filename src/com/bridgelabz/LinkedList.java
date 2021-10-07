package com.bridgelabz;

/**
 * Purpose - To search LinkedList to find Node position of value 30
 * @author - Sachin kore
 * @version - 16.0
 */
public class LinkedList {
    public static void main(String[] args) {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.append(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.displayNode();
        // Getiing the position of element 30.
        myLinkedList.searchElement();

    }
}