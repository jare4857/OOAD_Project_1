public class Feline extends Animal {
    public Feline(String name) {
        super(name);
        this.type = "Feline";
    }

    @Override
    public void roam() {
        System.out.println(this.name + " the " + this.type +  " stalks around like a feline.");
    }
}
