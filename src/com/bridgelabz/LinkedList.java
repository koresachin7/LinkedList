package com.bridgelabz;

/**
 * Purpose - To create a Linked List and add elements
 * Final sequence to be printed - 56 - 30 - 70
 * @author - Sachin kore
 * @version - 16.0
 */
public class LinkedList {
    public static void main(String[] args) {
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.append(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.displayNode();
    }
}