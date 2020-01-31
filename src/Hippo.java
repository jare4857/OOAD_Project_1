public class Hippo extends Pachyderm {
    public Hippo(String name) {
        super(name);
        this.type = "Hippo";
    }

    @Override
    public void makeNoise() {
        System.out.println(this.name + " the " + this.type + " yawns like a hippo.");
    }
}
