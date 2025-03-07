package com.mylearnings.programs;

public class LinkedListCustom {

    Node head;

    public void insertBegining(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next=head;
        head= newNode;
    }
    public void insertEnding(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next !=null){
            temp = temp.next;
        }
        temp.next = newNode;
    }
    public void deleteData(int data){
        if(head == null){
            System.out.println("Linked List is empty");
            return;
        }
        if(head.data == data){
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next !=null && temp.next.data !=data){
            temp = temp.next;
        }
        if(temp.next == null){
            System.out.println("Data not found : "+data);
            return;
        }
        temp.next = temp.next.next;
    }

    public void displayData(){
        if(head == null){
            System.out.println("Linked List is empty");
            return;
        }
        Node temp = head;
        while (temp !=null){
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        LinkedListCustom linkedListCustom = new LinkedListCustom();

        linkedListCustom.insertEnding(20);
        linkedListCustom.insertEnding(30);
        linkedListCustom.insertEnding(40);
        linkedListCustom.insertEnding(50);
        linkedListCustom.insertBegining(10);
        linkedListCustom.displayData();
        linkedListCustom.deleteData(20);
        System.out.println();
        linkedListCustom.displayData();
    }

}


class  Node {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next=null;
    }
}
