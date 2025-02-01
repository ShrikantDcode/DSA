package problemSolving.twoPointersMethod.LinkedListPractice;

import java.util.ArrayList;


public class LinkedListExample {
    public static void main(String[] args) {
        java.util.LinkedList<Integer> l = new java.util.LinkedList<>();
        l.add(5);
        l.add(3);
        l.offer(1);

        System.out.println(l+" - "+l.contains(3));

        SinglyLinkedList<Integer> myList = new SinglyLinkedList<>();
        myList.addFirst(5);
        myList.addFirst(3);
        myList.addFirst(1);

        myList.addLast(10);
        myList.addFirst(7);
        //myList.removeFirst();
        myList.printList();
        myList.removeNthElement(2);
        myList.printList();
        System.out.println("Does myList contains number: "+myList.contains(5));
    }
}

class SinglyLinkedList<Integer> {
    int size = 0;
    Node<Integer> head;

    public boolean add(Integer i){
        return true;
    }
    public void addFirst(Integer i) {
        Node<Integer> node = new Node<>(i);
        if(head == null){
            head = node;
        } else {
            node.next = head; //point newNode next to head
            head = node; // make newNode Head
        }
        size++;
    }

    public void printList(){
        Node<Integer> current = head;
        while(current != null){
            System.out.print(current.data +" -> ");
            current = current.next;
        }
        System.out.println();
    }

    public void addLast(Integer i){
        Node<Integer> node = new Node<>(i);
        if(head == null){
            head = node; // if head is not pointing to any node, make it point to newNode
        } else {
            Node<Integer> current = head;
            while(current.next != null){ //traverse till last node, last node.next is null
                current = current.next; // move current node pointer to next node address
            }
            //now there is no more nodes are reffered by next i.e. reached end of list
            current.next = node; // instead of null last node points to newNode now

        }
        size++;
    }

    public Integer removeFirst(){
        if(head == null){
            throw new RuntimeException("List is empty");
        }
        Integer i = head.data;
        head = head.next;
        size--;
        return i;
    }

    public Node<Integer> removeNthElement(int index){
        Node<Integer> temp = head;
        Node<Integer> prev = null;

        if(head == null){
            return head;
        }

        if(index == 1){
            head = temp.next;
            return head;
        }
        //traverse list till nth element
        for(int i =1; temp != null && i< index; i++){
            prev = temp;
            temp = temp.next;
        }

        if(temp != null) {
            prev.next = temp.next;
        } else {
            System.out.println("Data not found");
        }
        return head;
    }

    public boolean contains(Integer i){
        Node<Integer> curr = head;
        while(curr != null){
            if(curr.data == i)
                return true;
            curr = curr.next;
        }
        return false;
    }

    private static class Node<Integer> {
        Integer data;
        Node<Integer> next;

        public Node(Integer data) {
            this.data = data;
            this.next = null;
        }
        public Node(Integer data, Node<Integer> next) {
            this.data = data;
            this.next = next;
        }
    }
}