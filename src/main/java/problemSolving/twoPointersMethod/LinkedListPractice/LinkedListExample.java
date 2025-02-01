package problemSolving.twoPointersMethod.LinkedListPractice;

import java.util.ArrayList;


public class LinkedListExample {
    public static void main(String[] args) {
        java.util.LinkedList<Integer> l = new java.util.LinkedList<>();
        ArrayList<Integer> a = new ArrayList<>();
        l.add(5);
        l.add(3);
        l.offer(1);

        System.out.println(l+" - "+l.contains(3));

        SinglyLinkedList<Integer> myList = new SinglyLinkedList<>();
        myList.addFirst(5);
        myList.addFirst(3);
        myList.addFirst(1);

        myList.printList();
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
            node.next = head;
            head = node;
        }
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

    }

    public boolean contains(Integer i){
        return true;
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