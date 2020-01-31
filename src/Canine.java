public class Canine extends Animal {

    public Canine(String name) {
        super(name);
        this.type = "Canine";
    }

    @Override
    public void roam() {
        System.out.println(this.name + " the " + this.type + " runs around like a canine.");
    }
}
