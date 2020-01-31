public class Elephant extends Pachyderm {
    public Elephant(String name) {
        super(name);
        this.type = "Elephant";
    }

    @Override
    public void makeNoise() {
        System.out.println(this.name + " the " + this.type + " blares like an elephant.");
    }
}
