package com.solvd.laba.linked.list;

public class MyLinkedList<T> {

    private Node<T> head;
    private Node<T> tail;

    private int size = 0;

    public Node<T> getHead() {
        return head;
    }

    public void setHead(Node<T> head) {
        this.head = head;
    }

    public Node<T> getTail() {
        return tail;
    }

    public void setTail(Node<T> tail) {
        this.tail = tail;
    }

    public int getSize() {
        System.out.print("The size is ");
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void addToStart(T object) {
        Node<T> tempNode = new Node<T>(object);
        tempNode.setNextNode(head);
        head = tempNode;
        if (tail == null) {
            tail = tempNode;
        }
        size++;
    }

    public void add(T object) {
        if (tail == null) {
            addToStart(object);
            return;
        }

        Node<T> tempNode = new Node<T>(object);
        tail.setNextNode(tempNode);
        tail = tempNode;
        size++;
    }

    public void addAtIndex(T object, int index) {
        Node<T> tempNode = new Node<T>(object);
        Node<T> node = head;
        for (int i = 0; i < index - 1; i++) {
            node = node.getNextNode();
        }
        tempNode.setNextNode((node.getNextNode()));
        node.setNextNode(tempNode);
        size++;
    }

    public void remove(int index) {
        if (index == 0) {

            Node<T> node = head;
            head = head.getNextNode();

            node.setNextNode(node.getNextNode().getNextNode());
        } else {
            Node<T> node = head;
            for (int i = 0; i < index - 1; i++) {
                node = node.getNextNode();
            }
            node.setNextNode(node.getNextNode().getNextNode());
        }
        size--;
    }


    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        Node<T> tempNode = head;
        while (tempNode != null) {

            if (tempNode != tail)
                builder.append(tempNode.getObject()).append(" \t");
            else builder.append(tempNode.getObject());
            tempNode = tempNode.getNextNode();
        }
        return builder.toString();
    }

}
