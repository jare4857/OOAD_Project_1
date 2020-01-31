import java.util.Random;

public class Cat extends Feline {


    Random rand = new Random();

    public Cat(String name) {
        super(name);
        this.type = "Cat";
    }

    @Override
    public void wakeUp() {
        super.wakeUp();
    }

    @Override
    public void eat() {
        int rand_action = rand.nextInt(4);
        if (rand_action == 0){
            super.eat();
        }
        else if (rand_action == 1){
            this.makeNoise();
        }
        else if (rand_action == 2){
            super.roam();
        }
        else {
            super.sleep();
        }
    }

    @Override
    public void makeNoise() {
        int rand_action = rand.nextInt(3);
        if (rand_action == 0){
            System.out.println(this.name + " the " + this.type +  " meows like a cat.");
        }
        else if (rand_action == 1){
            super.roam();
        }
        else {
            super.sleep();
        }
    }

    @Override
    public void roam() {
        int rand_action = rand.nextInt(3);
        if (rand_action == 0){
            super.roam();
        }
        else if (rand_action == 1){
            System.out.println(this.name + " the " + this.type +  " meows like a cat.");
        }
        else {
            super.sleep();
        }
    }

    @Override
    public void sleep() {
        int rand_action = rand.nextInt(3);
        if (rand_action == 0){
            super.sleep();
        }
        else if (rand_action == 1){
            this.makeNoise();
        }
        else {
            super.roam();
        }
    }
}
