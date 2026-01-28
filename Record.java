import java.util.ArrayList;
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
ArrayList<String>countriesChecker = new ArrayList<>(countries2);
for(String Value:countries){
    if(countriesChecker.contains(Value)){
        similar = Value;
        countriesChecker.remove(Value);
    }
}
System.out.println("the similar country is "+similar);

ArrayList<String>names = new ArrayList<>();
names.add("Jordan");
names.add("Michel");
names.add("Sara");
names.add("joe");
String shortname = "";
for(String shortest:names){
    if(shortest.length()<shortname.length()){
     shortest = shortname;
    }
}

    }
}
