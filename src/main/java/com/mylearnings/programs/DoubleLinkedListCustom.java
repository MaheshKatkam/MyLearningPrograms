package com.mylearnings.programs;

public class DoubleLinkedListCustom {
    DoubleLinkedListNode headNode;
    DoubleLinkedListNode tailNode;

    public void insertBegining(int data){
        DoubleLinkedListNode newNode = new DoubleLinkedListNode(data);

        if(headNode == null){
            headNode = tailNode =  newNode;
            return;
        }
        newNode.nextNode = headNode;
        headNode.prevNode = newNode;
        headNode = newNode;
    }

    public void insertEnding(int data){
        DoubleLinkedListNode newNode = new DoubleLinkedListNode(data);
        if(headNode == null){
            headNode = tailNode = newNode;
            return;
        }
        DoubleLinkedListNode tempNode = headNode;
        while(tempNode.nextNode !=null){
            tempNode = tempNode.nextNode;
        }
        tempNode.nextNode = newNode;
        newNode.prevNode = tempNode;
    }

    public void deleteData(int data){
        if(headNode == null){
            System.out.println("Double linked list is empty");
            return;
        }
        DoubleLinkedListNode tempNode = headNode;
        while ((tempNode.nextNode !=null && tempNode.nextNode.data!=data)){
            tempNode=tempNode.nextNode;
        }
        if(tempNode.nextNode == null){
            System.out.println("Given element is not found in the list");
            return;
        }
        DoubleLinkedListNode nextNode =  tempNode.nextNode.nextNode ;
        tempNode.nextNode = tempNode.nextNode.nextNode;
        nextNode.prevNode = tempNode.nextNode;
    }

    public void diplayData(){
        if(headNode == null){
            System.out.println("Double linked list is empty");
            return;
        }
        DoubleLinkedListNode tempNode = headNode;
        while (tempNode !=null){
            System.out.print(tempNode.data + " -->");
            tempNode = tempNode.nextNode;
        }
    }

    public static void main(String[] args) {
        DoubleLinkedListCustom doubleLinkedListCustom = new DoubleLinkedListCustom();
        doubleLinkedListCustom.insertEnding(20);
        doubleLinkedListCustom.insertEnding(30);
        doubleLinkedListCustom.insertEnding(40);
        doubleLinkedListCustom.insertEnding(50);
        doubleLinkedListCustom.insertBegining(10);
        doubleLinkedListCustom.diplayData();
        System.out.println();
        doubleLinkedListCustom.deleteData(30);
        doubleLinkedListCustom.diplayData();

    }
}

class DoubleLinkedListNode {

    DoubleLinkedListNode node;
    int data;
    DoubleLinkedListNode prevNode;
    DoubleLinkedListNode nextNode;

    public DoubleLinkedListNode(int data){
        this.data = data;
        prevNode = null;
        nextNode = null;
    }
}
