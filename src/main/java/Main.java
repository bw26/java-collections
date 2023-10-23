import Model.*;
import Repo.DataRepo;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ex1();
        ex2();
        ex3();
        ex4();
        ex5();
    }

    private static void ex1() { // Range of people
        // TODO...
        ArrayList<Person> people = new ArrayList<Person>();
        for(Person p : DataRepo.getPeople()){
            if (p.getAge() >= 20 && p.getAge()<=40) people.add(p);
        }
        System.out.println(people);
    }

    private static void ex2() { // Average Displacement
        // TODO...
        float sum = 0;
        int count = 0;
        for (Car c : DataRepo.getCarsWithEngines()){
            sum+=c.getEngine().getDisplacment();
            count++;
        }
        System.out.println(sum/count);
    }

    private static void ex3() { // People Uppercase
        // TODO...
        ArrayList<Person> people = DataRepo.getPeople();
        people.forEach(person -> person.setFirstName(person.getFirstName().toUpperCase()));
        people.forEach(person -> person.setLastName(person.getLastName().toUpperCase()));
        System.out.println(people);
    }

    private static void ex4() { // Word counter
        // TODO...
        HashMap<String,Integer> count = new HashMap<String,Integer>();
        for(String s : DataRepo.readFile()){
            if (count.containsKey(s)) count.put(s,count.get(s)+1);
            else count.put(s,1);
        }
        count.forEach((word,c) -> System.out.println(word+" " +c));
    }

    private static void ex5() { // Sorted word counter
        // TODO...
        HashMap<String,Integer> count = new HashMap<String,Integer>();
        for(String s : DataRepo.readFile()) {
            if (count.containsKey(s)) count.put(s, count.get(s) + 1);
            else count.put(s, 1);
        }
        count.entrySet().stream().sorted(Map.Entry.<String,Integer>comparingByValue()).forEach(e -> System.out.println(e.getKey() + " " + e.getValue()));
    }
}
