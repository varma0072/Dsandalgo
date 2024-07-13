package org.example.dsa.singlelinkedlist;

public class SingleLinkedList {
    private  Node head;

    public SingleLinkedList(){
        this.head = null;
    }

    public void insertAtTheBegining(int data){
        Node current = new Node(data);
        if(head == null){
            head = current;
        }else {
            current.next = head;
            head = current;
        }
    }

    public void removeByValue(int data){
        Node current = head;
        if(head == null){
            System.out.println("list is empty");
        }else{
            while(current != null){
                if(current.next.data == data){
                    current.next = current.next.next;
                }
                current = current.next;
            }
        }

    }

    public void insertAtEnd(int data){
        Node newnode = new Node(data);
        Node current = head;
        if(current == null){
            head = newnode;
            return;
        }else{
            while(current != null){
                if(current.next == null){
                    current.next = newnode;
                    return;
                }
               current = current.next;
            }
        }
    }

    public void printAllList(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node current = head;
        while (current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }

}
