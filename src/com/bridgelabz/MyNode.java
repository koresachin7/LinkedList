package com.bridgelabz;

public class MyNode<K> implements INode<K> {

    K key;
    INode next;

    public MyNode(K key) {
        this.key = key;
        this.next = null;
    }
    @Override
    public K getKey() {
        return key;
    }

    @Override
    public void setkey(K Key) {
        this.key = key;
    }

    public INode <K>getNext() {
        return next;
    }

    public void setNext(INode next) {
        this.next = next;
    }
}
