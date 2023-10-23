import Model.*;
import Repo.DataRepo;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ex1();
        ex2();
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

    }

    private static void ex4() { // Word counter
        // TODO...

    }

    private static void ex5() { // Sorted word counter
        // TODO...

    }
}
