package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Main m=new Main();
        m.signalAllWaitingThreads();

        ArrayList<String> s=new ArrayList<>();
        s.add("Amit");
        s.add("Neha");
        s.add("Ravi");
        System.out.println(s);
        System.out.println();
        System.out.println(s.subList(1,2));

        LinkedList<String> l=new LinkedList<>();
        l.add("Write report");
        l.add("Email client");
        l.addFirst("Attend meeting");
        System.out.println(l);
        System.out.println();

        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->(b-a));
        pq.add(30);
        pq.add(10);
        pq.add(20);
        while(!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
        System.out.println();

        HashMap<Integer,String> map=new HashMap<>();
        map.put(101, "Amit");
        map.put(102, "Neha");
        map.put(103, "Ravi");
        System.out.println(map.get(102));
        System.out.println();

        HashSet<String> hs=new HashSet<>();
        hs.add("India");
        hs.add("USA");
        hs.add("India");
        System.out.println(hs);
        System.out.println(hs.removeIf(w-> w.contains("a")));
        System.out.println(hs.spliterator());

        ArrayDeque<String> dq=new ArrayDeque<>();
        dq.add("First");
        dq.addLast("Second");
        dq.addFirst("Zero");
        System.out.println(dq);

        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Grape");

        Iterator<String> it=fruits.iterator();
        System.out.println(it);

    }

    public synchronized void signalAllWaitingThreads() {
        notifyAll();
        System.out.println("All waiting threads have been notified.");
    }
}