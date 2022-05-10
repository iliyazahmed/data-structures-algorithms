package com.tns.QueueInterface;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

public class WorkingWithQueues {  //First in First out (FIFO)

    String customerName;
    int customerAge;

    public WorkingWithQueues(String customerName, int customerAge) {
        this.customerName = customerName;
        this.customerAge = customerAge;
    }

    @Override
    public String toString() {
        return "WorkingWithQueues{" +
                "customerName='" + customerName + '\'' +
                ", customerAge=" + customerAge +
                '}';
    }
    private static void queuesClass(String customerName,int customerAge){
        Queue<WorkingWithQueues> workingWithQueues = new LinkedList<>();
        workingWithQueues.add(new WorkingWithQueues(customerName,customerAge));
        workingWithQueues.add(new WorkingWithQueues(customerName,customerAge));
        workingWithQueues.add(new WorkingWithQueues(customerName,customerAge));

        System.out.println(workingWithQueues.size());
        System.out.println(workingWithQueues.peek()); // first element prints
        System.out.println(workingWithQueues.poll()); // first element removes
        System.out.println(workingWithQueues.size());
        System.out.println(workingWithQueues.peek());
    }

    private static void linkedListClass(String customerName,int customerAge){

        LinkedList<WorkingWithQueues> workingWithQueuesList = new LinkedList<>();
        workingWithQueuesList.add(new WorkingWithQueues(customerName,customerAge));
        workingWithQueuesList.addFirst(new WorkingWithQueues(customerName,customerAge));
        workingWithQueuesList.addLast(new WorkingWithQueues(customerName,customerAge));

        ListIterator<WorkingWithQueues> listIterator  =workingWithQueuesList.listIterator();
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
        System.out.println("*******************************");
        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }
    }
    public static void main(String[] args) {
//      queuesClass("Mohan",24);
//      queuesClass("Praveen",24);
//      queuesClass("Manoj",23);
        Queue<WorkingWithQueues> workingWithQueues = new LinkedList<>();
        workingWithQueues.add(new WorkingWithQueues("Mohan",24));
        workingWithQueues.add(new WorkingWithQueues("Praveen",24));
        workingWithQueues.add(new WorkingWithQueues("Manoj",23));

        System.out.println(workingWithQueues.size());
        System.out.println(workingWithQueues.peek()); // first element prints
        System.out.println(workingWithQueues.poll()); // first element removes
        System.out.println(workingWithQueues.size());
        System.out.println(workingWithQueues.peek());

        System.out.println("******Linked List is Started***************");
//      linkedListClass("Kohli",32);
//      linkedListClass("dhoni",40);
//      linkedListClass("kane",32);
        LinkedList<WorkingWithQueues> workingWithQueuesList = new LinkedList<>();
        workingWithQueuesList.add(new WorkingWithQueues("kohli",32));
        workingWithQueuesList.addFirst(new WorkingWithQueues("dhoni",40));
        workingWithQueuesList.addLast(new WorkingWithQueues("kane",32));

        ListIterator<WorkingWithQueues> listIterator  =workingWithQueuesList.listIterator();
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
        System.out.println("*******************************");
        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }

    }

}
