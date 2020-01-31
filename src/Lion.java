public class Lion extends Feline {
    public Lion(String name) {
        super(name);
        this.type = "Lion";
    }

    @Override
    public void makeNoise() {
        System.out.println(this.name + " the " + this.type + " roars like a lion.");
    }
}
