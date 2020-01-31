public class Rhino extends Pachyderm {
    public Rhino(String name) {
        super(name);
        this.type = "Rhino";
    }

    @Override
    public void makeNoise() {
        System.out.println(this.name + " the " + this.type + " grunts like Rhino.");
    }
}
