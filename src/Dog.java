public class Dog extends Canine {
    public Dog(String name) {
        super(name);
        this.type = "Dog";
    }

    @Override
    public void makeNoise() {
        System.out.println(this.name + " the " + this.type + " barks like a dog.");
    }
}
