package com.oops.collection;

import java.util.*;

public class Collectionsjava {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("gopi");
        System.out.println(arrayList);
        arrayList.add("nath");
        System.out.println(arrayList);
        Collections.addAll(arrayList,"ram","brake","clock");
        System.out.println(arrayList);
        arrayList.remove(1);
        System.out.println(arrayList);
        arrayList.set(0,"mrinal");
        System.out.println(arrayList);
        arrayList.add(1,"sen");
        System.out.println(arrayList);
        arrayList.clear();
        System.out.println(arrayList);
        System.out.println("\n\n\n\n");


        Stack<String> stack = new Stack<>();
        stack.push("gopi");
        System.out.println(stack);
        Collections.addAll(stack,"ram", "sen");
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println("\n\n\n\n");


        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.offer("gopi");
        System.out.println(linkedList);
        Collections.addAll(linkedList,"ram", "sen");
        System.out.println(linkedList);
        linkedList.poll();
        System.out.println(linkedList);
        System.out.println(linkedList.peek());
        System.out.println("\n\n\n\n");


        PriorityQueue<String> priorityQueue = new PriorityQueue<>();
        priorityQueue.offer("sen");
        System.out.println(priorityQueue);
        Collections.addAll(priorityQueue,"ram", "gopi");
        System.out.println(priorityQueue);
        priorityQueue.poll();
        System.out.println(priorityQueue);
        System.out.println(priorityQueue.peek());
        System.out.println("\n\n\n\n");


        ArrayDeque<String> arrayDeque = new ArrayDeque<>();
        arrayDeque.offer("gopi");
        System.out.println(arrayDeque);
        arrayDeque.offerFirst("ram");
        System.out.println(arrayDeque);
        arrayDeque.offerLast("sun");
        System.out.println(arrayDeque);
        Collections.addAll(arrayDeque,"road", "tree","arun");
        System.out.println(arrayDeque);
        arrayDeque.poll();
        System.out.println(arrayDeque);
        System.out.println(arrayDeque.peek());
        System.out.println("\n\n\n\n");


        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("gopi");
        System.out.println(hashSet);
        Collections.addAll(hashSet,"ram","road","tree");
        System.out.println(hashSet);
        hashSet.remove("ram");
        System.out.println(hashSet);
        System.out.println(hashSet.contains("road"));
        System.out.println(hashSet.size());
        System.out.println(hashSet.isEmpty());
        hashSet.clear();
        System.out.println(hashSet.isEmpty());
        System.out.println("\n\n\n\n");

        
        HashMap<String,String> hashMap = new HashMap<>();
        hashMap.put("name","gopi");
        System.out.println(hashMap);
        hashMap.put("roll","10");
        System.out.println(hashMap);
        hashMap.put("stream","bca");
        System.out.println(hashMap);
        System.out.println(hashMap);
        System.out.println(hashMap.containsKey("name"));
        System.out.println(hashMap.containsValue("gopi"));
        System.out.println(hashMap.containsKey("gopi"));
        System.out.println(hashMap.containsValue("name"));
        hashMap.putIfAbsent("name","gopi");
        hashMap.putIfAbsent("gender","male");
        System.out.println(hashMap.entrySet());
        System.out.println(hashMap.keySet());
    }
}
