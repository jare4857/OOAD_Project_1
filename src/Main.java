import org.w3c.dom.ranges.DocumentRange;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        // print to file came from: https://www.geeksforgeeks.org/redirecting-system-out-println-output-to-a-file-in-java/
        PrintStream o = new PrintStream(new File("dayatthezoo.out"));
        PrintStream console = System.out;
        System.setOut(o);

        List<Animal> zoo_animals = new ArrayList<>();

        Zookeeper zelda = new Zookeeper("Zelda");

        Cat charlie = new Cat("Charlie");
        zoo_animals.add(charlie);
        Cat chloe = new Cat("Chloe");
        zoo_animals.add(chloe);

        Dog daniel = new Dog("Daniel");
        zoo_animals.add(daniel);
        Dog dorothy = new Dog("Dorothy");
        zoo_animals.add(dorothy);

        Elephant ernie = new Elephant("Ernie");
        zoo_animals.add(ernie);
        Elephant elizabeth = new Elephant("Elizabeth");
        zoo_animals.add(elizabeth);

        Hippo harley = new Hippo("Harley");
        zoo_animals.add(harley);
        Hippo herald = new Hippo("Herald");
        zoo_animals.add(herald);

        Lion larry = new Lion("Larry");
        zoo_animals.add(larry);
        Lion lisa = new Lion("Lisa");
        zoo_animals.add(lisa);

        Rhino richie = new Rhino("Richie");
        zoo_animals.add(richie);
        Rhino rachel = new Rhino("Rachel");
        zoo_animals.add(rachel);

        Tiger tony = new Tiger("Tony");
        zoo_animals.add(tony);
        Tiger trish = new Tiger("Trish");
        zoo_animals.add(trish);

        Wolf william = new Wolf("William");
        zoo_animals.add(william);
        Wolf wendy = new Wolf("Wendy");
        zoo_animals.add(wendy);

        zelda.wakeUp(zoo_animals);
        zelda.rollCall(zoo_animals);
        zelda.feedAnimals(zoo_animals);
        zelda.exerciseAnimals(zoo_animals);
        zelda.shutDownZoo(zoo_animals);
    }
}
