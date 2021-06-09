package com.bridgelabz;

public class Queue<T> {
    MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();

    // enqueue the Node to queue
    public void enqueue(INode<Integer> newNode) {
        myLinkedList.append(newNode);
    }

    // peek the top node in queue
    public INode<Integer> peek() {
        return myLinkedList.head;
    }

    // dequeue node in the queue
    public INode<Integer> dequeue() {
        return myLinkedList.popFirst();
    }
}
