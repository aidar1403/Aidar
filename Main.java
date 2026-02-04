import java.util.*;

public class Main {
    public static void main(String[] args){
        //Practice 3
        Scanner scanner = new Scanner (System.in);
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(4);
        set.add(4);
        set.add(5);
        System.out.println(set);
        set.clear();

        HashSet<String>names = new HashSet<>();
        names.add("Karl");
        names.add("Poul");
        names.add("Jason");
        System.out.println("enter a userName");
        String name = scanner.nextLine();
        if(names.contains(name)){
            System.out.println("Allowed");
        }else {
            System.out.println("is not allowed");
        }


        HashSet<Integer>numbers = new HashSet<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        System.out.println(numbers.size());
        numbers.clear();
        System.out.println(numbers.isEmpty());

        HashSet<String> names2 = new HashSet<>();
        names2.add("Polo");
        names2.add("Calvin");
        names2.add("Klein");
        names2.add("Michiel");
        names2.add("Alex");
        boolean removed = names2.remove("Polo");
        System.out.println(removed);
        System.out.println(names2);

        HashSet<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        HashSet<Integer> set2 = new HashSet<>();
        set2.add(4);
        set2.add(5);
        set2.add(6);
        set1.addAll(set2);
        System.out.println(set1);

        HashSet<Integer>setA = new HashSet<>();
        setA.add(12);
        setA.add(15);
        setA.add(18);
        setA.add(21);
        setA.add(24);
        HashSet<Integer>setB = new HashSet<>();
        setB.add(12);
        setB.add(14);
        setB.add(16);
        setB.add(18);
        setB.add(20);
        setA.removeAll(setB);
        System.out.println(setA);

        HashSet<Integer>setX = new HashSet<>();
        setX.add(1);
        setX.add(2);
        setX.add(3);
        setX.add(4);
        setX.add(5);
        HashSet<Integer>setY = new HashSet<>();
        setY.add(2);
        setY.add(3);
        setY.add(4);
        setX.retainAll(setY);
        System.out.println(setX);

        HashSet<String>SetA = new HashSet<>();
        SetA.add("apple");
        SetA.add("banana");
        SetA.add("pea");
        HashSet<String>SetB = new HashSet<>();
        SetB.add("apple");
        SetB.add("banana");
        SetB.add("pea");
        if (SetA.containsAll(SetB)){
            System.out.println("All coincide!");
        }
        System.out.println("enter your sentence");
        String sentence = scanner.nextLine();
        String [] words = sentence.split(" ");
        HashSet<String> uniqueWords = new HashSet<>();
        for (String word:words){
            uniqueWords.add(word);
        }
        System.out.println("unique words");
        for (Iterator<String> iterator = uniqueWords.iterator(); iterator.hasNext(); ) {
            String word = iterator.next();
            System.out.println(word);

            String sentence2 = "Apple apple APPLE Banana BANANA orange";
            String[] words2 = sentence2.split(" ");

            HashSet<String> uniqueWords2 = new HashSet<>();
            for (String w : words2) {
                uniqueWords.add(w.toLowerCase());
            }
            System.out.println(uniqueWords2);


            ArrayDeque<Integer> queue = new ArrayDeque<>();
            queue.offer(10);
            queue.offer(20);
            queue.offer(30);
            while (!queue.isEmpty()) {
                System.out.println("Peek: " + queue.peek());
                System.out.println("Poll: " + queue.poll());
            }

            ArrayDeque<String> stack = new ArrayDeque<>();
            stack.push("One");
            stack.push("Two");
            stack.push("Three");
            while (!stack.isEmpty()) {
                System.out.println(stack.pop());
            }

            ArrayDeque<Integer> deque = new ArrayDeque<>();
            deque.addFirst(2);
            deque.addLast(3);
            deque.addFirst(1);
            deque.addLast(4);
            for (int n : deque) {
                System.out.print(n + " ");
            }
            System.out.println();

            ArrayDeque<Integer> deque2 = new ArrayDeque<>();
            System.out.println(deque2.offerFirst(100));
            System.out.println(deque2.offerLast(200));
            System.out.println(deque2);

            ArrayDeque<String> dq = new ArrayDeque<>();
            dq.add("A");
            dq.add("B");
            dq.add("C");
            System.out.println(dq.peek());
            System.out.println(dq.peekFirst());
            System.out.println(dq.peekLast());
            dq.clear();
            System.out.println(dq.peek());

            ArrayDeque<String> dq2 = new ArrayDeque<>();
            dq2.add("X");
            dq2.add("Y");
            dq2.add("Z");
            while (!dq2.isEmpty()) {
                System.out.println(dq2.pollFirst());
            }


            ArrayDeque<String> dq3 = new ArrayDeque<>(
                    Arrays.asList("a", "b", "c", "b", "a")
            );
            dq3.removeFirstOccurrence("b");
            dq3.removeLastOccurrence("a");
            System.out.println(dq3);

            ArrayDeque<Integer> dq4 = new ArrayDeque<>();
            System.out.println(dq4.isEmpty());
            dq4.add(1);
            dq4.add(2);
            System.out.println(dq4.size());
            dq4.poll();
            System.out.println(dq4.size());

            ArrayDeque<String> dq5 = new ArrayDeque<>();
            dq5.add("Hello");
            dq5.add("World");
            dq5.clear();
            System.out.println(dq5.peek());
            System.out.println(dq5.isEmpty());

            String word2 = "level";
            ArrayDeque<Character> chars = new ArrayDeque<>();
            for (char c : word2.toCharArray()) {
                chars.add(c);
            }

            boolean isPalindrome = true;
            while (chars.size() > 1) {
                if (chars.pollFirst() != chars.pollLast()) {
                    isPalindrome = false;
                    break;
                }
            }

            System.out.println(word + " -> " + isPalindrome);
        }
    }

}



