public class Wolf extends Canine {
    public Wolf(String name) {
        super(name);
        this.type = "Wolf";
    }

    @Override
    public void makeNoise() {
        System.out.println(this.name + " howls like a wolf.");
    }
}
