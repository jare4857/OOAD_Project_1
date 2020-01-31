public class Tiger extends Feline {
    public Tiger(String name) {
        super(name);
        this.type = "Tiger";
    }

    @Override
    public void makeNoise() {
        System.out.println(this.name + " the " + this.type + " roars like tiger.");
    }
}
