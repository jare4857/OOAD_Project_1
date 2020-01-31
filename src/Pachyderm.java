public class Pachyderm extends Animal {
    public Pachyderm(String name) {
        super(name);
        this.type = "Pachyderm";
    }

    @Override
    public void roam() {
        System.out.println(this.name + " the " + this.type + " romps around like a pachyderm.");
    }
}
