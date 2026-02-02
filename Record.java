import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
public record Record() {
    public static void main(String[] args) {
        //practice 2
        ArrayList<String> countries = new ArrayList<>();
        countries.add("Kyrgyzstan");
        countries.add("South Korea");
        countries.add("Japan");
        System.out.println(countries);
        ArrayList<String> countries2 = new ArrayList<>();
        countries2.add("London");
        countries2.add("Spain");
        countries2.add("Kyrgyzstan");
        System.out.println(countries2);
        String similar = "";
        ArrayList<String> countriesChecker = new ArrayList<>(countries2);
        for (String Value : countries) {
            if (countriesChecker.contains(Value)) {
                similar = Value;
                countriesChecker.remove(Value);
            }
        }
        System.out.println("the similar country is " + similar);

        ArrayList<String> songs = new ArrayList<>();
        songs.add("Rare");
        songs.add("Rain");
        songs.add("Discover");
        songs.add("untouchable");
        Iterator<String> iterator = songs.iterator();
        while (iterator.hasNext()) {
            String song = iterator.next();
            if (song.length() % 2 == 0) {
                iterator.remove();
            }
        }
        System.out.println(songs);

        ArrayList<String> names = new ArrayList<>();
        names.add("Jordan");
        names.add("Michel");
        names.add("Sara");
        names.add("joe");
        String shortest = names.get(0);
        for (String name : names) {
            if (name.length() < shortest.length()) {
                shortest = name;
            }
        }
        System.out.println("the shortest name is " + shortest);

        ArrayList<String> words = new ArrayList<>();
        words.add("apple");
        words.add("banana");
        words.add("Orange");
        words.add("grape");

        for (int i = 0; i < words.size(); i++) {
            String word = words.get(i);
            word = word.replaceAll("[aeiouAEIOU]", "*");
            words.set(i, word);
        }

        System.out.println(words);

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();
        Iterator<Integer> check = numbers.iterator();
        while(check.hasNext()){
            Integer number = check.next();
            if (number % 2==0){
                even.add(number);
            }else{
                odd.add(number);
            }
        }
        System.out.println("odd "+odd);
        System.out.println("even "+even);

        ArrayList<String>days = new ArrayList<>();
        days.add("monday");
        days.add("tuesday");
        days.add("wednesday");
        days.add("thursday");
        days.add("friday");
        days.add("sunday");
        days.add("saturday");
        int rotateBy = 2;
        for ( int i = 0;i < rotateBy;i++){
            String last = days.get(days.size()-1);
            days.remove(days.size()-1);
            days.add(0,last);
        }
        System.out.println(days);

        ArrayList<String> names2 = new ArrayList<>();
        names2.add("Alex");
        names2.add("Sara");
        names2.add("null");
        names2.add("null");
        names2.add("Bob");
        Iterator<String> it1 = names2.iterator();
        while(it1.hasNext()){
            if(it1.next()=="null"){
                it1.remove();
            }
        }
        System.out.println(names2);

ArrayList<String>films= new ArrayList<>();
films.add("Joker");
films.add("Superman");
films.add("Batman");
films.add("wonderWoman");
Collections.sort(films,(a,b)->a.length()-b.length());
System.out.println("second largest name: "+films.get(films.size()-2));

                ArrayList<String> words2 = new ArrayList<>();
                words2.add("apple");
                words2.add("banana");
                words2.add("sky");

                ArrayList<Integer> result = new ArrayList<>();

                for (String word : words2) {
                    int count = 0;
                    for (char c : word.toLowerCase().toCharArray()) {
                        if ("aeiou".indexOf(c) != -1) {
                            count++;
                        }
                    }
                    result.add(count);
                }

                System.out.println(result);

                ArrayList<ArrayList<String>> departments = new ArrayList<>();
                ArrayList<String> hr = new ArrayList<>();
                hr.add("Alice");
                hr.add("Bob");
                ArrayList<String> it = new ArrayList<>();
                it.add("Charlie");
                it.add("David");
                it.add("Eve");
                ArrayList<String> sales = new ArrayList<>();
                sales.add("Frank");
                sales.add("Grace");
                departments.add(hr);
                departments.add(it);
                departments.add(sales);
                for (int i = 0; i < departments.size(); i++) {
                    ArrayList<String> dept = departments.get(i);
                    System.out.println("Department " + (i + 1) + " Employees: " + dept);
                }
            }
        }





