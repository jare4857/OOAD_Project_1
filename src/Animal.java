public class Animal {
    String name;
    String type = "Animal";

    public Animal(String name){
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void wakeUp(){
        System.out.println(this.name + " the " + this.type + " woke up.");
    }

    public void makeNoise(){
        System.out.println(this.name + " the " + this.type + " makes a noise.");
    }

    public void eat(){
        System.out.println(this.name + " the " + this.type + " eats their food.");
    }

    public void roam(){
        System.out.println(this.name + " the " + this.type + " walks around.");
    }

    public void sleep(){
        System.out.println(this.name + " the " + this.type + " went to sleep.");
    }
}


