package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class MyLinkedListTest {

    @Test
    public void ifStackIsCreated_shouldReturnTrue() {
        Stack<Integer> stack = new Stack<>();
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        stack.push(myThirdNode);
        stack.push(mySecondNode);
        stack.push(myFirstNode);
        INode peek = stack.peek();
        Assert.assertEquals(peek, myFirstNode);
    }

    @Test
    public void IfStackIsPopOrPeekShouldReturnTrue() {
        Stack<Integer> stack = new Stack<>();
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        stack.push(myThirdNode);
        stack.push(mySecondNode);
        stack.push(myFirstNode);
        INode popStack = stack.pop();
        Assert.assertEquals(popStack, myFirstNode);
    }

    @Test
    public void IfQueueIsCreatedShouldReturnTrue() {
        Queue<Integer> queue = new Queue<>();
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        queue.enqueue(myFirstNode);
        queue.enqueue(mySecondNode);
        queue.enqueue(myThirdNode);
        INode peek = queue.peek();
        Assert.assertEquals(peek, myFirstNode);
    }

    @Test
    public void InQueueIfNodeIsDequeuedShouldReturnTrue() {
        Queue<Integer> queue = new Queue<>();
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        queue.enqueue(myFirstNode);
        queue.enqueue(mySecondNode);
        queue.enqueue(myThirdNode);
        INode dequeueQueue = queue.dequeue();
        Assert.assertEquals(dequeueQueue, myFirstNode);
    }
}

