import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        int n;
        n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            numbers.add(num);
        }
        for (int num : numbers) {
            System.out.print(num + " ");

            System.out.println(numbers);
        }
        ArrayList<Integer> numbers2 = new ArrayList<>();
        numbers2.add(7);
        numbers2.add(9);
        numbers2.add(1,8);
        int last = numbers2.get(2);
        System.out.println(last);
        numbers2.set(0,5);
        System.out.println(numbers2);
        System.out.println(numbers2.size());

Arraylist();
simple();
newArraylist();
    }
    public static void Arraylist(){
ArrayList<Integer> numbers = new ArrayList<>();
numbers.add(1);
numbers.add(7);
numbers.add(8);
numbers.add(9);
numbers.add(10);
numbers.remove(1);
numbers.remove(Integer.valueOf(9));
if(numbers.contains(Integer.valueOf(8))) {
    System.out.println("yes");
}
if(!numbers.isEmpty()){
    System.out.println("Not empty");
}
System.out.println(numbers);
System.out.println(numbers.size());
    }
    public static void simple(){
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(12);
        numbers.add(3);
        numbers.add(7);
        numbers.add(1);
        Collections.sort(numbers);
        System.out.println(numbers);
        Collections.sort(numbers,Collections.reverseOrder());
        System.out.println(numbers);
        Collections.shuffle(numbers);
        System.out.println(numbers);
        int minVal= Collections.min(numbers);
        System.out.println(minVal);
        int maxVal=Collections.max(numbers);
        System.out.println(maxVal);
    }
    public static void newArraylist(){
        ArrayList<Integer>zeros = new ArrayList<>(Collections.nCopies(10,0));
        System.out.println(zeros);
    }
}


