import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
//practice
public class Class {
    public static void main(String[] args) {
        ArrayList<String> books = new ArrayList<>();
        books.add("king kong");
        books.add("Harry Potter");
        books.add("Santa Claus");
        ArrayList<String> books2 = new ArrayList<>();
        books2.add("fighting club");
        books2.add("king kong");
        books2.add("love story");
        ArrayList<String> allBooks = new ArrayList<>();
        allBooks.addAll(books);
        allBooks.addAll(books2);
        System.out.println(allBooks);
        ArrayList<String> withoutDuplicates = new ArrayList<>();
        for (String Value : allBooks) {
            if (!withoutDuplicates.contains(Value)) {
                withoutDuplicates.add(Value);
                System.out.println(withoutDuplicates);
            }
        }
        ArrayList<String> films = new ArrayList<>();
        films.add("the way to happiness");
        films.add("home alone");
        films.add("There is no place for old men");
        films.add("leave beautifully");
        String name = "";
        for (String longest : films) {
            if (longest.length() > name.length()) {
                name = longest;
            }
        }
        System.out.println(name);

        ArrayList<String> food = new ArrayList<>();
        food.add("chicken");
        food.add("juice");
        food.add("pizza");
        food.add("burger");
        food.add("cake");
        food.add("pizza");
        food.add("pizza");
        int i = 0;
        String target = "pizza";
        for (String foods : food) {
            if (foods.equals(target)) {
                i++;
            }
        }
        System.out.println("the number is " + i);

        ArrayList<String> fruit = new ArrayList<>();
        fruit.add("apple");
        fruit.add("banana");
        fruit.add("strawberry");
        fruit.add("peas");
        fruit.removeIf(word -> word.equals("banana"));
        System.out.println(fruit);

        ArrayList<String> color = new ArrayList<>();
        color.add("green");
        color.add("red");
        color.add("yellow");
        color.add("brown");
        color.add("orange");
        Collections.fill(color, "black");
        System.out.println(color);

        ArrayList<String> sport = new ArrayList<>();
        sport.add("Basketball");
        sport.add("volleyball");
        sport.add("football");
        sport.add("Boxing");
        sport.add("judo");
        sport.add("tennis");
        System.out.println(sport);
        ArrayList<String> sport2 = new ArrayList<>();
        sport2.add("football");
        sport2.add("tennis");
        System.out.println(sport2);
        int count = 0;
        ArrayList<String> arrayListSaver = new ArrayList<>(sport2);
        for (String Value2 : sport) {
            if (arrayListSaver.contains(Value2)) {
                count++;
                arrayListSaver.remove(Value2);
            }
        }
        for (int j =0;j<count;j++) {
            System.out.println("there are similar elements");
        }
            ArrayList<String>flowers = new ArrayList<>();
            flowers.add("Rose");
            flowers.add("Lily");
            flowers.add("Tulip");
            flowers.add("Rose");
            flowers.add("Daisy");
int firstIndex = flowers.indexOf("Rose");
int lastIndex = flowers.lastIndexOf("Rose");
            System.out.println("First index of Rose: " + firstIndex);
            System.out.println("Last index of Rose: " + lastIndex);

                ArrayList<String> animals = new ArrayList<>();
                animals.add("Dog");
                animals.add("Cat");
                animals.add("Dog");
                animals.add("Horse");
                animals.add("Cat");
                HashSet<String> uniqueAnimals = new HashSet<>(animals);

                animals.clear();
                animals.addAll(uniqueAnimals);

                System.out.println(animals);

                ArrayList<String> cities = new ArrayList<>();
                cities.add("London");
                cities.add("Paris");
                cities.add("Berlin");

                String[] citiesArray = cities.toArray(new String[0]);

                for (String city : citiesArray) {
                    System.out.println(city);
                }

                Integer[] numbersArray = {1, 2, 3, 4, 5};

                ArrayList<Integer> numbersList =
                        new ArrayList<>(Arrays.asList(numbersArray));

                System.out.println(numbersList);
            }
        }














