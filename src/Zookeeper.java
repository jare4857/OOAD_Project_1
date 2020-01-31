import java.util.List;

public class Zookeeper {

    String name;

    public Zookeeper(String name){
        this.name = name;
    }

    public void wakeUp(List<Animal> animals){
        System.out.println(this.name + " wakes up the animals.");
        for ( Animal i : animals
             ) {
            i.wakeUp();
        }
    }

    public void rollCall(List<Animal> animals){
        System.out.println(this.name + " roll calls the animals");
        for ( Animal i : animals
        ) {
            i.makeNoise();
        }
    }

    public void feedAnimals(List<Animal> animals){
        System.out.println(this.name + " feeds the animals.");
        for ( Animal i : animals
        ) {
            i.eat();
        }
    }

    public void exerciseAnimals(List<Animal> animals){
        System.out.println(this.name + " exercises the animals.");
        for ( Animal i : animals
        ) {
            i.roam();
        }
    }

    public void shutDownZoo(List<Animal> animals){
        System.out.println(this.name + " shuts down the zoo.");
        for ( Animal i : animals
        ) {
            i.sleep();
        }
    }
}
