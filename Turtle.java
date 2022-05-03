public class Turtle extends Animal {
    
    public Turtle(String name, double weight, int speed) {
        super();
        this.setName(name);
        this.setWeight(weight);
        this.setSpeed(speed);
    }

    public String interact() {
        return "S~L~O~W!!!";
    }
}
